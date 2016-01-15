/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

import java.util.ArrayList;
import java.util.Random;
import static NapakalakiGame.CombatResult.*;

/**
 *
 * @author nitrosito
 */
public class Napakalaki {
    
    private Monster currentMonster;
    private CardDealer dealer;
    private Player currentPlayer;
    private ArrayList<Player> players;

        

    
    //Private
    private static final Napakalaki instance = new Napakalaki();
    
    Napakalaki(){
        currentMonster=null;
        dealer=CardDealer.getInstance();
        currentPlayer=null;
        players=new ArrayList();
    }

    public static Napakalaki getInstance(){
        return instance;
    }
    
    private void initPlayers(ArrayList<String> nombres){
        for (String nombre : nombres) {
            Player aux = new Player(nombre);
            players.add(aux);
        }
    }
    
    private Player nextPlayer(){
        if(currentPlayer==null){ // si es la primera jugada
            Random rnd = new Random();
            int numero;                             //random number njug y 0
                numero = (int)(rnd.nextDouble() * (players.size()) + 0);
            currentPlayer=players.get(numero);
            return players.get(numero);
        }
        
        // si no es la primera jugada y le toca al ultimo
        if(currentPlayer == players.get(players.size()-1)){ // Si le toca al ultimo
           currentPlayer = players.get(0);
           return players.get(0); // devolvemos el 1º
        }
        
        // si le toca al ultimo , devolvemos siguiente
        int nplayer = players.indexOf(currentPlayer);
        currentPlayer = players.get(nplayer+1);
        return players.get(nplayer+1);    
    }

    
    private boolean nextTurnAllowed(){ // #FIXME #PARCHACO #CHAPUZA #PREGUNTAR #TODO
                if(currentPlayer == null)
            return true;
            
            return currentPlayer.validState();
    }

   
   
    public void initGame(ArrayList<String> players){
        this.initPlayers(players);
        this.setEnemies();
        dealer.initCards();   
        this.nextTurn();
    }
    
    private void setEnemies(){
         int ind = (int)(Math.random()*players.size());
         for(int i = 0; i < players.size(); i++){
         while(ind == i)
            ind = (int)(Math.random()*players.size());
         players.get(i).setEnemy(players.get(ind));
        }
    }
   
    
    public CombatResult developCombat(){
        CombatResult resultadocombate;
        resultadocombate=currentPlayer.combat(currentMonster);
        if(resultadocombate==CombatResult.LOSEANDCONVERT){
            Cultist carta= dealer.nextCultist();
            CultistPlayer jugador = new CultistPlayer(currentPlayer, carta);
            int posicionjugador = players.indexOf(currentPlayer);
            for (Player player : players) {
                if(player.getEnemy()==currentPlayer)
                    player.setEnemy(jugador);
            }
            currentPlayer = jugador;
            players.set(posicionjugador, jugador);
        }
        dealer.giveMonsterBack(currentMonster);
        return resultadocombate;
    }
    
    public void discardVisibleTreasures(ArrayList<Treasure> treasures){
        for (Treasure treasure: treasures){
            currentPlayer.discardVisibleTreasure(treasure);
            dealer.giveTreasureBack(treasure);
        }
    }
    
    public void discardHiddenTreasures(ArrayList<Treasure> treasures){
        for(Treasure treasure: treasures){
            currentPlayer.discardHiddenTreasure(treasure);
            dealer.giveTreasureBack(treasure);
        }
    }
    
    public void makeTreasuresVisible(ArrayList<Treasure> treasures){
       for(Treasure treasure: treasures){
           currentPlayer.makeTreasureVisible(treasure);
       }         
    }
    
    public Player getCurrentPlayer(){
        return currentPlayer;
    }
    
    public Monster getCurrentMonster(){
        return currentMonster;
    }

    public boolean nextTurn(){
        boolean stateOK = nextTurnAllowed();
        
        if(stateOK){
           currentMonster = dealer.nextMonster();
           currentPlayer = nextPlayer();
           boolean dead = currentPlayer.isDead();
           
           if(dead){
               currentPlayer.initTreasures();
           }
        }
        return stateOK;
    }

    
    public boolean endOfGame(CombatResult result){
        return result==WINGAME;
    }
    
    
   
    
}

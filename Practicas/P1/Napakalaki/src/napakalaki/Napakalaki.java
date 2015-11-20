/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Random;
import static napakalaki.CombatResult.WINGAME;

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
    
    private Napakalaki(){
        currentMonster=null;
        dealer=null;
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

//    
//    private boolean nextTurnAllowed(){
//        //
//    }
//    
//    private void setEnemies(){
//        //
//    }
//    
//    
//    public CombatResult developCombat(){
//        //
//    }
//    
//    public void discardVisibleTreasures(ArrayList<Treasure> treasures){
//        //
//    }
//    
//    public void discardHiddenTreasures(ArrayList<Treasures> treasures){
//        //
//    }
//    
//    public void makeTreasuresVisible(ArrayList<Treasures> treasures){
//        //
//    }
//    
//    public void initGame(ArrayLIst<String> players){
//        //
//    }
//    
    public Player getCurrentPlayer(){
        return currentPlayer;
    }
    
    public Monster getCurrentMonster(){
        return currentMonster;
    }
//    
//    public boolean nextTurn(){
//        //
//    }
//    
    public boolean endOfGame(CombatResult result){
        if(result==WINGAME){
            return true;
        }
        return false;
    }
    
    
    
    
        
//Public
    
}

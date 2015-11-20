/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
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
//    
//    private Player nextPlayer(){
//        ///
//    }
//    
    private boolean nextTurnAllowed(){
        if(currentPlayer.validState()){
            return true;
        }
        return false;
    }
    
    private void setEnemies(){
         int ind = (int)(Math.random()*players.size());
         for(int i = 0; i < players.size(); i++){
         while(ind == i)
            ind = (int)(Math.random()*players.size());
         players.set(i, players.get(ind));
 }

    }
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
        return result==WINGAME;
    }
    
    
    
    
        
//Public
    
}

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
       for(int i=0; i< nombres.size();i++){
           Player aux= new Player(nombres.get(i));
           players.add(aux);
       }
    }
//    
//    private Player nextPlayer(){
//        ///
//    }
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

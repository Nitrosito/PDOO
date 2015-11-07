/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author nitrosito
 */
public class Napakalaki {
    
    private Monster currentMonster;
    private CardDealer dealer;
    private Player currentPlayer;
    private Player players;

        

    
    //Private
    private static final Napakalaki instance = new Napakalaki();
    
    private Napakalaki(){
     // Aqui va la asignación de valores, etc
    }

    public static Napakalaki getInstance(){
        return instance;
    }
    
    private void initPlayers(ArrayList<String> nombres){
       ///
    }
    
    private Player nextPlayer(){
        ///
    }
    
    private boolean nextTurnAllowed(){
        //
    }
    
    private void setEnemies(){
        //
    }
    
    
    public CombatResult developCombat(){
        //
    }
    
    public void discardVisibleTreasures(Treasure treasures){
        //
    }
    
    public void discardHiddenTreasures(Treasures treasures){
        //
    }
    
    public void makeTreasuresVisible(Treasures treasures){
        //
    }
    
    public void initGame(string players){
        //
    }
    
    public Player getCurrentPlayers(){
        //
    }
    
    public Monster getCurrentMonster(){
        //
    }
    
    public boolean nextTurn(){
        //
    }
    
    public boolean endOfGame(CombatResult result){
        //
    }
    
    
    
    
        
//Public
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author nitrosito
 */
public class CardDealer {
    //Private
    private static final CardDealer instance = new CardDealer();
    private Treasure usedTreasures;
    private Treasure unusedTreasures;
    private Monster usedMonster;
    private Monster unusedMonster;
    
    
    private CardDealer(){
     // Aqui va la asignación de valores, etc
    }

    private static CardDealer getInstance(){
        return instance;
    }
    
    private void initTreasureCardDeck(){
        //
    }
    
    private void initMonsterCardDeck(){
        //
    }
    
    private void shuffleTreasure(){
        //
    }
    
    private void shuffleMonster(){
        //
    }
    
    public CardDealer getinstance(){
        //
    }
    
    //Public    
    public Treasure nextTreasure(){
        //
    }
    
    public Monster nextMonster(){
        //
    }
    
    public void giveTreasureBack(Treasure t){
        //
    }
    
    public void giveMonsterBack(Monster m){
        //
    }
    
    public void initCards(){
        //
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author nico
 */

public class Player {
   private String name;
   private int level;
   private boolean dead=true;
   private boolean canlSteal=true;
   private Player enemy;
   private ArrayList<Treasure> hiddenTreasures;
   private ArrayList<Treasure> visibleTreasures;
   private BadConsequence pendingBadConsequence;
   
   static final int MAXLEVEL=10;
   
   public Player(String name){
   }
   
   public String getName(){
       return name;
   }
   
   private void bringToLife(){
       dead=true;
   }
   
   private int getCombatLevel(){
       int combatLevel;
       int bonus=0;
       
       for (Treasure visibleTreasure : visibleTreasures) {
           bonus = bonus + visibleTreasure.getBonus();
       }
       
       combatLevel=level+bonus;
       return combatLevel;
   }
   
   private void incrementLevels(int i){
       level=level+i;
       if(level>10){
           level=10;
       }
   }
   
   private void decrementLevels(int i){
       level=level-i;
       if(level<1){
           level=1;
       }
   }
   
   private void setPendingBadConsequence(BadConsequence b){
       pendingBadConsequence=b;
   }
   
   private void applyPrize(Monster m){
   }
   
   private void applyBadConsequence(Monster m){
   }
   
   private boolean canMakeTreasureVisible(Treasure t){
   }
   
   private int howManyVisibleTreasures(TreasureKind tKind){
   }
   
   private void dielNoTreasures(){
       if(visibleTreasures.size()==0 && hiddenTreasures.size()==0){
           dead=false;
       }
   }
   
   public boolean isDead(){
       return dead;
   }
   
   public Treasure[] getHiddenTreasure(){
   }
   
   public Treasure[] getVisibleTreasure(){
   }
   
   public CombatResult combat(Monster m){
   }
   
   public void makeTreasureVisible(Treasure t){
   }
   
   public void discardVisibleTreasure(Treasure t){
   }
   
   public void discardHiddenTreasure(Treasure t){
   }
   
   public boolean validState(){
       if(hiddenTreasures.size()<=4 && pendingBadConsequence.isEmpy()){
           return true;
       }
       return false;
   }
   
   public void initTreasure(){
   }
   
   public int getLevels(){
       return level;
   }
   
   public Treasure stealTreasure(){
   }
   
   public void setEnemy(Player enemy){
       this.enemy=enemy;
   }
   
   private Treasure giveMeATreasure(){
   }
   
   public boolean canlSteal(){
   }
   
   private boolean canYouGiveMeATreasure(){
   }
   
   private void haveStolen(){
   }
   
   public void descardAllTreasures(){
   }
}

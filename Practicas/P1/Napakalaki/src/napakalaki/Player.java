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
   
   static final int MAXLEVEL=10;
   
   public Player(String name){
   }
   
   public String getName(){
       return name;
   }
   
   private void bringToLife(){
   }
   
   private int getCombatLevel(){
       return level;
   }
   
   private void incrementLevels(int i){
   }
   
   private void decrementLevels(int i){
   }
   
   private void setPendingBadConsequence(BadConsequence b){
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
   }
   
   public boolean isDead(){
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
   }
   
   public void initTreasure(){
   }
   
   public int getLevels(){
       return level;
   }
   
   public Treasure stealTreasure(){
   }
   
   public void setEnemy(Player enemy){
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

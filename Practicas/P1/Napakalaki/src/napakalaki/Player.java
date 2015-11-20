/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author nico
 */

public class Player {
   private String name;
   private int level=1;
   private boolean dead=true;
   private boolean canISteal=true;
   private Player enemy;
   private ArrayList<Treasure> hiddenTreasures=new ArrayList();
   private ArrayList<Treasure> visibleTreasures=new ArrayList();
   private BadConsequence pendingBadConsequence;
   
   static final int MAXLEVEL=10;
   
   public Player(String name){
   }
   
   public String getName(){
       return name;
   }
   
   private void bringToLife(){
       dead=false;
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
   
  // private boolean canMakeTreasureVisible(Treasure t){
   //}
   
  // private int howManyVisibleTreasures(TreasureKind tKind){
   //}
   
   private void dielNoTreasures(){
       if(visibleTreasures.size()==0 && hiddenTreasures.size()==0){
           dead=false;
       }
   }
   
   public boolean isDead(){
       return dead;
   }
   
  // public ArrayList<Treasure> getHiddenTreasure(){
   //}
   
   //public ArrayList<Treasure> getVisibleTreasure(){
   //}
   
   //public CombatResult combat(Monster m){
  // }
   
   public void makeTreasureVisible(Treasure t){
   }
   
   public void discardVisibleTreasure(Treasure t){
   }
   
   public void discardHiddenTreasure(Treasure t){
   }
   
   public boolean validState(){
       if(hiddenTreasures.size()<=4 && pendingBadConsequence.isEmpty()){
           return true;
       }
       return false;
   }
   
   public void initTreasures(){
   }
   
   public int getLevels(){
       return level;
   }
   
   //public Treasure stealTreasure(){
   //}
   
   public void setEnemy(Player enemy){
       this.enemy=enemy;
   }
   
   private Treasure giveMeATreasure(){  
        Random rnd = new Random();
        int numero;                             
            numero = (int)(rnd.nextDouble() * (hiddenTreasures.size()) + 0); // Cogemos aleatorio
            Treasure aux = hiddenTreasures.get(numero); // lo guardamos
            hiddenTreasures.remove(numero); // lo borramos de los invisibles
            return aux; // Devolvemos el guardado
   }
   
   public boolean canISteal(){
       return canISteal;
   }
   
   private boolean canYouGiveMeATreasure(){
       return !hiddenTreasures.isEmpty();
   }
   
   private void haveStolen(){
       canISteal=false;
   }
   
   public void discardAllTreasures(){
   }
}

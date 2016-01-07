/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

import java.util.ArrayList;
import java.util.Random;
import static NapakalakiGame.CombatResult.*;
import static NapakalakiGame.TreasureKind.*;
import sun.security.util.PendingException;

/**
 *
 * @author nico
 */

public class Player {
   private String name;
   private int level;
   private boolean dead;
   private boolean canISteal;
   private Player enemy;
   private ArrayList<Treasure> hiddenTreasures;
   private ArrayList<Treasure> visibleTreasures;
   private BadConsequence pendingBadConsequence;
   
   static final int MAXLEVEL=10;
   
   public Player(String name){
       level=1;
       dead=true;
       canISteal=true;
       this.name=name;
       pendingBadConsequence=new NumericBC("", 0,0,0);
       hiddenTreasures= new ArrayList<>();
       visibleTreasures = new ArrayList<>();
   }
   
      /** @TODO revisar */
   public Player(Player p){
   name=p.name;
   level=p.level;
   dead=p.dead;
   canISteal=p.canISteal;
   enemy=p.enemy;
   hiddenTreasures= p.hiddenTreasures;
   visibleTreasures= p.visibleTreasures;
   pendingBadConsequence= p.pendingBadConsequence;
   }
  
   public String getName(){
       return name;
   }
   
   protected Player getEnemy(){
       return enemy;
   }
   
   public String toString(){
       return "Nombre jugador: " + this.name;
   }
   
   private void bringToLife(){
       dead=false;
   }
   
   protected int getCombatLevel(){
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
       int nLevels = m.getLevelsGained();
       incrementLevels(nLevels);
       int nTreasures = m.getTreasuresGained();
       if(nTreasures >0){
           CardDealer dealer = CardDealer.getInstance();
           for(int i=0; i<nTreasures; i++){
               Treasure aux;
               aux= dealer.nextTreasure();
               hiddenTreasures.add(aux);
           }
           
       }
   }
   
   private void applyBadConsequence(Monster m){
       BadConsequence badConsequence = m.getBadconsequence();
       int nLevels = badConsequence.getLevels();
       decrementLevels(nLevels);
       BadConsequence pendingBad = badConsequence.adjustToFitTreasureLists(visibleTreasures, hiddenTreasures);
       setPendingBadConsequence(pendingBad);
   }
   
   private boolean canMakeTreasureVisible(Treasure t){
       int numero_ONEHAND=0;
       int numero_BOTHHANDS=0;
       int numero_ARMOR=0;
       int numero_SHOES=0;
       int numero_HELMET=0;
       for (Treasure aux : visibleTreasures) {
           if(aux.getType() == ONEHAND){
               numero_ONEHAND++;
           }else if(aux.getType() == BOTHHANDS){
               numero_BOTHHANDS++;
           }else if(aux.getType() == ARMOR){
               numero_ARMOR++;
           }else if(aux.getType() == SHOES){
               numero_SHOES++;
           }else{
               numero_HELMET++;
           }
       }
       if(t.getType()==ONEHAND){
           if(numero_ONEHAND==2){
               return false;
           }else return numero_BOTHHANDS != 1;
       }else if(t.getType()==BOTHHANDS){
           if(numero_BOTHHANDS==1){
               return false;
           }else return numero_ONEHAND == 0;
       }else if(t.getType()==ARMOR){
           return numero_ARMOR != 1;
       }else if(t.getType()==SHOES){
           return numero_SHOES != 1;
       }else{
           return numero_HELMET != 1;
       }
   }
   
   private int howManyVisibleTreasures(TreasureKind tKind){
       int ntesoros=0;
       for(Treasure tesoros:visibleTreasures){
           if(tesoros.getType()==tKind)
               ntesoros+=1;
       }
       return ntesoros;
   }
   
   private void dielNoTreasures(){
       if(visibleTreasures.size()==0 && hiddenTreasures.size()==0){
           dead=true;
       }
   }
   
   public boolean isDead(){
       return dead;
   }
   
public ArrayList<Treasure> getHiddenTreasures(){
    return hiddenTreasures;
}
   
public ArrayList<Treasure> getVisibleTreasures(){
    return visibleTreasures;
}
   
   public CombatResult combat(Monster m){
       int myLevel=getCombatLevel();
       int monsterLevel=this.getOponentLevel(m);
       if(myLevel>monsterLevel){
           applyPrize(m);
           if(level>=MAXLEVEL){
               return WINGAME;
           }else{
               return WIN;
           }
       }else{
           applyBadConsequence(m);
           if(this.shouldConvert())
               return LOSEANDCONVERT;
           
           return LOSE;
       }
   }
   
   public void makeTreasureVisible(Treasure t){
       boolean canI=canMakeTreasureVisible(t);
       if(canI){
           visibleTreasures.add(t);
           hiddenTreasures.remove(t);
       }
   }
   
   public void discardVisibleTreasure(Treasure t){
       visibleTreasures.remove(t);
       
       if(pendingBadConsequence!=null && !pendingBadConsequence.isEmpty())
           pendingBadConsequence.substractVisibleTreasure(t);
   
       dielNoTreasures();
   }
   
   public void discardHiddenTreasure(Treasure t){
       hiddenTreasures.remove(t);
       
       if(pendingBadConsequence!=null && !pendingBadConsequence.isEmpty())
           pendingBadConsequence.substractHiddenTreasure(t);
       
       dielNoTreasures();
   }
   
   public boolean validState(){
       if(hiddenTreasures.size()<=4 && pendingBadConsequence.isEmpty()){
           return true;
       }
       return false;
   }
   
   public void initTreasures(){
       CardDealer dealer= CardDealer.getInstance();
       Dice dice= Dice.getInstance();
       bringToLife();
       Treasure treasure=dealer.nextTreasure();
       hiddenTreasures.add(treasure);
       int number = dice.nextNumber();
       
       if(number>1){
           Treasure treasure1 = dealer.nextTreasure();
           hiddenTreasures.add(treasure1);
       }
       
       if(number==6){
           Treasure treasure1= dealer.nextTreasure();
           hiddenTreasures.add(treasure1);
       }
   }
   
   public int getLevels(){
       return level;
   }
   
   public Treasure stealTreasure(){
       boolean canI = canISteal();
       if(canI){
           boolean canYou = enemy.canYouGiveMeATreasure();
           if(canYou){
               Treasure treasure = enemy.giveMeATreasure();
               hiddenTreasures.add(treasure);
               haveStolen();
               return treasure;
           }
       }
       return null;
   }
   
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
       ArrayList<Treasure> vcopia = new ArrayList(visibleTreasures);
       for(int i=0; i < vcopia.size();i++){
           discardVisibleTreasure(vcopia.get(i));
       }
       
       ArrayList<Treasure> hcopia = new ArrayList(hiddenTreasures);
       for(int i=0; i< hcopia.size();i++){
           discardHiddenTreasure(hcopia.get(i));
       }
   }
   

   
   protected int getOponentLevel(Monster m){
       return m.getCombatLevel();
   }
   
   protected boolean shouldConvert(){
       Dice dice = Dice.getInstance();

       if(dice.nextNumber()==1)
           return true;
       
       return false;
   }
   

}

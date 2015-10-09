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
public class Monster {
    private String name;
    private int combatLevel;
    private Prize prize;
    private BadConsequence badconsecuence;
    
    
    
    public String getName(){
            return name;
    }
    
    
    public int getCombatLevel(){
            return combatLevel;
    }
    
    Monster(String name, int level, BadConsequence bc, Prize price){
            this.name=name;
            this.combatLevel=level;
            this.badconsecuence=bc;
            this.prize=price;
    }
    
    public String toString(){
        return "Monstruo; Nombre:" + this.name + "Nivel combate" + Integer.toString(combatLevel)+ this.prize.toString() +
                this.badconsecuence.toString();
    }
}


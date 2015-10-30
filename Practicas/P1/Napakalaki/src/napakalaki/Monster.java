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
    private Region region;
    
    public Region getRegion(){
        return region;
    }
    
    public void setRegion(Region unaregion){
        region=unaregion;
    }
    
    public String getName(){
            return name;
    }
    
    
    public int getCombatLevel(){
            return combatLevel;
    }
    
    public Prize getPrize(){
            return prize;
    }
    
    public BadConsequence getBadconsequence(){
            return badconsecuence;
    }

    Monster(String name, int level, BadConsequence bc, Prize price,Region unaregion){
            this.name=name;
            this.combatLevel=level;
            this.badconsecuence=bc;
            this.prize=price;
            this.region=unaregion;
    }
    
    public String toString(){
        return "Nombre Monstruo:" + this.name + "\n       Region:"+ this.getRegion().getName() +
                "\n       Temperatura:"+ this.getRegion().getTemperature() + "\n       Nivel combate: " +
                Integer.toString(combatLevel)+ this.prize.toString() +
                this.badconsecuence.toString();
    }
}


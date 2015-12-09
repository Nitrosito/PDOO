/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

/**
 *
 * @author nitrosito
 */
public class Monster {
    private String name;
    private int combatLevel;
    private Prize prize;
    private BadConsequence badconsecuence;
    private int levelChangeAgainstCultistPlayer;
    
    
    
    public String getName(){
            return name;
    }
    
    
    public int getCombatLevel(){
            return combatLevel;
    }
    
    
    public BadConsequence getBadconsequence(){
            return badconsecuence;
    }

    Monster(String name, int level, BadConsequence bc, Prize price){
            this.name=name;
            this.combatLevel=level;
            this.badconsecuence=bc;
            this.prize=price;
            this.levelChangeAgainstCultistPlayer=0;
    }
    
    public Monster(String n, int l, BadConsequence badConsequence, Prize p, int lC){
        name=n;
        combatLevel=l;
        this.badconsecuence=badConsequence;
        prize = p;
        levelChangeAgainstCultistPlayer=lC;
    }
    
    public int getCombatLevelAgainstCultistsPlayer(){
        return levelChangeAgainstCultistPlayer;
    }
    
    public String toString(){
        return "Nombre Monstruo:" + this.name + "\n       Nivel combate: " + Integer.toString(combatLevel)+ this.prize.toString() +
                this.badconsecuence.toString();
    }
    
    public int getLevelsGained(){
        return prize.getLevel();
    }
    
    public int getTreasuresGained(){
        return prize.getTreasures();
    }
}


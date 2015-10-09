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
public class BadConsequence {
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
            this.text=text;
            this.levels=levels;
            this.nVisibleTreasures=nVisible;
            this.nHiddenTreasures=nHidden;
    }
    
    public BadConsequence(String text,boolean death ){
        this.text=text;
        this.death=death;
    }
    
    public String getText(){
            return text;
    }
    
    public int getLevels(){
            return levels;
    }
        
}

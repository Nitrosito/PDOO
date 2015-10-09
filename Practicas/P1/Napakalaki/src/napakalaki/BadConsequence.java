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
public class BadConsequence {
    private ArrayList<TreasureKind> specificHiddenTreasures= new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures= new ArrayList();

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
    
    public BadConsequence(String text,boolean death){
        this.text=text;
        this.death=death;
    }
    
    public String getText(){
            return text;
    }
    
    public int getLevels(){
            return levels;
    }
    
    public int getnVisibleTreasures(){
        return nVisibleTreasures;
    }
    
    public int getnHiddenTreasures(){
        return nHiddenTreasures;
    }
    
    public boolean getDeath(){
        return death;
    }

    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden) {
        this.text=text;
        this.levels=levels;
        this.specificVisibleTreasures=tVisible;
        this.specificHiddenTreasures=tHidden;

    }
    
    public String toString(){
        return "Badconsecuence; " + this.text + "Niveles: " + Integer.toString(this.levels) 
                + "Tesoros Visibles " + Integer.toString(this.nVisibleTreasures) +
                "Tesoros No Visibles " + Integer.toHexString(this.nHiddenTreasures) +
                "Muerte " + this.death;
    }
    
    
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;
import java.util.ArrayList;

/**
 *
 * @author nitrosito
 */
public abstract class BadConsequence {

    String text;
    int levels;
    static final int MAXTREASURES =10;
    
    public abstract boolean isEmpty();
    
    
    public int getLevels(){
            return levels;
    }
    
    
    
    abstract void substractVisibleTreasure(Treasure t);
    
     abstract void substractHiddenTreasure(Treasure t);
    
    
    public String getText(){
            return text;
    }
   
    
    public BadConsequence(String text, int levels){
            this.text=text;
            this.levels=levels;
    }
    
        
    public abstract BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h);
    
    
    public abstract String toString();
    
    
        
}

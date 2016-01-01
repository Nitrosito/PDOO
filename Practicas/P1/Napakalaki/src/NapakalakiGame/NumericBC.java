/*
 * Copyright (C) 2015 nico
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package NapakalakiGame;

import java.util.ArrayList;

/**
 *
 * @author nico
 */
public class NumericBC extends BadConsequence{
    private int nVisibleTreasures;
    private int nHiddenTreasures;

    public NumericBC(String text, int levels, int nVisible, int nHidden) {
        super(text, levels);
        nVisibleTreasures=nVisible;
        nHiddenTreasures=nHidden;
    }
    
    public int getnVisibleTreasures(){
        return nVisibleTreasures;
    }
    
    
    public int getnHiddenTreasures(){
        return nHiddenTreasures;
    }
    
    public boolean isEmpty(){
        if(nVisibleTreasures==0 && nHiddenTreasures==0 ){
            return true;
        }
        return false;
    }
    
    void substractVisibleTreasure(Treasure t){
        if (nVisibleTreasures > 0)
            nVisibleTreasures -= 1;
    }
    
    void substractHiddenTreasure(Treasure t){
         if (nHiddenTreasures > 0)
            nHiddenTreasures -= 1;
    }
    
    public NumericBC adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h){   
    int visibles=0;
    int ocultos=0;

        if(nVisibleTreasures > 0){ //o te quita visibles
            if(nVisibleTreasures > v.size()){
                visibles = v.size();
            }
            else{
                visibles = nVisibleTreasures;
            }
        }
        
        if(nHiddenTreasures > 0){
            if(nHiddenTreasures > h.size()){
                ocultos = h.size();
            }
            else{
                ocultos = nHiddenTreasures;
            }
        }
        
       NumericBC res = new NumericBC("", 0, visibles, ocultos);
       return res;
        
    }
    
    public String toString(){
        return "\n Mala Consecuencia \n       Nombre mala consecuencia:" + this.text + "\n       Niveles:" + Integer.toString(this.levels) 
                + "\n       Tesoros Visibles:" + Integer.toString(this.nVisibleTreasures) +
                "\n       Tesoros No Visibles:" + Integer.toHexString(this.nHiddenTreasures);
                
    }
}

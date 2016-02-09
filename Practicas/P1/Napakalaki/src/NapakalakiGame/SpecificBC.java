    /*
 * Copyright (C) 2016 nitrosito
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
 * @author nitrosito
 */
public class SpecificBC extends BadConsequence{
    private ArrayList<TreasureKind> specificHiddenTreasures= new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures= new ArrayList();

    public SpecificBC(String text, int levels, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden) {
        super(text, levels);
        this.specificVisibleTreasures=tVisible;
        this.specificHiddenTreasures=tHidden;
    }
    
    public ArrayList<TreasureKind> getSpecificVisibleTreasures(){
        return specificVisibleTreasures;
    }
    
    public ArrayList<TreasureKind> getSpecificHiddenTreasures(){
        return specificHiddenTreasures;
    }
    
    @Override
    public boolean isEmpty() {
        if(specificHiddenTreasures.size()== 0 && specificVisibleTreasures.size() == 0)
            return true;
        return false;
    }

    @Override
    void substractVisibleTreasure(Treasure t) {
        boolean esta = false;
        int ind;
        for(ind = 0; ind < specificVisibleTreasures.size() && esta!=true; ind++){
            if(t.getType() == specificVisibleTreasures.get(ind))
                esta = true;
        }
        if(esta)
           specificVisibleTreasures.remove(ind);
    }

    @Override
    void substractHiddenTreasure(Treasure t) {
        boolean esta = false;
        int ind;
        for(ind = 0; ind < specificHiddenTreasures.size() && esta!=true ; ind++){
            if(t.getType() == specificHiddenTreasures.get(ind))
                esta = true;
        }
        if(esta)
           specificHiddenTreasures.remove(ind);
    }

    @Override
    public SpecificBC adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h) {
        ArrayList<TreasureKind> espVisibles = new ArrayList();
        ArrayList<TreasureKind> espOcultos = new ArrayList();

        for (TreasureKind specificVisibleTreasure : specificVisibleTreasures) {
                for(Treasure treasure : v){
                    if(treasure.getType() == specificVisibleTreasure)
                        espVisibles.add(specificVisibleTreasure);
                }                 
            }
        
        for (TreasureKind specificHiddenTreasure : specificHiddenTreasures) {
                for(Treasure treasure : h){
                    if(treasure.getType() == specificHiddenTreasure)
                        espOcultos.add(specificHiddenTreasure);
                }                 
            }
        
       SpecificBC res = new SpecificBC("", 0, espVisibles, espOcultos);
       return res;
        
    }
    
     public String toString(){
        return "\n Mala Consecuencia \n       Nombre mala consecuencia:" + this.text + "\n       Niveles:" + Integer.toString(this.levels); 
    }

}

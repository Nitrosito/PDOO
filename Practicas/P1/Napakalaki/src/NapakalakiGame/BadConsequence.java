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
    
    public BadConsequence(String text, int levels){
        this.text=text;
        this.levels=levels;
    }
    
    public abstract boolean isEmpty();
    
    
    public int getLevels(){
            return levels;
    }
      
    abstract void substractVisibleTreasure(Treasure t);
//    {
//         boolean esta = false;
//        int ind;
//        for(ind = 0; ind < specificVisibleTreasures.size() && esta!=true; ind++){
//            if(t.getType() == specificVisibleTreasures.get(ind))
//                esta = true;
//        }
//        if(esta)
//           specificVisibleTreasures.remove(ind);
//        else if (nVisibleTreasures > 0)
//            nVisibleTreasures -= 1;
//    }
    
    abstract void substractHiddenTreasure(Treasure t);
//    {
//                 boolean esta = false;
//        int ind;
//        for(ind = 0; ind < specificHiddenTreasures.size() && esta!=true ; ind++){
//            if(t.getType() == specificHiddenTreasures.get(ind))
//                esta = true;
//        }
//        if(esta)
//           specificHiddenTreasures.remove(ind);
//        else if (nHiddenTreasures > 0)
//            nHiddenTreasures -= 1;
//    }
//    
//    
    public String getText(){
            return text;
    }

     

//    public BadConsequence(String text,boolean death){
//        this.text="";
//        this.levels=Player.MAXLEVEL;
//        this.nVisibleTreasures=MAXTREASURES;
//        this.nHiddenTreasures=MAXTREASURES;
//        this.text=text;
//        this.death=death;
//    }
    
//        public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden) {
//        this.text=text;
//        this.levels=levels;
//        this.nVisibleTreasures=0;
//        this.nHiddenTreasures=0;
//        this.specificVisibleTreasures=tVisible;
//        this.specificHiddenTreasures=tHidden;
//        this.death=false;
//    }
//        
public abstract BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h);   
//    int visibles=0;
//    int ocultos=0;
//    ArrayList<TreasureKind> espVisibles = new ArrayList();
//    ArrayList<TreasureKind> espOcultos = new ArrayList();
//
//        if(nVisibleTreasures > 0){ //o te quita visibles
//            if(nVisibleTreasures > v.size()){
//                visibles = v.size();
//            }
//            else{
//                visibles = nVisibleTreasures;
//            }
//        }
//        else{ // o especificos
//            for (TreasureKind specificVisibleTreasure : specificVisibleTreasures) {
//                for(Treasure treasure : v){
//                    if(treasure.getType() == specificVisibleTreasure)
//                        espVisibles.add(specificVisibleTreasure);
//                }                 
//            }
//        }
//        if(nHiddenTreasures > 0){
//            if(nHiddenTreasures > h.size()){
//                ocultos = h.size();
//            }
//            else{
//                ocultos = nHiddenTreasures;
//            }
//        }
//        else{
//           for (TreasureKind specificHiddenTreasure : specificHiddenTreasures) {
//                for(Treasure treasure : h){
//                    if(treasure.getType() == specificHiddenTreasure)
//                        espOcultos.add(specificHiddenTreasure);
//                }                 
//            }
//        }
//       BadConsequence res = new BadConsequence("", 0, espVisibles, espOcultos);
//       res.nHiddenTreasures=ocultos;
//       res.nVisibleTreasures=visibles;
//       return res;
//        
//    }
    
       
}
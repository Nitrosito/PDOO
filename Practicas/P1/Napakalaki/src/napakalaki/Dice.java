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
public class Dice {
    
     private static final Dice instance = new Dice();
     
      private Dice(){
     // Aqui va la asignación de valores, etc
    }

    public static Dice getInstance(){
        return instance;
    }
    
    
    public int nextNumber(){
        return (int) (Math.random()*6);       
    }
    
}

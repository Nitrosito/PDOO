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
public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Prize miPrize = new Prize(2,3); // Creo premio        
            BadConsequence mibc = new BadConsequence("Muerte subita",3,0,0);// Creo mala consecuencia
            
            Monster Mimonstruo = new Monster("Atún",10,mibc,miPrize);// Creo Monstruo
            //System.out.println(miPrize.getTreasures());
            //System.out.println(miPrize.getLevel());
            System.out.print(Mimonstruo.toString()); // Testeando todos los tostring
    }
    
}

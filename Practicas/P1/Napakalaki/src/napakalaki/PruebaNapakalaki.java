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
        
       /* PROBADO DE METODOS DE CREACIÓN Y TOSTRING
            Prize miPrize = new Prize(2,3); // Creo premio        
            BadConsequence mibc = new BadConsequence("Muerte subita",3,0,0);// Creo mala consecuencia
            
            Monster Mimonstruo = new Monster("Atún",10,mibc,miPrize);// Creo Monstruo
            System.out.println(miPrize.getTreasures());
            System.out.println(miPrize.getLevel());
            System.out.print(Mimonstruo.toString()); // Testeando todos los tostring
        */
        
            ArrayList<Monster> monstruos = new ArrayList(); // Array de monstruos
            
            BadConsequence badConsequence = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
            Prize prize = new Prize(4,2);
            monstruos.add(new Monster("El rey de la rosa",13,badConsequence,prize));
    }
    
}

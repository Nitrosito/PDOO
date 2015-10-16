/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

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
            
            // AÑADIENDO CARTAS
            
                // El rey de la rosa
            BadConsequence badConsequence = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
            Prize prize = new Prize(4,2);
            monstruos.add(new Monster("El rey de la rosa",13,badConsequence,prize));
            
                // Angeles de la noche ibicenca
            badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan"
                    + "caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",0,
                    new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                    new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
            
                    prize = new Prize(4,1);
                    monstruos.add(new Monster("Angeles de la noche ibicenca",14,badConsequence,prize));
                            
    }
    
}

//EXAMEN

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
            
                // El rey de rosa
            BadConsequence badConsequence = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
            Prize prize = new Prize(4,2);
            Region region = new Region("Limpun",10);
            monstruos.add(new Monster("El rey de rosa",13,badConsequence,prize,region));
            
                // Angeles de la noche ibicenca
            badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan"
                    + "caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",0,
                    new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                    new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
            
                    prize = new Prize(4,1);
                    Region region1 = new Region("Limpun",10);
                    monstruos.add(new Monster("Angeles de la noche ibicenca",14,badConsequence,prize,region1));
                    
                    
                // Byakhees de bonanza
            badConsequence = new BadConsequence("Pierdes tu armadura visible y otra oculta", 0,
                    new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                    new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
            prize=new Prize(2, 1);
            Region region2 = new Region("Limpun",10);
            monstruos.add(new Monster("Byakhess de bonanza", 8, badConsequence, prize,region2));
            
            
                // Chibithulhu
            badConsequence = new BadConsequence("Embobados con el lindo primigenio te descartas de tu casco visible"
                ,0,new ArrayList(Arrays.asList(TreasureKind.HELMET)),null);
            prize = new Prize(1, 1);
            Region region3 = new Region("Limpun",10);
            monstruos.add(new Monster("Chibithulhu",2,badConsequence,prize,region3));
            
            
                //El sopor de Dunwich
            badConsequence = new BadConsequence("El primordial bostezo contagioso.Pierdes el calzado visible"
                    , 0, new ArrayList(Arrays.asList(TreasureKind.SHOES)), null);
            prize = new Prize(1,1);
            Region region4 = new Region("Limpun",10);
            monstruos.add(new Monster("El sopor de Dunwich",2,badConsequence,prize,region4));
            
            
                //El gorron en el umbral
            badConsequence = new BadConsequence("Pierdes todos tus tesoros visibles",5,0,0);
            prize = new Prize(3,1);
            Region region5 = new Region("Limpun",10);
            monstruos.add(new Monster("El gorron en el umbral",10,badConsequence,prize,region5));
            
            
                //H.P. Munchraft
            badConsequence = new BadConsequence("Pierdes la armadura visible",0,
                    new ArrayList(Arrays.asList(TreasureKind.ARMOR)),null);
            prize = new Prize(2,1);
            Region region6 = new Region("Limpun",10);
            monstruos.add(new Monster("H.P. Munchraft",6,badConsequence,prize,region6));
            
            
                //Bichgooth
            badConsequence = new BadConsequence("Sientes bichos bajo la ropa.Descarta la armadura visible",
            0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),null);
            prize = new Prize(1,1);
            Region region7 = new Region("Limpun",10);
            monstruos.add(new Monster("Bichgooth",2,badConsequence,prize,region7));
            
            
                //La que redacta en las tinieblas
            badConsequence = new BadConsequence("Toses los pulmones y pierdes 2 niveles",2,0,0);
            prize = new Prize(1,1);
            Region region8 = new Region("Limpun",10);
            monstruos.add(new Monster("La que redacta en las tinieblas",2,badConsequence,prize,region8));
            
                //Los hondos
            badConsequence = new BadConsequence("Estos monstruos resultan bastante superficiales  "
                + "y te aburren mortalmente",true);
            prize = new Prize(2,1);
            Region region9 = new Region("Limpun",10);
            monstruos.add(new Monster("Los hondos", 8,badConsequence,prize,region9));
            
                //Semillas Cthulhu
            badConsequence = new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos",2,0,2);
            prize = new Prize(2,1);
            Region region10 = new Region("Limpun",10);
            monstruos.add(new Monster("Semillas Cthulhu",4,badConsequence,prize,region10));
            
                //Dameargo
            badConsequence = new BadConsequence("Te intentas escaquear.Pierdes una mano visible"
                    ,0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),null);
            prize = new Prize(2,1);
            Region region11 = new Region("Limpun",10);
            monstruos.add(new Monster("Dameargo",1,badConsequence,prize,region11));
            
                //Pollipólipo volante
            badConsequence = new BadConsequence("Da mucho asquito. Pierdes 3 niveles",3,0,0);
            prize = new Prize(1,1);
            Region region12 = new Region("Limpun",10);
            monstruos.add(new Monster("Pollipólipo volante",3,badConsequence,prize,region12));
            
                //Yskhtihyssg- Goth
            badConsequence = new BadConsequence("No le hace gracia que pronuncien mal su nombre. Estas muerto",true);
            prize = new Prize(3,1);
            Region region13 = new Region("Limpun",10);
            monstruos.add(new Monster("Yskhtihyssg- Goth",12,badConsequence,prize,region13));
            
                //Familia feliz
            badConsequence = new BadConsequence("La familia te atrapa. Est́as muerto",true);
            prize = new Prize(4,1);
            Region region14 = new Region("Limpun",10);
            monstruos.add(new Monster("Familia feliz",1,badConsequence,prize,region14));
            
                //Roboggoth
            badConsequence = new BadConsequence("La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible"
            ,0,new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),null);
            prize = new Prize(2,1);
            Region region15 = new Region("Limpun",10);
            monstruos.add(new Monster("Roboggoth",8,badConsequence,prize,region15));
            
                //El espia
            badConsequence = new BadConsequence("Te asusta en la noche. Pierdes un casco visible",0
                    ,new ArrayList(Arrays.asList(TreasureKind.HELMET)),null);
            prize = new Prize(1,1);
            Region region16 = new Region("Limpun",10);
            monstruos.add(new Monster("El espia",5,badConsequence,prize,region16));
            
                //El Lenguas
            badConsequence = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles"
                    ,2,5,0);
            prize = new Prize(1,1);
            Region region17 = new Region("Limpun",10);
            monstruos.add(new Monster("El Lenguas",20,badConsequence,prize,region17));
            
                //Bicéfalo
             badConsequence = new BadConsequence("Te faltan manos para tanta cabeza. Pierdes" 
                     +"3 niveles y tus tesoros visibles de las manos",3,5,0);
            prize = new Prize(1,1);
            Region region18 = new Region("Limpun",10);
            monstruos.add(new Monster("Bicéfalo",20,badConsequence,prize,region18));
           
           /* // Muestra todos los monstruos
            for(int i=0; i<19;i++){
                System.out.print(monstruos.get(i));
                System.out.print("\n\n");
            }
            */
            
            // Muestra monstruos con condicion (Mas de nv 3 , que den 2 o mas tesoros y que no maten)
            for(Monster m : monstruos ){
                if(m.getCombatLevel()>6 &&
                   m.getPrize().getTreasures()>=2 &&
                   m.getBadconsequence().getDeath()==false){
                    System.out.print(m);
                    System.out.print("\n\n");
                }
            }
    }
    
}
//FIN EXAMEN
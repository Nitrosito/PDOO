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
       
        
            ArrayList<Monster> monstruos = new ArrayList(); // Array de monstruos
            
            // AÑADIENDO CARTAS
            Region regionvacia = new Region("Ninguna",0); // Region indefinida
            Region unaregion= new Region("Limpun", 28); //Region limpun

                // El rey de rosa
            BadConsequence badConsequence = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
            Prize prize = new Prize(4,2);
            monstruos.add(new Monster("El rey de rosa",13,badConsequence,prize,unaregion));
            
                // Angeles de la noche ibicenca
            badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan"
                    + "caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",0,
                    new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                    new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
            
                    prize = new Prize(4,1);
                    monstruos.add(new Monster("Angeles de la noche ibicenca",14,badConsequence,prize,unaregion));
                    
                    
                // Byakhees de bonanza
            badConsequence = new BadConsequence("Pierdes tu armadura visible y otra oculta", 0,
                    new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                    new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
            prize=new Prize(2, 1);
            monstruos.add(new Monster("Byakhess de bonanza", 8, badConsequence, prize,unaregion));
            
            
                // Chibithulhu
            badConsequence = new BadConsequence("Embobados con el lindo primigenio te descartas de tu casco visible"
                ,0,new ArrayList(Arrays.asList(TreasureKind.HELMET)),new ArrayList());
            prize = new Prize(1, 1);
            monstruos.add(new Monster("Chibithulhu",2,badConsequence,prize,unaregion));
            
            
                //El sopor de Dunwich
            badConsequence = new BadConsequence("El primordial bostezo contagioso.Pierdes el calzado visible"
                    , 0, new ArrayList(Arrays.asList(TreasureKind.SHOES)),new ArrayList());
            prize = new Prize(1,1);
            monstruos.add(new Monster("El sopor de Dunwich",2,badConsequence,prize,unaregion));
            
            
                //El gorron en el umbral
            badConsequence = new BadConsequence("Pierdes todos tus tesoros visibles",5,0,0);
            prize = new Prize(3,1);
            monstruos.add(new Monster("El gorron en el umbral",10,badConsequence,prize,unaregion));
            
            
                //H.P. Munchraft
            badConsequence = new BadConsequence("Pierdes la armadura visible",0,
                    new ArrayList(Arrays.asList(TreasureKind.ARMOR)),new ArrayList());
            prize = new Prize(2,1);
            monstruos.add(new Monster("H.P. Munchraft",6,badConsequence,prize,unaregion));
            
            
                //Bichgooth
            badConsequence = new BadConsequence("Sientes bichos bajo la ropa.Descarta la armadura visible",
            0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),new ArrayList());
            prize = new Prize(1,1);
            monstruos.add(new Monster("Bichgooth",2,badConsequence,prize,unaregion));
            
            
                //La que redacta en las tinieblas
            badConsequence = new BadConsequence("Toses los pulmones y pierdes 2 niveles",2,0,0);
            prize = new Prize(1,1);
            monstruos.add(new Monster("La que redacta en las tinieblas",2,badConsequence,prize,unaregion));
            
                //Los hondos
            badConsequence = new BadConsequence("Estos monstruos resultan bastante superficiales  "
                + "y te aburren mortalmente",true);
            prize = new Prize(2,1);
            monstruos.add(new Monster("Los hondos", 8,badConsequence,prize,unaregion));
            
                //Semillas Cthulhu
            badConsequence = new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos",2,0,2);
            prize = new Prize(2,1);
            monstruos.add(new Monster("Semillas Cthulhu",4,badConsequence,prize,unaregion));
            
                //Dameargo
            badConsequence = new BadConsequence("Te intentas escaquear.Pierdes una mano visible"
                    ,0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),new ArrayList());
            prize = new Prize(2,1);
            monstruos.add(new Monster("Dameargo",1,badConsequence,prize,regionvacia));
            
                //Pollipólipo volante
            badConsequence = new BadConsequence("Da mucho asquito. Pierdes 3 niveles",3,0,0);
            prize = new Prize(1,1);
            monstruos.add(new Monster("Pollipólipo volante",3,badConsequence,prize,regionvacia));
            
                //Yskhtihyssg- Goth
            badConsequence = new BadConsequence("No le hace gracia que pronuncien mal su nombre. Estas muerto",true);
            prize = new Prize(3,1);
            monstruos.add(new Monster("Yskhtihyssg- Goth",12,badConsequence,prize,regionvacia));
            
                //Familia feliz
            badConsequence = new BadConsequence("La familia te atrapa. Est́as muerto",true);
            prize = new Prize(4,1);
            monstruos.add(new Monster("Familia feliz",1,badConsequence,prize,regionvacia));
            
                //Roboggoth
            badConsequence = new BadConsequence("La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible"
            ,0,new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),new ArrayList());
            prize = new Prize(2,1);
            monstruos.add(new Monster("Roboggoth",8,badConsequence,prize,regionvacia));
            
                //El espia
            badConsequence = new BadConsequence("Te asusta en la noche. Pierdes un casco visible",0
                    ,new ArrayList(Arrays.asList(TreasureKind.HELMET)),new ArrayList());
            prize = new Prize(1,1);
            monstruos.add(new Monster("El espia",5,badConsequence,prize,regionvacia));
            
                //El Lenguas
            badConsequence = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles"
                    ,2,5,0);
            prize = new Prize(1,1);
            monstruos.add(new Monster("El Lenguas",20,badConsequence,prize,regionvacia));
            
                //Bicéfalo
             badConsequence = new BadConsequence("Te faltan manos para tanta cabeza. Pierdes" 
                     +"3 niveles y tus tesoros visibles de las manos",3,5,0);
            prize = new Prize(1,1);
            monstruos.add(new Monster("Bicéfalo",20,badConsequence,prize,regionvacia));
           
           // Muestra todos los monstruos si su region es "limpun"
             float suma=0;
             int numero_monstruos=0;
             for(Monster m : monstruos ){
                 if(m.getRegion().getName() =="Limpun"){
                     System.out.print(m);
                     suma+=m.getRegion().getTemperature();
                     numero_monstruos++;
                     System.out.print("\n\n");
                 }
             }
             System.out.print("\n\n MEDIA de Temperatura:"+ suma/numero_monstruos + "\n\n");
           
    }  
}
   


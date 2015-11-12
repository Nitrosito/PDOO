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
        /*
            CardDealer cd = CardDealer.getInstance();
            Monster mayor = cd.mayorNivel();
            System.out.print(mayor);
        */
        /* PROBADO DE METODOS DE CREACIÓN Y TOSTRING
        Prize miPrize = new Prize(2,3); // Creo premio
        BadConsequence mibc = new BadConsequence("Muerte subita",3,0,0);// Creo mala consecuencia
        Monster Mimonstruo = new Monster("Atún",10,mibc,miPrize);// Creo Monstruo
        System.out.println(miPrize.getTreasures());
        System.out.println(miPrize.getLevel());
        System.out.print(Mimonstruo.toString()); // Testeando todos los tostring
        ArrayList<Monster> monstruos = new ArrayList(); // Array de monstruos
        // AÑADIENDO CARTAS
        // El rey de rosa
        BadConsequence badConsequence = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
        Prize prize = new Prize(4,2);
        monstruos.add(new Monster("El rey de rosa",13,badConsequence,prize));
        // Angeles de la noche ibicenca
        badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan"
        + "caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",0,
        new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
        new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        prize = new Prize(4,1);
        monstruos.add(new Monster("Angeles de la noche ibicenca",14,badConsequence,prize));
        // Byakhees de bonanza
        badConsequence = new BadConsequence("Pierdes tu armadura visible y otra oculta", 0,
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        prize=new Prize(2, 1);
        monstruos.add(new Monster("Byakhess de bonanza", 8, badConsequence, prize));
        // Chibithulhu
        badConsequence = new BadConsequence("Embobados con el lindo primigenio te descartas de tu casco visible"
        ,0,new ArrayList(Arrays.asList(TreasureKind.HELMET)),new ArrayList());
        prize = new Prize(1, 1);
        monstruos.add(new Monster("Chibithulhu",2,badConsequence,prize));
        //El sopor de Dunwich
        badConsequence = new BadConsequence("El primordial bostezo contagioso.Pierdes el calzado visible"
        , 0, new ArrayList(Arrays.asList(TreasureKind.SHOES)),new ArrayList());
        prize = new Prize(1,1);
        monstruos.add(new Monster("El sopor de Dunwich",2,badConsequence,prize));
        //El gorron en el umbral
        badConsequence = new BadConsequence("Pierdes todos tus tesoros visibles",5,0,0);
        prize = new Prize(3,1);
        monstruos.add(new Monster("El gorron en el umbral",10,badConsequence,prize));
        //H.P. Munchraft
        badConsequence = new BadConsequence("Pierdes la armadura visible",0,
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)),new ArrayList());
        prize = new Prize(2,1);
        monstruos.add(new Monster("H.P. Munchraft",6,badConsequence,prize));
        //Bichgooth
        badConsequence = new BadConsequence("Sientes bichos bajo la ropa.Descarta la armadura visible",
        0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),new ArrayList());
        prize = new Prize(1,1);
        monstruos.add(new Monster("Bichgooth",2,badConsequence,prize));
        //La que redacta en las tinieblas
        badConsequence = new BadConsequence("Toses los pulmones y pierdes 2 niveles",2,0,0);
        prize = new Prize(1,1);
        monstruos.add(new Monster("La que redacta en las tinieblas",2,badConsequence,prize));
        //Los hondos
        badConsequence = new BadConsequence("Estos monstruos resultan bastante superficiales  "
        + "y te aburren mortalmente",true);
        prize = new Prize(2,1);
        monstruos.add(new Monster("Los hondos", 8,badConsequence,prize));
        //Semillas Cthulhu
        badConsequence = new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos",2,0,2);
        prize = new Prize(2,1);
        monstruos.add(new Monster("Semillas Cthulhu",4,badConsequence,prize));
        //Dameargo
        badConsequence = new BadConsequence("Te intentas escaquear.Pierdes una mano visible"
        ,0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),new ArrayList());
        prize = new Prize(2,1);
        monstruos.add(new Monster("Dameargo",1,badConsequence,prize));
        //Pollipólipo volante
        badConsequence = new BadConsequence("Da mucho asquito. Pierdes 3 niveles",3,0,0);
        prize = new Prize(1,1);
        monstruos.add(new Monster("Pollipólipo volante",3,badConsequence,prize));
        //Yskhtihyssg- Goth
        badConsequence = new BadConsequence("No le hace gracia que pronuncien mal su nombre. Estas muerto",true);
        prize = new Prize(3,1);
        monstruos.add(new Monster("Yskhtihyssg- Goth",12,badConsequence,prize));
        //Familia feliz
        badConsequence = new BadConsequence("La familia te atrapa. Est́as muerto",true);
        prize = new Prize(4,1);
        monstruos.add(new Monster("Familia feliz",1,badConsequence,prize));
        //Roboggoth
        badConsequence = new BadConsequence("La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible"
        ,0,new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),new ArrayList());
        prize = new Prize(2,1);
        monstruos.add(new Monster("Roboggoth",8,badConsequence,prize));
        //El espia
        badConsequence = new BadConsequence("Te asusta en la noche. Pierdes un casco visible",0
        ,new ArrayList(Arrays.asList(TreasureKind.HELMET)),new ArrayList());
        prize = new Prize(1,1);
        monstruos.add(new Monster("El espia",5,badConsequence,prize));
        //El Lenguas
        badConsequence = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles"
        ,2,5,0);
        prize = new Prize(1,1);
        monstruos.add(new Monster("El Lenguas",20,badConsequence,prize));
        //Bicéfalo
        badConsequence = new BadConsequence("Te faltan manos para tanta cabeza. Pierdes"
        +"3 niveles y tus tesoros visibles de las manos",3,5,0);
        prize = new Prize(1,1);
        monstruos.add(new Monster("Bicéfalo",20,badConsequence,prize));
        /* // Muestra todos los monstruos
        for(int i=0; i<19;i++){
        System.out.print(monstruos.get(i));
        System.out.print("\n\n");
        }
         */
        // Pruebas Random
        /*  for(Monster m : monstruos ){
        if(m.getCombatLevel()>6 &&
        m.getPrize().getTreasures()>=2 &&
        m.getBadconsequence().getDeath()==false &&
        m.getBadconsequence().getSpecificHiddenTreasures().isEmpty()== true &&
        m.getBadconsequence().getSpecificVisibleTreasures().isEmpty()==false){
        System.out.print(m);
        System.out.print("\n\n");
        }
        }
         */
        //Tienen un nivel de combate superior a 10.
        /*  for(Monster m : monstruos ){
        if(m.getCombatLevel()>10){
        System.out.print(m);
        System.out.print("\n\n");
        }
        }
         */
        //Tengan un mal rollo que implique sólo pérdida de niveles.
        /* for(Monster m : monstruos ){
        if(m.getBadconsequence().getDeath()==false &
        m.getBadconsequence().getnHiddenTreasures()==0 &&
        m.getBadconsequence().getSpecificHiddenTreasures().isEmpty()==true &&
        m.getBadconsequence().getSpecificVisibleTreasures().isEmpty()==true &&
        m.getBadconsequence().getnHiddenTreasures()==0 &&
        m.getBadconsequence().getnVisibleTreasures()==0){
        System.out.print(m);
        System.out.print("\n\n");
        }
        }
        //Su buen rollo indique una ganancia de niveles superior a 1.
        //Su mal rollo suponga la pérdida de un determinado tipo de tesoros ya sea visibles y/o ocultos..
        for(Monster m : monstruos ){
        if(m.getBadconsequence().getSpecificHiddenTreasures().isEmpty()==false ||
        m.getBadconsequence().getSpecificVisibleTreasures().isEmpty()==false){
        System.out.print(m);
        System.out.print("\n\n");
        }
        }
         */

    } // fin clase
            
            

    
}

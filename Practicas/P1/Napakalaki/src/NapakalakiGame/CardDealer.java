/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author nitrosito
 */
public class CardDealer {
    //Private
    private static final CardDealer instance = new CardDealer();
    private ArrayList<Treasure> usedTreasures;
    private ArrayList<Treasure> unusedTreasures;
    private ArrayList<Monster> usedMonster;
    private ArrayList<Monster> unusedMonster;
    private Player favourite;
    
    
    private CardDealer(){
      usedTreasures=new ArrayList();
      unusedTreasures=new ArrayList();
      usedMonster=new ArrayList();
      unusedMonster=new ArrayList();
    }

    public static CardDealer getInstance(){
        return instance;
        // STATIC = Metodo de CLaSE
    }
    
    private void initTreasureCardDeck(){
      
        
        //Si mi amo
        unusedTreasures.add(new Treasure("¡Si mi amo!",4, TreasureKind.HELMET));
        
        //Botas de investigacion
        unusedTreasures.add(new Treasure("Botas de investigacion",3,TreasureKind.SHOES));
        
//        //Capucha de cthulhu
//        unusedTreasures.add(new Treasure("Capucha de cthulhu",3,TreasureKind.HELMET));
//        
//        //A prueba de babas
//        unusedTreasures.add(new Treasure("A prueba de babas",2,TreasureKind.ARMOR));
//        
//        //Botas de lluvia acida
//        unusedTreasures.add(new Treasure("Botas de lluvia acida",1,TreasureKind.BOTHHANDS));
//        
//        //Casco Minero
//        unusedTreasures.add(new Treasure("Casco Minero",2,TreasureKind.HELMET));
//        
//        //Ametralladora Thompson
//        unusedTreasures.add(new Treasure("Ametralladora Thompson",4,TreasureKind.BOTHHANDS));
//        
//        //Camiseta de la UGR
//        unusedTreasures.add(new Treasure("Camiseta de la UGR",1,TreasureKind.ARMOR));
//        
//        //Clavo de rail ferroviario
//        unusedTreasures.add(new Treasure("Clavo de rail ferroviario",3,TreasureKind.ONEHAND));
//        
//
//        
//        //Cuchillo de sushi arcano
//	unusedTreasures.add(new Treasure("Cuchillo de sushi arcano",2, TreasureKind.ONEHAND));
// 
//	//Fez alopedo
//	unusedTreasures.add(new Treasure("Fez alopedo",3, TreasureKind.HELMET));
// 
//	//Hacha prehistorica
//	unusedTreasures.add(new Treasure("Hacha prehistorica",2, TreasureKind.ONEHAND));
//	
//	//El aparato de Pr.Tesla
//	unusedTreasures.add(new Treasure("El aparato de Pr.Tesla",4, TreasureKind.ARMOR));
//	
//	//Gaita
//	unusedTreasures.add(new Treasure("Gaita",4, TreasureKind.BOTHHANDS));
//	
//	//Insecticida
//	unusedTreasures.add(new Treasure("Insecticida",2, TreasureKind.ONEHAND));
//	
//	//Escopeta de 3 cañones
//	unusedTreasures.add(new Treasure("Escopeta de 3 cañones",4, TreasureKind.BOTHHANDS));
//	
//	//Garabato mistico
//	unusedTreasures.add(new Treasure("Garabato mistico",2, TreasureKind.ONEHAND));
//	
//	//La rebeca metalica
//	unusedTreasures.add(new Treasure("La rebeca metalica",2, TreasureKind.ARMOR));
//	
//	//Lanzallamas
//	unusedTreasures.add(new Treasure("Lanzallamas",4, TreasureKind.BOTHHANDS));
//	
//	//Necrocomicon
//	unusedTreasures.add(new Treasure("Necrocomicon",1, TreasureKind.ONEHAND));
//	
//	//Necronomicon
//	unusedTreasures.add(new Treasure("Necronomicon",5, TreasureKind.BOTHHANDS));
//	
//	//Linterna a 2 manos
//	unusedTreasures.add(new Treasure("Linterna a 2 manos",3, TreasureKind.BOTHHANDS));
//	
//	//Necrognomicon
//	unusedTreasures.add(new Treasure("Necrognomicon",2, TreasureKind.ONEHAND));
//	
//	//Necrotelecom
//	unusedTreasures.add(new Treasure("Necrotelecom",2, TreasureKind.HELMET));
//	
//	//Mazo de los antiguos
//	unusedTreasures.add(new Treasure("Mazo de los antiguos",3, TreasureKind.ONEHAND));
//	
//	//Necroplayboycon
//	unusedTreasures.add(new Treasure("Necroplayboycon",3, TreasureKind.ONEHAND));
//	
//	//Porra preternatural
//	unusedTreasures.add(new Treasure("Porra preternatural",3, TreasureKind.ONEHAND));
//	
//	//Shogulador
//	unusedTreasures.add(new Treasure("Shogulador",1, TreasureKind.BOTHHANDS));
//	
//	//Varita de atizamiento
//	unusedTreasures.add(new Treasure("Varita de atizamiento",3, TreasureKind.ONEHAND));
//	
//	//Tentacula de pega
//	unusedTreasures.add(new Treasure("Tentaculo de pega",2, TreasureKind.HELMET));
//	
//	//Zapato deja-amigos
//	unusedTreasures.add(new Treasure("Zapato deja-amigos",1, TreasureKind.SHOES));
	  
        
    }
    
    private void initMonsterCardDeck(){
        // El rey de rosa
            BadConsequence badConsequence = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
            Prize prize = new Prize(4,2);
            unusedMonster.add(new Monster("El rey de rosa",13,badConsequence,prize));
            
//                // Angeles de la noche ibicenca
//            badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan"
//                    + "caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",0,
//                    new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
//                    new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
//            
//                    prize = new Prize(4,1);
//                    unusedMonster.add(new Monster("Angeles de la noche ibicenca",14,badConsequence,prize));
//                    
//                    
//                // Byakhees de bonanza
//            badConsequence = new BadConsequence("Pierdes tu armadura visible y otra oculta", 0,
//                    new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
//                    new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
//            prize=new Prize(2, 1);
//            unusedMonster.add(new Monster("Byakhess de bonanza", 8, badConsequence, prize));
//            
//            
//                // Chibithulhu
//            badConsequence = new BadConsequence("Embobados con el lindo primigenio te descartas de tu casco visible"
//                ,0,new ArrayList(Arrays.asList(TreasureKind.HELMET)),new ArrayList());
//            prize = new Prize(1, 1);
//            unusedMonster.add(new Monster("Chibithulhu",2,badConsequence,prize));
//            
//            
//                //El sopor de Dunwich
//            badConsequence = new BadConsequence("El primordial bostezo contagioso.Pierdes el calzado visible"
//                    , 0, new ArrayList(Arrays.asList(TreasureKind.SHOES)),new ArrayList());
//            prize = new Prize(1,1);
//            unusedMonster.add(new Monster("El sopor de Dunwich",2,badConsequence,prize));
//            
//            
//                //El gorron en el umbral
//            badConsequence = new BadConsequence("Pierdes todos tus tesoros visibles",BadConsequence.MAXTREASURES,0,0);
//            prize = new Prize(3,1);
//            unusedMonster.add(new Monster("El gorron en el umbral",10,badConsequence,prize));
//            
//            
//                //H.P. Munchraft
//            badConsequence = new BadConsequence("Pierdes la armadura visible",0,
//                    new ArrayList(Arrays.asList(TreasureKind.ARMOR)),new ArrayList());
//            prize = new Prize(2,1);
//            unusedMonster.add(new Monster("H.P. Munchraft",6,badConsequence,prize));
//            
//            
//                //Bichgooth
//            badConsequence = new BadConsequence("Sientes bichos bajo la ropa.Descarta la armadura visible",
//            0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),new ArrayList());
//            prize = new Prize(1,1);
//            unusedMonster.add(new Monster("Bichgooth",2,badConsequence,prize));
//            
//            
//                //La que redacta en las tinieblas
//            badConsequence = new BadConsequence("Toses los pulmones y pierdes 2 niveles",2,0,0);
//            prize = new Prize(1,1);
//            unusedMonster.add(new Monster("La que redacta en las tinieblas",2,badConsequence,prize));
//            
//                //Los hondos
//            badConsequence = new BadConsequence("Estos monstruos resultan bastante superficiales  "
//                + "y te aburren mortalmente",true);
//            prize = new Prize(2,1);
//            unusedMonster.add(new Monster("Los hondos", 8,badConsequence,prize));
//            
//                //Semillas Cthulhu
//            badConsequence = new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos",2,0,2);
//            prize = new Prize(2,1);
//            unusedMonster.add(new Monster("Semillas Cthulhu",4,badConsequence,prize));
//            
//                //Dameargo
//            badConsequence = new BadConsequence("Te intentas escaquear.Pierdes una mano visible"
//                    ,0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),new ArrayList());
//            prize = new Prize(2,1);
//            unusedMonster.add(new Monster("Dameargo",1,badConsequence,prize));
//            
//                //Pollipólipo volante
//            badConsequence = new BadConsequence("Da mucho asquito. Pierdes 3 niveles",3,0,0);
//            prize = new Prize(1,1);
//            unusedMonster.add(new Monster("Pollipólipo volante",3,badConsequence,prize));
//            
//                //Yskhtihyssg- Goth
//            badConsequence = new BadConsequence("No le hace gracia que pronuncien mal su nombre. Estas muerto",true);
//            prize = new Prize(3,1);
//            unusedMonster.add(new Monster("Yskhtihyssg- Goth",12,badConsequence,prize));
//            
//                //Familia feliz
//            badConsequence = new BadConsequence("La familia te atrapa. Est́as muerto",true);
//            prize = new Prize(4,1);
//            unusedMonster.add(new Monster("Familia feliz",1,badConsequence,prize));
//            
//                //Roboggoth
//            badConsequence = new BadConsequence("La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible"
//            ,0,new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),new ArrayList());
//            prize = new Prize(2,1);
//            unusedMonster.add(new Monster("Roboggoth",8,badConsequence,prize));
//            
//                //El espia
//            badConsequence = new BadConsequence("Te asusta en la noche. Pierdes un casco visible",0
//                    ,new ArrayList(Arrays.asList(TreasureKind.HELMET)),new ArrayList());
//            prize = new Prize(1,1);
//            unusedMonster.add(new Monster("El espia",5,badConsequence,prize));
//            
//                //El Lenguas
//            badConsequence = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles"
//                    ,2,5,0);
//            prize = new Prize(1,1);
//            unusedMonster.add(new Monster("El Lenguas",20,badConsequence,prize));
//            
//                //Bicéfalo
//             badConsequence = new BadConsequence("Te faltan manos para tanta cabeza. Pierdes" 
//                     +"3 niveles y tus tesoros visibles de las manos",3,5,0);
//            prize = new Prize(1,1);
//            unusedMonster.add(new Monster("Bicéfalo",20,badConsequence,prize));
    }
    
    private void shuffleTreasures(){
        Collections.shuffle(unusedTreasures);
    }
    
    private void shuffleMonsters(){
        Collections.shuffle(unusedMonster);
    }
   
     
    public Treasure nextTreasure(){
        if(unusedTreasures.isEmpty()){
            unusedTreasures.addAll(usedTreasures);
            shuffleTreasures();
            usedTreasures.clear();
        }
        
        Treasure salida;
        salida = unusedTreasures.get(0);
        usedTreasures.add(unusedTreasures.get(0));
        unusedTreasures.remove(0);
        return salida;
    }
    
    public Monster nextMonster(){
        if(unusedMonster.isEmpty()){
            unusedMonster.addAll(usedMonster);
            shuffleMonsters();
            usedMonster.clear();
        }
        
        Monster salida;
        salida = unusedMonster.get(0);
        usedMonster.add(unusedMonster.get(0));
        unusedMonster.remove(0);
        return salida;
    }
    
    public void giveTreasureBack(Treasure t){
       usedTreasures.add(t);
       // if(t.getBonus()>3){
       //     favourite.makeTreasureVisible(t);
       // }
    }
    
    public void giveMonsterBack(Monster m){
        usedMonster.add(m);
    }
    
    public void initCards(){
        initTreasureCardDeck();
        shuffleTreasures();
        initMonsterCardDeck();
        shuffleMonsters();
    }
    
    public void setPlayer(Player p){
        favourite=p;
    }
    
    
    
    
}

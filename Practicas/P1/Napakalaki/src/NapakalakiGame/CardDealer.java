/*
 * Copyright (C) 2015 nitrosito
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
    private ArrayList<Cultist> unusedCultists;
    
    
    private CardDealer(){
      usedTreasures=new ArrayList();
      unusedTreasures=new ArrayList();
      usedMonster=new ArrayList();
      unusedMonster=new ArrayList();
      unusedCultists = new ArrayList();
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
        
        //Capucha de cthulhu
        unusedTreasures.add(new Treasure("Capucha de cthulhu",3,TreasureKind.HELMET));
        
        //A prueba de babas
        unusedTreasures.add(new Treasure("A prueba de babas",2,TreasureKind.ARMOR));
        
        //Botas de lluvia acida
        unusedTreasures.add(new Treasure("Botas de lluvia acida",1,TreasureKind.BOTHHANDS));
        
        //Casco Minero
        unusedTreasures.add(new Treasure("Casco Minero",2,TreasureKind.HELMET));
        
        //Ametralladora Thompson
        unusedTreasures.add(new Treasure("Ametralladora Thompson",4,TreasureKind.BOTHHANDS));
        
        //Camiseta de la UGR
        unusedTreasures.add(new Treasure("Camiseta de la UGR",1,TreasureKind.ARMOR));
        
        //Clavo de rail ferroviario
        unusedTreasures.add(new Treasure("Clavo de rail ferroviario",3,TreasureKind.ONEHAND));
        

        
        //Cuchillo de sushi arcano
	unusedTreasures.add(new Treasure("Cuchillo de sushi arcano",2, TreasureKind.ONEHAND));
 
	//Fez alopedo
	unusedTreasures.add(new Treasure("Fez alopedo",3, TreasureKind.HELMET));
 
	//Hacha prehistorica
	unusedTreasures.add(new Treasure("Hacha prehistorica",2, TreasureKind.ONEHAND));
	
	//El aparato de Pr.Tesla
	unusedTreasures.add(new Treasure("El aparato de Pr.Tesla",4, TreasureKind.ARMOR));
	
	//Gaita
	unusedTreasures.add(new Treasure("Gaita",4, TreasureKind.BOTHHANDS));
	
	//Insecticida
	unusedTreasures.add(new Treasure("Insecticida",2, TreasureKind.ONEHAND));
	
	//Escopeta de 3 cañones
	unusedTreasures.add(new Treasure("Escopeta de 3 cañones",4, TreasureKind.BOTHHANDS));
	
	//Garabato mistico
	unusedTreasures.add(new Treasure("Garabato mistico",2, TreasureKind.ONEHAND));
	
	//La rebeca metalica
	unusedTreasures.add(new Treasure("La rebeca metalica",2, TreasureKind.ARMOR));
	
	//Lanzallamas
	unusedTreasures.add(new Treasure("Lanzallamas",4, TreasureKind.BOTHHANDS));
	
	//Necrocomicon
	unusedTreasures.add(new Treasure("Necrocomicon",1, TreasureKind.ONEHAND));
	
	//Necronomicon
	unusedTreasures.add(new Treasure("Necronomicon",5, TreasureKind.BOTHHANDS));
	
	//Linterna a 2 manos
	unusedTreasures.add(new Treasure("Linterna a 2 manos",3, TreasureKind.BOTHHANDS));
	
	//Necrognomicon
	unusedTreasures.add(new Treasure("Necrognomicon",2, TreasureKind.ONEHAND));
	
	//Necrotelecom
	unusedTreasures.add(new Treasure("Necrotelecom",2, TreasureKind.HELMET));
	
	//Mazo de los antiguos
	unusedTreasures.add(new Treasure("Mazo de los antiguos",3, TreasureKind.ONEHAND));
	
	//Necroplayboycon
	unusedTreasures.add(new Treasure("Necroplayboycon",3, TreasureKind.ONEHAND));
	
	//Porra preternatural
	unusedTreasures.add(new Treasure("Porra preternatural",3, TreasureKind.ONEHAND));
	
	//Shogulador
	unusedTreasures.add(new Treasure("Shogulador",1, TreasureKind.BOTHHANDS));
	
	//Varita de atizamiento
	unusedTreasures.add(new Treasure("Varita de atizamiento",3, TreasureKind.ONEHAND));
	
	//Tentacula de pega
	unusedTreasures.add(new Treasure("Tentaculo de pega",2, TreasureKind.HELMET));
	
	//Zapato deja-amigos
	unusedTreasures.add(new Treasure("Zapato deja-amigos",1, TreasureKind.SHOES));
	  
        
    }
    
    private void initMonsterCardDeck(){
        // El rey de rosa
            NumericBC badConsequence = new NumericBC("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
            Prize prize = new Prize(4,2);
            unusedMonster.add(new Monster("El rey de rosa",13,badConsequence,prize));
            
                // Angeles de la noche ibicenca
            specificBC badConsequenceSpecific;
            badConsequenceSpecific = new specificBC("Te atrapan para llevarte de fiesta y te dejan"
                    + "caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",0,
                    new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                    new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
            
                    prize = new Prize(4,1);
                    unusedMonster.add(new Monster("Angeles de la noche ibicenca",14,badConsequence,prize));
                    
                    
                // Byakhees de bonanza
            badConsequenceSpecific = new specificBC("Pierdes tu armadura visible y otra oculta", 0,
                    new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                    new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
            prize=new Prize(2, 1);
            unusedMonster.add(new Monster("Byakhess de bonanza", 8, badConsequence, prize));
            
            
                // Chibithulhu
            badConsequenceSpecific = new specificBC("Embobados con el lindo primigenio te descartas de tu casco visible"
                ,0,new ArrayList(Arrays.asList(TreasureKind.HELMET)),new ArrayList());
            prize = new Prize(1, 1);
            unusedMonster.add(new Monster("Chibithulhu",2,badConsequence,prize));
            
            
                //El sopor de Dunwich
            badConsequenceSpecific = new specificBC("El primordial bostezo contagioso.Pierdes el calzado visible"
                    , 0, new ArrayList(Arrays.asList(TreasureKind.SHOES)),new ArrayList());
            prize = new Prize(1,1);
            unusedMonster.add(new Monster("El sopor de Dunwich",2,badConsequence,prize));
            
            
                //El gorron en el umbral
            badConsequence = new NumericBC("Pierdes todos tus tesoros visibles",BadConsequence.MAXTREASURES,0,0);
            prize = new Prize(3,1);
            unusedMonster.add(new Monster("El gorron en el umbral",10,badConsequence,prize));
            
            
                //H.P. Munchraft
            badConsequenceSpecific = new specificBC("Pierdes la armadura visible",0,
                    new ArrayList(Arrays.asList(TreasureKind.ARMOR)),new ArrayList());
            prize = new Prize(2,1);
            unusedMonster.add(new Monster("H.P. Munchraft",6,badConsequence,prize));
            
            
                //Bichgooth
            badConsequenceSpecific = new specificBC("Sientes bichos bajo la ropa.Descarta la armadura visible",
            0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),new ArrayList());
            prize = new Prize(1,1);
            unusedMonster.add(new Monster("Bichgooth",2,badConsequence,prize));
            
            
                //La que redacta en las tinieblas
            badConsequence = new NumericBC("Toses los pulmones y pierdes 2 niveles",2,0,0);
            prize = new Prize(1,1);
            unusedMonster.add(new Monster("La que redacta en las tinieblas",2,badConsequence,prize));
            
                //Los hondos
            deathBC muerte;
            muerte = new deathBC("Estos monstruos resultan bastante superficiales  "
                + "y te aburren mortalmente",true);
            prize = new Prize(2,1);
            unusedMonster.add(new Monster("Los hondos", 8,badConsequence,prize));
            
                //Semillas Cthulhu
            badConsequence = new NumericBC("Pierdes 2 niveles y 2 tesoros ocultos",2,0,2);
            prize = new Prize(2,1);
            unusedMonster.add(new Monster("Semillas Cthulhu",4,badConsequence,prize));
            
                //Dameargo
            badConsequenceSpecific = new specificBC("Te intentas escaquear.Pierdes una mano visible"
                    ,0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),new ArrayList());
            prize = new Prize(2,1);
            unusedMonster.add(new Monster("Dameargo",1,badConsequence,prize));
            
                //Pollipólipo volante
            badConsequence = new NumericBC("Da mucho asquito. Pierdes 3 niveles",3,0,0);
            prize = new Prize(1,1);
            unusedMonster.add(new Monster("Pollipólipo volante",3,badConsequence,prize));
            
                //Yskhtihyssg- Goth
            muerte = new deathBC("No le hace gracia que pronuncien mal su nombre. Estas muerto",true);
            prize = new Prize(3,1);
            unusedMonster.add(new Monster("Yskhtihyssg- Goth",12,badConsequence,prize));
            
                //Familia feliz
            muerte = new deathBC("La familia te atrapa. Est́as muerto",true);
            prize = new Prize(4,1);
            unusedMonster.add(new Monster("Familia feliz",1,badConsequence,prize));
            
                //Roboggoth
            badConsequenceSpecific = new specificBC("La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible"
            ,0,new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),new ArrayList());
            prize = new Prize(2,1);
            unusedMonster.add(new Monster("Roboggoth",8,badConsequence,prize));
            
                //El espia
            badConsequenceSpecific = new specificBC("Te asusta en la noche. Pierdes un casco visible",0
                    ,new ArrayList(Arrays.asList(TreasureKind.HELMET)),new ArrayList());
            prize = new Prize(1,1);
            unusedMonster.add(new Monster("El espia",5,badConsequence,prize));
            
                //El Lenguas
            badConsequence = new NumericBC("Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles"
                    ,2,5,0);
            prize = new Prize(1,1);
            unusedMonster.add(new Monster("El Lenguas",20,badConsequence,prize));
            
                //Bicéfalo
             badConsequence = new NumericBC("Te faltan manos para tanta cabeza. Pierdes" 
                     +"3 niveles y tus tesoros visibles de las manos",3,5,0);
            prize = new Prize(1,1);
            unusedMonster.add(new Monster("Bicéfalo",20,badConsequence,prize));
            
            //////////////////////
            // CARTAS SECTARIOS //
            //////////////////////
            badConsequenceSpecific = new specificBC("Pierdes 1 mano visible",0,
                    new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),new ArrayList());
            prize = new Prize(3,1);
            unusedMonster.add(new Monster("El mal indecible impronunciable", 10, badConsequence, prize, -2));
            
            badConsequence = new NumericBC("Pierdes tus tesoros visibles. Ja ja ja.",0,BadConsequence.MAXTREASURES,0);
            prize = new Prize(2,1);
            unusedMonster.add(new Monster("Testigos Oculares", 6, badConsequence, prize, +2));       
 
            muerte = new deathBC("Hoy no es tu día de suerte. Mueres.", true);
            prize = new Prize(2,5);
            unusedMonster.add(new Monster("El gran cthulhu", 20, badConsequence, prize, +4));
            
            badConsequence = new NumericBC("Tu gobierno te recorta 2 niveles", 2, 0, 0);
            prize = new Prize(2,1);
            unusedMonster.add(new Monster("Serpiente Político", 8, badConsequence, prize, -2));              

            badConsequenceSpecific = new specificBC("Pierdes tu casco y tu armadura visible. Pierdes tus manos ocultas.",
                    0,new ArrayList(Arrays.asList(TreasureKind.HELMET,TreasureKind.ARMOR)),
                    new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS,TreasureKind.ONEHAND,TreasureKind.ONEHAND)));
            prize = new Prize(1,1);
            unusedMonster.add(new Monster("Felpuggoth", 2, badConsequence, prize, +5));
            
            badConsequence = new NumericBC("Pierdes 2 niveles", 2, 0, 0);
            prize = new Prize(4,2);
            unusedMonster.add(new Monster("Shoggoth", 16, badConsequence, prize, -4));     
            
            badConsequence = new NumericBC("Pintalabios negro. Pierdes 2 niveles.",2,0,0);
            prize = new Prize(1,1);
            unusedMonster.add(new Monster("Lolitagooth", 2, badConsequence, prize, +3));               
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
        
        Treasure salida = unusedTreasures.get(0);
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
        initCultistsCardDeck();
        shuffleCultists();
    }
    
    public void setPlayer(Player p){
        favourite=p;
    }
    
    private void shuffleCultists(){
        Collections.shuffle(unusedCultists);
    }
    
    private void initCultistsCardDeck(){
       Cultist carta;
       
        carta = new Cultist("Sectario +1 por cada sectario en juego. No puedes dejar de"
                + " ser sectario", 1);
        unusedCultists.add(carta);
        
        carta = new Cultist("Sectario +2 por cada sectario en juego. No puedes dejar de"
                + " ser sectario", 2);
        unusedCultists.add(carta);
        
        carta = new Cultist("Sectario +1 por cada sectario en juego. No puedes dejar de"
                + " ser sectario", 1);
        unusedCultists.add(carta);
        
        carta = new Cultist("Sectario +2 por cada sectario en juego. No puedes dejar de"
                + " ser sectario", 2);
        unusedCultists.add(carta);
        
        carta = new Cultist("Sectario +1 por cada sectario en juego. No puedes dejar de"
                + " ser sectario", 1);
        unusedCultists.add(carta);
   
        carta = new Cultist("Sectario +1 por cada sectario en juego. No puedes dejar de"
                + " ser sectario", 1);
        unusedCultists.add(carta);
        
    }
    
    /** @FIXME */
    public Cultist nextCultist(){
      Cultist res= unusedCultists.get(0);
      unusedCultists.remove(0);
      return res;
    }
    
    
    
    
}

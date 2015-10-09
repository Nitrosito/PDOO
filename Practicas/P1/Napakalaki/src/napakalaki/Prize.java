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
public class Prize {
    private int treasures;
    private int level;
    
    
    public Prize(int treasures, int level){
            this.treasures=treasures;
            this.level=level;
    }
    
    public int getTreasures(){
            return treasures;
    }
    
    public int getLevel(){
            return level;
    }
    
    // DEBUG
    public static void main(String[] args) {
            Prize miPrize = new Prize(2,3);
            System.out.println(miPrize.getTreasures());
            System.out.println(miPrize.getLevel());
    }
    // DEBUG
}

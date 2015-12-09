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

/**
 *
 * @author nitrosito
 */
public class CultistPlayer extends Player {
    //final?
    private static int totalCultistPlayers = 0;
    private Cultist myCultistCard;
    protected Player enemy;
    
    public CultistPlayer(Player p, Cultist c){
        super(p);
        myCultistCard=c;
        totalCultistPlayers++;
    }
    
    protected int getCombatLevel(Monster m){
        return m.getCombatLevel();
    }
    
    protected int getOponentLevel(Monster m){
        // y este que hace?
        return 0;
    }
    
    protected boolean shouldConvert(){
        return true;
    }
    
    private Treasure giveMeATreasure(){
        return null;
    }
    
    private void canYouGiveMeATreasure(){
        
    }
    
    static public int getTotalCultistPlayers(){
        return 1;
    }
    
    
}

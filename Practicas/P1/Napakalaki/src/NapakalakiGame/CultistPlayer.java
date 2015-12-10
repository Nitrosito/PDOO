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
import java.util.Random;

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
        int nvplayer = super.getCombatLevel();
        int res;
        res = (int) (nvplayer + (nvplayer*0.2)) + (m.getLevelsGained() * totalCultistPlayers);
        return res;
    }
    
    protected int getOponentLevel(Monster m){
        return m.getCombatLevelAgainstCultistsPlayer();
    }
    
    protected boolean shouldConvert(){
        return false;
    }
    
    private Treasure giveMeATreasure(){
        ArrayList<Treasure> tesoros = getVisibleTreasures();
        Random rand = new Random();
        int aleatorio = (rand.nextInt(((tesoros.size()-1) - 1) + 1) + 1);     
        return tesoros.get(aleatorio);
    }
    
    /* @FIXME  boolean o void */
    private boolean canYouGiveMeATreasure(){
        ArrayList<Treasure> tesoros = enemy.getVisibleTreasures();
        if(tesoros.size()>0)
            return true;
        return false;
    }
    
    static public int getTotalCultistPlayers(){
        return totalCultistPlayers;
    }
    
    
}

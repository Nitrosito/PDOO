/*
 * Copyright (C) 2016 nico
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

import GUI.Dice;
import GUI.NapakalakiView;
import GUI.PlayerNamesCapture;
import java.util.ArrayList;

/**
 *
 * @author nico
 */
public class Main {
    public static void main (String[] args){
        Napakalaki game= new Napakalaki(); //Tiene que referenciar a la instancia???
        NapakalakiView napakalakiView= new NapakalakiView(); //Tiene que construirse???
        Dice.createInstance(napakalakiView);
        napakalakiView.setNapakalaki(game);
        
        ArrayList<String> names;
        PlayerNamesCapture namesCapture=new PlayerNamesCapture(napakalakiView,true);
        
        names = namesCapture.getNames();
        
        game.initGame(names);
        napakalakiView.setVisible(true);
    }
}

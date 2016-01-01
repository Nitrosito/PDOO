/*
 * Copyright (C) 2015 nico
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
 * @author nico
 */
public class DeathBC extends NumericBC{
    
    private boolean death;

    public DeathBC(String text, boolean muerte) {
        super(text, 0, MAXTREASURES, MAXTREASURES);
        death=muerte;
    }
    
    public boolean getDeath(){
        return death;
    }
    
}

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
public class Region {
    private String name;
    private float temperature;
    
    
    public Region(String nombre, float temperatura){
        name=nombre;
        temperature=temperatura;
    }
    
    public String getName(){
        return name;
    }
    
    public float getTemperature(){
        return temperature;
    }
    
    public void setName(String nombre){
        name=nombre;
    }
    
    public void setTemperature(float temperatura){
        temperature=temperatura;
    }
}

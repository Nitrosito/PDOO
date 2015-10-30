//EXAMEN
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author nico
 */
public class Region {
    private String name;
    private float temperature;
    
    public Region(String nombre, float temp){
        this.name=nombre;
        this.temperature=temp;
    }
    
    public String getName(){
        return name;
    }
    
    public float getTemperature(){
        return temperature;
    }
    
    public void setName(String s){
        name = s;
    }
    
    public void setTemperature(float f){
        temperature = f;
    }
    
    public String toString(){
        return "\nNombre de la region:" + this.name + "\nTemperatura de la region: " + this.temperature;
    }
}

//FIN EXAMEN

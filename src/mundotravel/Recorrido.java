package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Recorrido {
    
    public String Nombre_Salida;
    public int duracion;
    public String Nombre_llegada;
    public int Codigo_Postal;
    
    
    public Recorrido(){
        
    }

    public Recorrido(String Nombre_Salida, int duracion, String Nombre_llegada, int Codigo_Postal) {
        this.Nombre_Salida = Nombre_Salida;
        this.duracion = duracion;
        this.Nombre_llegada = Nombre_llegada;
        this.Codigo_Postal = Codigo_Postal;
    }
    
    
    public void Escoger_Recorrido(String Nombre  , String llegada){
        
        this.Nombre_Salida = Nombre;
        this.Nombre_llegada = llegada;
        
        
    }
    
    
    
}

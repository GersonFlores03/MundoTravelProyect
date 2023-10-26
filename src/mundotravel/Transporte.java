package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Transporte {

    
    protected int Codigo_Transporte;
    protected String Nombre_Transporte;
    protected int Valoracion;
    protected String Descripcion;
    protected float Precio;
    
    public Transporte(int Codigo_Transporte, String Nombre_Transporte, int Valoracion, String Descripcion, float Precio) {
        this.Codigo_Transporte = Codigo_Transporte;
        this.Nombre_Transporte = Nombre_Transporte;
        this.Valoracion = Valoracion;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }
    
    
    public void ObtenerTransporte(){
         System.out.println("Has obtenido el Transporte");
        
    }
    
}

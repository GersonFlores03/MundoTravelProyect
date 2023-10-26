package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Comida {
    
    protected int Codigo_Comida;
    protected String Nombre_Comida;
    protected String Descripcion;
    protected float Precio;

    public Comida(int Codigo_Comida, String Nombre_Comida, String Descripcion, float Precio) {
        this.Codigo_Comida = Codigo_Comida;
        this.Nombre_Comida = Nombre_Comida;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }
    
    
    public void ObtenerPlato(){
        
     System.out.println("Has obtenido el Comida");
        
    }
    
    
}

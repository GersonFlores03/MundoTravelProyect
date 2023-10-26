package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Hotel {
    
    
    protected int Codigo_Hotel;
    protected String Nombre_Hotel;
    protected String Descripcion;
    protected int Valoracion;
    protected float Precio;

     public Hotel(int Codigo_Hotel, String Nombre_Hotel, String Descripcion, int Valoracion, float Precio) {
        this.Codigo_Hotel = Codigo_Hotel;
        this.Nombre_Hotel = Nombre_Hotel;
        this.Descripcion = Descripcion;
        this.Valoracion = Valoracion;
        this.Precio = Precio;
    }
    
    
    public void ObtenerHotel(){
       System.out.println("Has obtenido el paquete");
     
    }

  
}

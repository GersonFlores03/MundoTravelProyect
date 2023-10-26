package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class TiposPaquete {

    private int Codigo_Paquete;
    private String Nombre_Producto;
    private int Cantidad;
    private float precio;
    
     public TiposPaquete(int Codigo_Paquete, String Nombre_Producto, int Cantidad, float precio) {
        this.Codigo_Paquete = Codigo_Paquete;
        this.Nombre_Producto = Nombre_Producto;
        this.Cantidad = Cantidad;
        this.precio = precio;
    }
     
     
     public void ObtenerPaquete(){
          System.out.println("Has obtenido el paquete");
         
     }
     
     
     
    //Get para los atributos
     
     public int getCodigo(){
         return Codigo_Paquete;
     }
     
     
     public String getNombre(){
         return Nombre_Producto;
     }
     
     
     public int setCantidad(int Cantidad){
         return Cantidad;
     }

    public float getPrecio() {
        return precio;
    }
     
     
     
     
     
     
     
    
    
}

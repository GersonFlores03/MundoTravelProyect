package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Categorias {
    
    public int Nombre_Paquete;
    public String Precio;
    public int Descuentos;
    public String Descripcion;
    
    public Categorias(){
        
    }

    public Categorias(int Nombre_Paquete, String Precio, int Descuentos, String Descripcion) {
        this.Nombre_Paquete = Nombre_Paquete;
        this.Precio = Precio;
        this.Descuentos = Descuentos;
        this.Descripcion = Descripcion;
    }
    
   public int setNombre_Paquete(int Nombre_Paquete){
         return this.Nombre_Paquete = Nombre_Paquete;
     }
     
     public int getNombre_Paquete(){
         
         return Nombre_Paquete;
     }
     
   public String setPrecio(String Precio){
         return this.Precio = Precio;
     }
     
     public String getPrecio(){
         
         return Precio;
     }
     
   public int setDescuentos(int Descuentos){
         return this.Descuentos = Descuentos;
     }
     
     public int getDescuentos(){
         
         return Descuentos;
     } 
    public String setDescripcio(String Descripcio){
         return this.Descripcion = Descripcio;
     }
     
     public String getDescripcio(){
         
         return Descripcion;
     }
}



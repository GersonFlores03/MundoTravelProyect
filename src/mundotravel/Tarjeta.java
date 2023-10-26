package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Tarjeta {
    
    private int Numero_Tarjeta;
    private String Contraseña;
    private String Fecha;

    public Tarjeta(int Numero_Tarjeta, String Contraseña, String Fecha) {
        this.Numero_Tarjeta = Numero_Tarjeta;
        this.Contraseña = Contraseña;
        this.Fecha = Fecha;
    }
    
    
    
   public int getNumeroTarjeta(){
       return Numero_Tarjeta;
   }
   
   public String getContraseña(){
       return Contraseña;
   }
   
   public String getFecha(){
       
       return Fecha;
   }
    
    
    
    
    
}

package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Empresa {

   
    private String Nombre_Comercial;
    private int Codigo_Empresa;
    private int Ruc;
    private String Origen;
    
     public Empresa(String Nombre_Comercial, int Codigo_Empresa, int Ruc, String Origen) {
        this.Nombre_Comercial = Nombre_Comercial;
        this.Codigo_Empresa = Codigo_Empresa;
        this.Ruc = Ruc;
        this.Origen = Origen;
    }
     
     
     public String getNombre(){
         
         return Nombre_Comercial;
         
     }
     
     public int getCodigo(){
         
         return Codigo_Empresa;
     }
     
     
     public int getRuc(){
         return Ruc;
     }
     
     public String getOrigen(){
         
         return Origen;
     }
    
     
     
}

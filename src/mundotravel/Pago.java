package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Pago {
    
    private int Codigo_Pago;
    private String Nombre_Cliente;
    private String Correo;
    private int Numero;

    
    
    public Pago(){
        
    }
    
    public Pago(int Codigo_Pago, String Nombre_Cliente, String Correo,int Numero) {
        this.Codigo_Pago = Codigo_Pago;
        this.Nombre_Cliente = Nombre_Cliente;
        this.Correo = Correo;
        this.Numero = Numero;
    }
    
    public int SetCodigo_Pago(int Codigo_Pago){
        return this.Codigo_Pago = Codigo_Pago;
    }

     public int Codigo_Pago(){
        return Codigo_Pago;
    }
    
    public String Nombre_Cliente(String Nombre_Cliente){
        return this.Nombre_Cliente = Nombre_Cliente;
    }
    
    public String getNombre_Cliente(){
        return Nombre_Cliente;
    }
    
    public String Nombre_Correo(String Correo){
        return this.Correo = Correo;
    }
    
    public String getCorreo(){
        return Correo;
    }
    
     public int SetNumero(int Numero){
        return this.Numero = Numero;
    }

     public int Numero(){
        return Numero;
    }
    
    
}

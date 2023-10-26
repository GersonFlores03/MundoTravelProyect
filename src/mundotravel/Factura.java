package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Factura {
   
    private int Numero_Factura;
    private int Numero_Pedido;
    private float Importe;
    private String Descripcion;
    private int  Cantidad; 
    
    
    
      public Factura(int Numero_Factura, int Numero_Pedido, float Importe, String Descripcion, int Cantidad) {
        this.Numero_Factura = Numero_Factura;
        this.Numero_Pedido = Numero_Pedido;
        this.Importe = Importe;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
    }
      
    public int getNumero(){
        return Numero_Factura;
        
    }
    
    public int getPedido(){
        return Numero_Pedido;
        
    }
    
    public float getImporte(){
        return Importe;
    }
    
    
    public String getDescripcio(){
        return Descripcion;
    }
    
    
    public int getCantidad(){
        return Cantidad;
    }
    
      
      
}

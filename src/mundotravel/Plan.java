package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Plan {

    private int Codigo_Plan;
    private String Nombre_Plan;
    private float Precio;
    private float Descuentos;
    
    
    public Plan(){
        
    }
    
    public Plan(int Codigo_Plan, String Nombre_Plan, float Precio, float Descuentos) {
        this.Codigo_Plan = Codigo_Plan;
        this.Nombre_Plan = Nombre_Plan;
        this.Precio = Precio;
        this.Descuentos = Descuentos;
    }
    
    
    
    public int getCodigo(){
        return Codigo_Plan;
    }
    
    public String getNombre(){
        return Nombre_Plan;
    }
    
    public float setPrecio(float precio){
        return this.Precio = precio;
    }
    
     public float setDescuento(float descuento){
        return this.Descuentos = descuento;
    }
    
}

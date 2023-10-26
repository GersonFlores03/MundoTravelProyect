package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Compra {
    
    private int Codigo_Compra;
    private String Nombre_Producto;
    private int Cantidad;
    private int Precio;
    private String Descripcion;

    public Compra(String Nombre_Producto, int Codigo_Compra, String Descripcion, int Cantidad, int Precio) {
        this.Nombre_Producto = Nombre_Producto;
        this.Codigo_Compra = Codigo_Compra;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }
    
    
//    public void Descuentos(){
//        
//    }
    public int getCodigo_Compra(){
        return Codigo_Compra;
    }
    
    public String getNombre_Producto(){
        return Nombre_Producto;
    }
    
    
    public String getDescripcion(){
        return Descripcion;
    }
    public int getCantidad(){
        return Cantidad;
    }
    
    public int getPrecio(){
        return Precio;
    }
    
}

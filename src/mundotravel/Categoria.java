package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// GENTEEEEEEEEEEEEEEEEE
/**
 *
 * @author USER
 */
public class Categoria {
    
    public String Nombre;
    public String Local;
    public float Tarifa;
    public float Descuentos;
    
    public Categoria(){
        
    }

    public Categoria(String Nombre, String Local, float Tarifa, float Descuentos) {
        this.Nombre = Nombre;
        this.Local = Local;
        this.Tarifa = Tarifa;
        this.Descuentos = Descuentos;
    }
    
    public String getNombre(){
        return Nombre;
       
    }
    
    public String getLocal(){
        return Local;
    }
    
    
    
}



package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ingenieria
 */
public class TipoComida extends Comida {
    
    
    public int idComida;

    public TipoComida(int idComida, int Codigo_Comida, String Nombre_Comida, String Descripcion, float Precio) {
        super(Codigo_Comida, Nombre_Comida, Descripcion, Precio);
        this.idComida = idComida;
    }
    
    
    public void ObtenerComida(){
        
        
    }
    
    
}

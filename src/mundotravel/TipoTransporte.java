package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ingenieria
 */
public class TipoTransporte extends Transporte {
    
    
    public int idTransporte;

    public TipoTransporte(int idTransporte, int Codigo_Transporte, String Nombre_Transporte, int Valoracion, String Descripcion, float Precio) {
        super(Codigo_Transporte, Nombre_Transporte, Valoracion, Descripcion, Precio);
        this.idTransporte = idTransporte;
    }
    
    
    public void ObtenerTransporte(){
        
        
    }
    
    
    
}

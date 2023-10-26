package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Pasaje {
   
    private String Agencia;
    private String Fecha_Hora;
    private int Cod_Vuelo;
    private int Num_Asiento;
    private String From_to;
    private int Num_Viajeros;
    
    
    
    
    
    
    public Pasaje(){
        
    }

    public Pasaje(String Agencia, String Fecha_Hora, int Cod_Vuelo, int Num_Asiento, String From_to, int Num_Viajeros) {
        this.Agencia = Agencia;
        this.Fecha_Hora = Fecha_Hora;
        this.Cod_Vuelo = Cod_Vuelo;
        this.Num_Asiento = Num_Asiento;
        this.From_to = From_to;
        this.Num_Viajeros = Num_Viajeros;
    }
    
   
     

    
    public String SetAgencia(String Agencia){
        return this.Agencia = Agencia;
    }
    
    public String getAgencia(){
        return Agencia;
    }
  
    public String SetFrom_to(String From_to){
        return this.From_to = From_to;
    }
    
    public String getFrom_to(){
        return From_to;
    }
    
    public String setFecha_Hora(String Fecha_Hora){
         return this.Fecha_Hora = Fecha_Hora;
     }
     
     public String getFecha_Hora(){
         
         return Fecha_Hora;
     }
     
     public int setCod_Vuelo(int Cod_Vuelo){
         return this.Cod_Vuelo = Cod_Vuelo;
     }
     
     public int getCod_Vuelo(){
         
         return Cod_Vuelo;
     }
    
     public int setNum_Asiento(int Num_Asiento){
         return this.Num_Asiento = Num_Asiento;
     }
     
     public int getNum_Asiento(){
         
         return Num_Asiento;
     }
     
     public int setNum_Viajeros(int Num_Viajeros){
         return this.Num_Viajeros = Num_Viajeros;
     }
     
     public int getNum_Viajeros(){
         
         return Num_Viajeros;
     }
 
    
    public int setPasajero(int cantidad){
        
       int MiCantidad = this.Num_Viajeros= cantidad;
       if(MiCantidad <= 3){
           System.out.println("Boleto correcto ");
       }else{
            System.out.println("No tiene autorizacion");
       }
       
       return cantidad;
    }
    
    public int getPasajero(){
        return  Num_Viajeros;
    }

    public String getDestino() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
    
    
    
    
    
}

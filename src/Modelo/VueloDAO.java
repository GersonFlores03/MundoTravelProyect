/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mundotravel.Vuelo;


public class VueloDAO {
    
    Connection myconexion;
    PreparedStatement consulta;
    ResultSet resultado;
    
    Conexionbd conexion = new Conexionbd();
    
     public Vuelo BuscarProducto(String origen){
       
      Vuelo dato = new Vuelo();
       
       String sql = "SELECT * FROM vuelo WHERE origen = ?";
       try {
          myconexion = conexion.getConnection();
          consulta = myconexion.prepareStatement(sql);
          consulta.setString(1 , origen);
          resultado = consulta.executeQuery();
          
          if(resultado.next()){
              dato.setDestino(resultado.getString("destino"));
              dato.setFecha(resultado.getString("fecha"));
              dato.setDistancia(resultado.getFloat("distancia"));
              dato.setPrecio(resultado.getFloat("precio"));
                System.out.println("Se encontro el dato: " + origen);
               
          }else{
              System.out.println("No se encontraron resultados para el origen: " + origen);
          }
          
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
    return dato;
}
     
     
 //Paquete especifico
     
public Vuelo ProductoOne(String origen) {
    Vuelo dato = new Vuelo();
    String sql = "SELECT * FROM vuelo WHERE origen = 'Lima'";
    
    try (Connection myconexion = conexion.getConnection();
         PreparedStatement consulta = myconexion.prepareStatement(sql)) {

        

        try (ResultSet resultado = consulta.executeQuery()) {
            if (resultado.next()) {
                dato.setDestino(resultado.getString("destino"));
                dato.setFecha(resultado.getString("fecha"));
                dato.setDistancia(resultado.getFloat("distancia"));
                dato.setPrecio(resultado.getFloat("precio"));
                System.out.println("Se encontró el dato para el origen Lima");
            } else {
                System.out.println("No se encontraron resultados para el origen Lima");
            }
        }

    } catch (SQLException e) {
        System.out.println("Error al ejecutar la consulta SQL: " + e.toString());
    }

    return dato;
}

     
  public Vuelo ProductoTwo(String origen) {
    Vuelo dato = new Vuelo();
    String sql = "SELECT * FROM vuelo WHERE origen = 'Chiclayo'";
    
    try (Connection myconexion = conexion.getConnection();
         PreparedStatement consulta = myconexion.prepareStatement(sql)) {

        

        try (ResultSet resultado = consulta.executeQuery()) {
            if (resultado.next()) {
                dato.setDestino(resultado.getString("destino"));
                dato.setFecha(resultado.getString("fecha"));
                dato.setDistancia(resultado.getFloat("distancia"));
                dato.setPrecio(resultado.getFloat("precio"));
                System.out.println("Se encontró el dato para el origen Lima");
            } else {
                System.out.println("No se encontraron resultados para el origen Lima");
            }
        }

    } catch (SQLException e) {
        System.out.println("Error al ejecutar la consulta SQL: " + e.toString());
    }

    return dato;
}
  
  
  public Vuelo ProductoThree(String origen) {
    Vuelo dato = new Vuelo();
    String sql = "SELECT * FROM vuelo WHERE origen = 'Huaraz'";
    
    try (Connection myconexion = conexion.getConnection();
         PreparedStatement consulta = myconexion.prepareStatement(sql)) {

        

        try (ResultSet resultado = consulta.executeQuery()) {
            if (resultado.next()) {
                dato.setDestino(resultado.getString("destino"));
                dato.setFecha(resultado.getString("fecha"));
                dato.setDistancia(resultado.getFloat("distancia"));
                dato.setPrecio(resultado.getFloat("precio"));
                System.out.println("Se encontró el dato para el origen Lima");
            } else {
                System.out.println("No se encontraron resultados para el origen Lima");
            }
        }

    } catch (SQLException e) {
        System.out.println("Error al ejecutar la consulta SQL: " + e.toString());
    }

    return dato;
}


     
   
     
     
     
}

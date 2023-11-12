/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mundotravel.Paquete;


/**
 *
 * @author USER
 */
public class PaqueteDAO {
    
     Connection myconexion;
     PreparedStatement consulta;
     ResultSet resultado;
    
     Conexionbd conexion = new Conexionbd();
     
      public Paquete PaqueteAll(String nombre) {
      Paquete dato = new Paquete();
      String sql = "SELECT * FROM paquete WHERE nombre = 'Paquete Basico'";
    
       try (Connection myconexion = conexion.getConnection();
         PreparedStatement consulta = myconexion.prepareStatement(sql)) {

        

        try (ResultSet resultado = consulta.executeQuery()) {
            if (resultado.next()) {
                dato.setValoracion(resultado.getInt("valoracion"));
                dato.setPrecio(resultado.getFloat("precio"));
                dato.setCantidad(resultado.getInt("cantidad"));
                dato.setStock(resultado.getInt("stock"));
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
      
      
   public Paquete PaqueteAllTwo(String nombre) {
      Paquete dato = new Paquete();
      String sql = "SELECT * FROM paquete WHERE nombre = 'Paquete Intermedio'";
    
    try (Connection myconexion = conexion.getConnection();
         PreparedStatement consulta = myconexion.prepareStatement(sql)) {

        

        try (ResultSet resultado = consulta.executeQuery()) {
            if (resultado.next()) {
                dato.setValoracion(resultado.getInt("valoracion"));
                dato.setPrecio(resultado.getFloat("precio"));
                dato.setCantidad(resultado.getInt("cantidad"));
                 dato.setStock(resultado.getInt("stock"));
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
   
   
   public Paquete PaqueteAllThree(String nombre) {
      Paquete dato = new Paquete();
      String sql = "SELECT * FROM paquete WHERE nombre = 'Paquete Avanzado'";
    
    try (Connection myconexion = conexion.getConnection();
         PreparedStatement consulta = myconexion.prepareStatement(sql)) {

        

        try (ResultSet resultado = consulta.executeQuery()) {
            if (resultado.next()) {
                dato.setValoracion(resultado.getInt("valoracion"));
                dato.setPrecio(resultado.getFloat("precio"));
                dato.setCantidad(resultado.getInt("cantidad"));
                 dato.setStock(resultado.getInt("stock"));
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

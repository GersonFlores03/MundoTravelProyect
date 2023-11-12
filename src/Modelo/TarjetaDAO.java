/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mundotravel.Tarjeta;

public class TarjetaDAO {
    
    
    Connection myconexion;
    PreparedStatement consulta;
    ResultSet resultado;
    
    Conexionbd conexion = new Conexionbd();
    
    
    public Tarjeta TarjetaVisa(){
         Tarjeta dato = new Tarjeta();
         String sql = "SELECT * FROM tarjeta LIMIT 1";
         
          try (Connection myconexion = conexion.getConnection();
         PreparedStatement consulta = myconexion.prepareStatement(sql)) {

        

        try (ResultSet resultado = consulta.executeQuery()) {
            if (resultado.next()) {
                dato.setNombre(resultado.getString("nombre"));
                //System.out.println("Se encontró el dato para el origen Lima");
            } else {
                System.out.println("No se encontraron la tarjeta");
            }
        }

    } catch (SQLException e) {
        System.out.println("Error al ejecutar la consulta SQL: " + e.toString());
    }

    return dato;
        
    }
    
    
    
     public Tarjeta TarjetaMastercard(){
         Tarjeta dato = new Tarjeta();
         String sql = "SELECT * FROM tarjeta LIMIT 1 OFFSET 1";
         
          try (Connection myconexion = conexion.getConnection();
         PreparedStatement consulta = myconexion.prepareStatement(sql)) {

        

        try (ResultSet resultado = consulta.executeQuery()) {
            if (resultado.next()) {
                dato.setNombre(resultado.getString("nombre"));
                //System.out.println("Se encontró el dato para el origen Lima");
            } else {
                System.out.println("No se encontraron la tarjeta");
            }
        }

    } catch (SQLException e) {
        System.out.println("Error al ejecutar la consulta SQL: " + e.toString());
    }

    return dato;
        
    }
    
    
     
    public Tarjeta TarjetaAmerica(){
         Tarjeta dato = new Tarjeta();
         String sql = "SELECT * FROM tarjeta LIMIT 1 OFFSET 2";
         
          try (Connection myconexion = conexion.getConnection();
         PreparedStatement consulta = myconexion.prepareStatement(sql)) {

        

        try (ResultSet resultado = consulta.executeQuery()) {
            if (resultado.next()) {
                dato.setNombre(resultado.getString("nombre"));
                //System.out.println("Se encontró el dato para el origen Lima");
            } else {
                System.out.println("No se encontraron la tarjeta");
            }
        }

    } catch (SQLException e) {
        System.out.println("Error al ejecutar la consulta SQL: " + e.toString());
    }

    return dato;
        
    } 
    
    
}

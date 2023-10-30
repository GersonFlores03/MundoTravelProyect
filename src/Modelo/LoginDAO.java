/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mundotravel.Cliente;

/**
 *
 * @author USER
 */
public class LoginDAO {
    
    Connection myconexion;
    PreparedStatement consulta;
    ResultSet resultado;
    
    Conexionbd conexion = new Conexionbd();
    
    
    public Cliente log(String correo , String contraseña){
        Cliente cli = new Cliente();
        String sql = "SELECT * FROM cliente WHERE correo = ? and contraseña = ?";
        
        try {
            myconexion = conexion.getConnection();
            consulta = myconexion.prepareStatement(sql);
            consulta.setString(1 , correo);
            consulta.setString(2 , contraseña);
            resultado = consulta.executeQuery();
            
            if(resultado.next()){
                cli.setId(resultado.getInt("id"));
                cli.setNombre(resultado.getString("nombre"));
                cli.setApellido(resultado.getString("apellido"));
                cli.setDni(resultado.getInt("dni"));
                cli.setCorreo(resultado.getString("correo"));
                cli.setContraseña(resultado.getString("contraseña"));
                
            }
           
        } catch (SQLException e) {
            
            System.out.println(e. toString());
            //Comentario de Prueba
        }
        
        return cli;
        
    }
    
    //Verificar que exita el dato del usuario
    
    public Cliente Verificar(String nombre){
        Cliente cli = new Cliente();
        String sql = "SELECT * FROM cliente WHERE nombre = ?";
        
        try {
            myconexion = conexion.getConnection();
            consulta = myconexion.prepareStatement(sql);
            consulta.setString(1 , nombre);
            resultado = consulta.executeQuery();
            
            if(resultado.next()){
                cli.setId(resultado.getInt("id"));
                cli.setNombre(resultado.getString("nombre"));
                cli.setApellido(resultado.getString("apellido"));
                cli.setDni(resultado.getInt("dni"));
                cli.setCorreo(resultado.getString("correo"));
                cli.setContraseña(resultado.getString("contraseña"));
                
            }
           
        } catch (SQLException e) {
            
            System.out.println(e. toString());
            //Comentario de Prueba
        }
        
        return cli;
        
    }
    
    
    
    
    
    public boolean RecuperarContraseña(Cliente cl){
        String sqlTwo = "INSERT INTO Cliente( nombre , apellido , dni ,correo , contraseña) VALUES(?,?,?,?,?)";
        try {
             myconexion = conexion.getConnection();
             consulta = myconexion.prepareStatement(sqlTwo);
             consulta.setString(1, cl.getNombre());
             consulta.setString(2, cl.getApellido());
             consulta.setInt(3, cl.getDni());
             consulta.setString(4, cl.getCorreo());
             consulta.setString(5, cl.getContraseña());
             consulta.execute();
             return true;
        } catch (Exception e) {
            System.out.println(e. toString());
            return false;
            
        }finally{
            try {
                myconexion.close();
            } catch (Exception e) {
                  System.out.println(e. toString());
            }
        }
    }
    
    
}


    
    
    
    
    


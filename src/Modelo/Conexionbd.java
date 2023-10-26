/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class Conexionbd {
    
        Connection conexionbd;
        
        public Connection getConnection(){
            
            try {
                String myBaseDatos = "jdbc:mysql://localhost:3306/mundo_travel?serverTimezone=UTC";
                conexionbd = DriverManager.getConnection(myBaseDatos , "root" , "");
                return conexionbd;
            } catch (SQLException e) {
                
                System.out.println(e.toString());
               
            }
             return null;
        }
        
    
}

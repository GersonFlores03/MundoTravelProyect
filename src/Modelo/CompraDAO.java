/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mundotravel.Compra;

/**
 *
 * @author USER
 */
public class CompraDAO {
    
      Connection myconexion;
      PreparedStatement consulta;
      ResultSet resultado;
    
      Conexionbd conexion = new Conexionbd();
      
      public boolean PagoCliente(Compra co){
          String sql = "INSERT INTO compra ( tarjeta, numero, fecha, codigo, titular) VALUES (?,?,?,?,?)";
          try {
              myconexion = conexion.getConnection();
              consulta = myconexion.prepareStatement(sql);
              consulta.setString(1 , co.getTarjeta());
              consulta.setInt(2,co.getNumero());
              consulta.setString(3, co.getFecha());
              consulta.setInt(4 , co.getCodigo());
              consulta.setString(5 , co.getTitular());
              consulta.execute();
              return true;
          } catch (SQLException e) {
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

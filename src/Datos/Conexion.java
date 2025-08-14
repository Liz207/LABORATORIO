/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.Connection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import  java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Datos.Aeropuertos;

/**
 *
 * @author irvin
 */
public class Conexion {
   
        //constructor
public Conexion(){
    
}

        //Metodo de conexion
    public static Connection getConnection() throws SQLException{
        String CadenaDeConexion = "jdbc:sqlserver://localhost:1434;" + //este seria el parametro para establecer la conexion
                "database=SistemaReservasVuelo;" + //nombre de la base de datos
                "user=sa;" + //nombre del usuario
                "password = 981495;" + //clave de conexion
                "Encrypt=true;"+ //conexion  encriptada
                "TrustServerCertificate=true;";
        try{
                           Connection con = DriverManager.getConnection(CadenaDeConexion);
            return con;
        } catch (SQLServerException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
        
            }
    
        public static int siguienteAeropuerto() throws SQLException{
        int resultado = 1;
         try{
                Statement sql = (Statement) Conexion.getConnection().createStatement();
                //crear una variable tipo string
                String consultas = " SELECT max (AeropuertoID) as Id_Aeropuerto  " +
                                              " FROM Aeropuertos  ";
         
                        //ejecutar la consulta y llenar los resultados obtenidos
                        ResultSet rs = sql.executeQuery(consultas);
                        while (rs.next()){
                          resultado = (rs.getInt(1)) +1;
                        }
                }catch (SQLServerException e){
                    JOptionPane.showMessageDialog(null, e.toString());
            }
        return resultado;
    }
        
        
          public static int insertAeropuerto(Aeropuertos miAeropuerto) throws SQLException{
        int listaafectadas = 0;
        Statement sql = (Statement) Conexion.getConnection().createStatement();
        String insertar = "INSERT INTO Aeropuertos " +
                                    "VALUES(" + miAeropuerto.getAeropuertoID()+ ", " +
                                    "'" + miAeropuerto.getCodigoIATA().trim() + "', " +
                                    "'" + miAeropuerto.getNombreAeropuerto().trim() + "', " +
                                    "'" + miAeropuerto.getCiudad().trim() + "', " +
                                    "'" + miAeropuerto.getPais().trim() + ")";
        JOptionPane.showConfirmDialog(null, insertar);
       listaafectadas = sql.executeUpdate(insertar);
        return listaafectadas;
    }
    
        
            
    
    
    
}

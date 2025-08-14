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
    
            public static ResultSet listarAeropuerto () throws SQLException{
         try{
            //declarar la conexion a sqlServer
            Statement sql =(Statement) Conexion.getConnection().createStatement();
            //crear variable con sentencia o scrip sql
            String consulta="  Select *  "+
                                        "  From Aeropuertos  ";
            //ejecutar la consulta y llenar una estructura con el o los resultados obtenidos
            ResultSet rs = sql.executeQuery(consulta); 
            return rs;
        }catch (SQLServerException e){
            JOptionPane.showMessageDialog(null, e.toString() );
            return null;
        }
    }
            
    public static int updateAeropuerto (Aeropuertos miAeropuerto) throws SQLException{
        int listaafectadas = 0;
        Statement sql = (Statement) Conexion.getConnection().createStatement();
        String update = " update Aeropuertos  " +
                                   " set NombreAeropuerto = ' " + miAeropuerto.getNombreAeropuerto()+"', "+ 
                                    "  Ciudad = '"+miAeropuerto.getCiudad()+"', "+
                                    " Pais = '" +miAeropuerto.getPais()+ "' "+
                                   " WHERE AeropuertoID = " + miAeropuerto.getAeropuertoID();

        JOptionPane.showConfirmDialog(null,update);
       listaafectadas = sql.executeUpdate(update);
        return listaafectadas;
    }
    
     public static Aeropuertos obtenerAeropuerto (String ID) throws SQLException{
        try{
                Statement sql = (Statement) Conexion.getConnection().createStatement();
                //crear una variable tipo string
                String consultas = " SELECT *  " +
                                              " FROM Aeropuertos  "+
                                              " WHERE AeropuertosID = " + ID;
         
                        //ejecutar la consulta y llenar los resultados obtenidos
                        ResultSet rs = sql.executeQuery(consultas);
                        Aeropuertos Encontrado = new Aeropuertos();
                        while (rs.next()){
                          Encontrado.setAeropuertoID(rs.getInt(1));
                          Encontrado.setCodigoIATA(rs.getString(2));
                          Encontrado.setNombreAeropuerto(rs.getString(3));
                          Encontrado.setCiudad(rs.getString(4));
                          Encontrado.setPais(rs.getString(5));
                        }
                        return Encontrado;
                }catch (SQLServerException e){
                    JOptionPane.showMessageDialog(null, e.toString());
                    return  null;
            }
    }
              public static int borrarAeropuerto(int ID) throws SQLException{
        int listaafectadas = 0;
        Statement sql = (Statement) Conexion.getConnection().createStatement();
        String delete = " delete from Aeropuertos  " +
                                   " WHERE AeropuertoID = " + ID;

        JOptionPane.showConfirmDialog(null,delete);
       listaafectadas = sql.executeUpdate(delete);
        return listaafectadas;
    }    
              
    //VUELOS
                 
        public static int siguienteVuelo() throws SQLException{
        int resultado = 1;
         try{
                Statement sql = (Statement) Conexion.getConnection().createStatement();
                //crear una variable tipo string
                String consultas = " SELECT max (VueloID) as Id_Vuelo  " +
                                              " FROM Vuelos  ";
         
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
        
        
          public static int insetVuelo(Vuelos miVuelo) throws SQLException{
        int listaafectadas = 0;
        Statement sql = (Statement) Conexion.getConnection().createStatement();
        String insertar = "INSERT INTO Vuelos " +
                                    "VALUES(" + miVuelo.getVueloID()+ ", " +
                                    "'" + miVuelo.getNumeroVuelo().trim() + "', " +
                                    "" + miVuelo.getAeropuertoOrigenID() + ", " +
                                    "" + miVuelo.getAeropuertoDestinoID() + ", " +
                                    "'" + miVuelo.getFechaSalida() + ")";
        JOptionPane.showConfirmDialog(null, insertar);
       listaafectadas = sql.executeUpdate(insertar);
        return listaafectadas;
    }
    
            public static ResultSet listarVuelo () throws SQLException{
         try{
            //declarar la conexion a sqlServer
            Statement sql =(Statement) Conexion.getConnection().createStatement();
            //crear variable con sentencia o scrip sql
            String consulta="  Select *  "+
                                        "  From Vuelos  ";
            //ejecutar la consulta y llenar una estructura con el o los resultados obtenidos
            ResultSet rs = sql.executeQuery(consulta); 
            return rs;
        }catch (SQLServerException e){
            JOptionPane.showMessageDialog(null, e.toString() );
            return null;
        }
    }
            
    public static int updateVuelo (Vuelos miVuelo) throws SQLException{
        int listaafectadas = 0;
        Statement sql = (Statement) Conexion.getConnection().createStatement();
        String update = " update Vuelos  " +
                                   " set AeropuertoOrigenID =  " + miVuelo.getAeropuertoOrigenID()+", "+ 
                                    "  AeropuertoDestinoID = "+miVuelo.getAeropuertoDestinoID()+", "+
                                    " FechaSalida = '" +miVuelo.getFechaSalida()+ "' "+
                                   " WHERE VueloID = " + miVuelo.getVueloID();

        JOptionPane.showConfirmDialog(null,update);
       listaafectadas = sql.executeUpdate(update);
        return listaafectadas;
    }
    
     public static Vuelos obtenerVuelo (String ID) throws SQLException{
        try{
                Statement sql = (Statement) Conexion.getConnection().createStatement();
                //crear una variable tipo string
                String consultas = " SELECT *  " +
                                              " FROM Vuelos  "+
                                              " WHERE VueloID = " + ID;
         
                        //ejecutar la consulta y llenar los resultados obtenidos
                        ResultSet rs = sql.executeQuery(consultas);
                        Vuelos Encontrado = new Vuelos();
                        while (rs.next()){
                          Encontrado.setVueloID(rs.getInt(1));
                          Encontrado.setNumeroVuelo(rs.getString(2));
                          Encontrado.setAeropuertoOrigenID(rs.getInt(3));
                          Encontrado.setAeropuertoDestinoID(rs.getInt(4));
                          Encontrado.setFechaSalida(rs.getDate(5));
                        }
                        return Encontrado;
                }catch (SQLServerException e){
                    JOptionPane.showMessageDialog(null, e.toString());
                    return  null;
            }
    }
                  public static int borrarVuelo(int ID) throws SQLException{
        int listaafectadas = 0;
        Statement sql = (Statement) Conexion.getConnection().createStatement();
        String delete = " delete from Vuelos  " +
                                   " WHERE VuelosID = " + ID;

        JOptionPane.showConfirmDialog(null,delete);
       listaafectadas = sql.executeUpdate(delete);
        return listaafectadas;
}
                  
                  
  public static String nombreAeropuerto (int ID) throws  SQLException{
            String resul="";
            //SQL requiere el uso de try y catchnjm
            try{
                Statement sql = (Statement) Conexion.getConnection().createStatement();
                //crear una variable tipo string
                String consultas = "  Select  NombreAeropuerto  "+
                                                  "  From Aeropuertos  "+
                                                  "  Where AeropuertoID= "+ID;
                        //ejecutar la consulta y llenar los resultados obtenidos
                        ResultSet rs = sql.executeQuery(consultas);
                        while (rs.next()){
                          //resul = Integer.valueOf(rs.getString(1) );
                          resul = rs.getString(1);
                        }
                }catch (SQLServerException e){
                    JOptionPane.showMessageDialog(null, e.toString());
            }
            return resul;
    }
}
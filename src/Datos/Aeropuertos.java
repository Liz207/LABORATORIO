/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author irvin
 */
public class Aeropuertos {
    int AeropuertoID;
    String CodigoIATA;
    String NombreAeropuerto;
    String Ciudad;
    String Pais;

    public Aeropuertos(int AeropuertoID, String CodigoIATA, String NombreAeropuerto, String Ciudad, String Pais) {
        this.AeropuertoID = AeropuertoID;
        this.CodigoIATA = CodigoIATA;
        this.NombreAeropuerto = NombreAeropuerto;
        this.Ciudad = Ciudad;
        this.Pais = Pais;
    }

    public int getAeropuertoID() {
        return AeropuertoID;
    }

    public void setAeropuertoID(int AeropuertoID) {
        this.AeropuertoID = AeropuertoID;
    }

    public String getCodigoIATA() {
        return CodigoIATA;
    }

    public void setCodigoIATA(String CodigoIATA) {
        this.CodigoIATA = CodigoIATA;
    }

    public String getNombreAeropuerto() {
        return NombreAeropuerto;
    }

    public void setNombreAeropuerto(String NombreAeropuerto) {
        this.NombreAeropuerto = NombreAeropuerto;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    
    
}

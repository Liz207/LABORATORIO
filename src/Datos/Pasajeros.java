/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.util.Date;

/**
 *
 * @author irvin
 */
public class Pasajeros {
    int PasajeroID;
    String NumeroDocumento;
    String NombreCompleto;
    Date FechaNacimiento;
    String Telefono;

    public Pasajeros() {
    }

    public Pasajeros(int PasajeroID, String NumeroDocumento, String NombreCompleto, Date FechaNacimiento, String Telefono) {
        this.PasajeroID = PasajeroID;
        this.NumeroDocumento = NumeroDocumento;
        this.NombreCompleto = NombreCompleto;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
    }

    public int getPasajeroID() {
        return PasajeroID;
    }

    public void setPasajeroID(int PasajeroID) {
        this.PasajeroID = PasajeroID;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
}

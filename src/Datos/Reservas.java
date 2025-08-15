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
public class Reservas {
    int ReservaID;
    int PasajeroID;
    int VueloID;
    Date FechaReserva;
    String PrecioFinal;

    public Reservas() {
    }

    public Reservas(int ReservaID, int PasajeroID, int VueloID, Date FechaReserva, String PrecioFinal) {
        this.ReservaID = ReservaID;
        this.PasajeroID = PasajeroID;
        this.VueloID = VueloID;
        this.FechaReserva = FechaReserva;
        this.PrecioFinal = PrecioFinal;
    }

    public int getReservaID() {
        return ReservaID;
    }

    public void setReservaID(int ReservaID) {
        this.ReservaID = ReservaID;
    }

    public int getPasajeroID() {
        return PasajeroID;
    }

    public void setPasajeroID(int PasajeroID) {
        this.PasajeroID = PasajeroID;
    }

    public int getVueloID() {
        return VueloID;
    }

    public void setVueloID(int VueloID) {
        this.VueloID = VueloID;
    }

    public Date getFechaReserva() {
        return FechaReserva;
    }

    public void setFechaReserva(Date FechaReserva) {
        this.FechaReserva = FechaReserva;
    }

    public String getPrecioFinal() {
        return PrecioFinal;
    }

    public void setPrecioFinal(String PrecioFinal) {
        this.PrecioFinal = PrecioFinal;
    }
    
    
}

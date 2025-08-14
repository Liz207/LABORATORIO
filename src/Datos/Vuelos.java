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
public class Vuelos {
  int VueloID;
  String NumeroVuelo;
  int AeropuertoOrigenID;
  int AeropuertoDestinoID;
  Date FechaSalida;

    public Vuelos() {
    }

    public Vuelos(int VueloID, String NumeroVuelo, int AeropuertoOrigenID, int AeropuertoDestinoID, Date FechaSalida) {
        this.VueloID = VueloID;
        this.NumeroVuelo = NumeroVuelo;
        this.AeropuertoOrigenID = AeropuertoOrigenID;
        this.AeropuertoDestinoID = AeropuertoDestinoID;
        this.FechaSalida = FechaSalida;
    }

    public int getVueloID() {
        return VueloID;
    }

    public void setVueloID(int VueloID) {
        this.VueloID = VueloID;
    }

    public String getNumeroVuelo() {
        return NumeroVuelo;
    }

    public void setNumeroVuelo(String NumeroVuelo) {
        this.NumeroVuelo = NumeroVuelo;
    }

    public int getAeropuertoOrigenID() {
        return AeropuertoOrigenID;
    }

    public void setAeropuertoOrigenID(int AeropuertoOrigenID) {
        this.AeropuertoOrigenID = AeropuertoOrigenID;
    }

    public int getAeropuertoDestinoID() {
        return AeropuertoDestinoID;
    }

    public void setAeropuertoDestinoID(int AeropuertoDestinoID) {
        this.AeropuertoDestinoID = AeropuertoDestinoID;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }
  
  
}

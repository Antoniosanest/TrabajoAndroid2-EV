package com.example.bookingandroid.entities;

import com.google.gson.annotations.SerializedName;

public class Habitacion {
    @SerializedName("IDHABITACIOM")
    private int idHabitacion;
    @SerializedName("NUMERO")
    private String numeroHabitacion;
    @SerializedName("DESCRIPCION")
    private String descripcionHabitacion;
    @SerializedName("IDHOTEL")
    private String idHotelHabitacion;
    @SerializedName("CAPACIDAD")
    private String capacidadHabitacion;
    @SerializedName("PRECIO")
    private int precioHabitacion;
    @SerializedName("DISPONIBLE")
    private String disponible;

    public Habitacion(int idHabitacion, String numeroHabitacion, String descripcionHabitacion, String idHotelHabitacion, String capacidadHabitacion, int precioHabitacion, String disponible) {
        this.idHabitacion = idHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.descripcionHabitacion = descripcionHabitacion;
        this.idHotelHabitacion = idHotelHabitacion;
        this.capacidadHabitacion = capacidadHabitacion;
        this.precioHabitacion = precioHabitacion;
        this.disponible = disponible;
    }

    public Habitacion() {

    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getDescripcionHabitacion() {
        return descripcionHabitacion;
    }

    public void setDescripcionHabitacion(String descripcionHabitacion) {
        this.descripcionHabitacion = descripcionHabitacion;
    }

    public String getIdHotelHabitacion() {
        return idHotelHabitacion;
    }

    public void setIdHotelHabitacion(String idHotelHabitacion) {
        this.idHotelHabitacion = idHotelHabitacion;
    }

    public String getCapacidadHabitacion() {
        return capacidadHabitacion;
    }

    public void setCapacidadHabitacion(String capacidadHabitacion) {
        this.capacidadHabitacion = capacidadHabitacion;
    }

    public int getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(int precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
}

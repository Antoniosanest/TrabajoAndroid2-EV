package com.example.bookingandroid.entities;

import com.google.gson.annotations.SerializedName;

public class Hotel {
    @SerializedName("ID_HOTEL")
    private int idHotel;
    @SerializedName("NOMBRE")
    private String nombreHotel;
    @SerializedName("DESCRIPCION")
    private String descripcionHotel;
    @SerializedName("CIUDAD")
    private String CiudadHotel;
    @SerializedName("PAIS")
    private String PaisHotel;
    @SerializedName("RATE")
    private int rateHotel;
    @SerializedName("OPINIONES")
    private int opinionesHotel;
    @SerializedName("IMG")
    private String imgHotel;

    public Hotel() {

    }

    public Hotel(int idHotel, String nombreHotel, String descripcionHotel, String ciudadHotel, String paisHotel, int rateHotel, int opinionesHotel, String imgHotel) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
        this.descripcionHotel = descripcionHotel;
        CiudadHotel = ciudadHotel;
        PaisHotel = paisHotel;
        this.rateHotel = rateHotel;
        this.opinionesHotel = opinionesHotel;
        this.imgHotel = imgHotel;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getDescripcionHotel() {
        return descripcionHotel;
    }

    public void setDescripcionHotel(String descripcionHotel) {
        this.descripcionHotel = descripcionHotel;
    }

    public String getImgHotel() {
        return imgHotel;
    }

    public void setImgHotel(String imgHotel) {
        this.imgHotel = imgHotel;
    }

    public String getCiudadHotel() {
        return CiudadHotel;
    }

    public void setCiudadHotel(String ciudadHotel) {
        CiudadHotel = ciudadHotel;
    }

    public String getPaisHotel() {
        return PaisHotel;
    }

    public void setPaisHotel(String paisHotel) {
        PaisHotel = paisHotel;
    }

    public int getRateHotel() {
        return rateHotel;
    }

    public void setRateHotel(int rateHotel) {
        this.rateHotel = rateHotel;
    }

    public int getOpinionesHotel() {
        return opinionesHotel;
    }

    public void setOpinionesHotel(int opinionesHotel) {
        this.opinionesHotel = opinionesHotel;
    }
}

package com.example.bookingandroid.utils;

import com.example.bookingandroid.entities.Habitacion;
import com.example.bookingandroid.entities.Hotel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("filtrRate/filtrRate/{categoria}")
    Call<ArrayList<Hotel>> getHotelCategoria(@Path("categoria") String categoria);
    @GET("filtrRate")
    Call<ArrayList<Hotel>> getHotel();
    @GET("filtrReserva")
    Call<ArrayList<Hotel>> getHotelReservas();
    @GET("filtrHabitacion/filtrHabitacion/{id}")
    Call<ArrayList<Habitacion>> getHabitacionCategoria(@Path("id") String id);
}

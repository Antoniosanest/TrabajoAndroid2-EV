package com.example.bookingandroid.lstHabitacion.model;

import com.example.bookingandroid.entities.Habitacion;
import com.example.bookingandroid.entities.Hotel;
import com.example.bookingandroid.lstHabitacion.LstHabitacionContract;
import com.example.bookingandroid.utils.ApiClient;
import com.example.bookingandroid.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LstHabitacionModel implements LstHabitacionContract.Model{
    @Override
    public void lstHabitacionWS(Habitacion habitacion, onLstHabitacionListener onLstHabitacionListener) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ArrayList<Habitacion>> call = apiService.getHabitacionCategoria(String.valueOf(habitacion.getIdHabitacion()));
        call.enqueue(new Callback<ArrayList<Habitacion>>() {
            @Override
            public void onResponse(Call<ArrayList<Habitacion>> call, Response<ArrayList<Habitacion>> response) {
                ArrayList<Habitacion> listaHabitaciones = response.body();
                onLstHabitacionListener.onSuccess(listaHabitaciones);
            }


            @Override
            public void onFailure(Call<ArrayList<Habitacion>> call, Throwable t) {
                onLstHabitacionListener.onFailure(t.getMessage());
            }
        });
    }
}

package com.example.bookingandroid.lst_hoteles_Reserva.model;
import com.example.bookingandroid.entities.Hotel;
import com.example.bookingandroid.lst_hoteles_Reserva.LstHotelContractReserva;

import com.example.bookingandroid.utils.ApiClient;
import com.example.bookingandroid.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class LstHotelModelReservas implements LstHotelContractReserva.Model{


    @Override
    public void lstHotelWSReservas(Hotel hotel, onLstHotelListenerReservas onLstHotelListenerReservas) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ArrayList<Hotel>> call = apiService.getHotelReservas();
        call.enqueue(new Callback<ArrayList<Hotel>>() {
            @Override
            public void onResponse(Call<ArrayList<Hotel>> call, Response<ArrayList<Hotel>> response) {
                ArrayList<Hotel> listaHoteles = response.body();
                onLstHotelListenerReservas.onSuccess(listaHoteles);
            }

            @Override
            public void onFailure(Call<ArrayList<Hotel>> call, Throwable t) {
                onLstHotelListenerReservas.onFailure(t.getMessage());
            }



        });
    }
}
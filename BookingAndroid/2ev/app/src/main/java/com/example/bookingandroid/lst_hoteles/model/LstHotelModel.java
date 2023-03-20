package com.example.bookingandroid.lst_hoteles.model;

import com.example.bookingandroid.entities.Hotel;
import com.example.bookingandroid.lst_hoteles.LstHotelContract;
import com.example.bookingandroid.utils.ApiClient;
import com.example.bookingandroid.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LstHotelModel implements LstHotelContract.Model {
    @Override
    public void lstHotelWS(String categoria, LstHotelContract.Model.onLstHotelListener onLstHotelListener) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ArrayList<Hotel>> call = apiService.getHotelCategoria(categoria);
        call.enqueue(new Callback<ArrayList<Hotel>>() {
            @Override
            public void onResponse(Call<ArrayList<Hotel>> call, Response<ArrayList<Hotel>> response) {
                ArrayList<Hotel> listaHoteles = response.body();
                onLstHotelListener.onSuccess(listaHoteles);
            }

            @Override
            public void onFailure(Call<ArrayList<Hotel>> call, Throwable t) {
                onLstHotelListener.onFailure(t.getMessage());
            }
        });

    }
}

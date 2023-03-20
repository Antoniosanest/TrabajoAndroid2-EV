package com.example.bookingandroid.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String BASE_URL1 =
            //"http://192.168.1.15:8080/BookingNetBeans/webresources/";//CASA
             "http://192.168.104.74:8080/BookingNetBeans/webresources/";//CLASE



    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL1)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

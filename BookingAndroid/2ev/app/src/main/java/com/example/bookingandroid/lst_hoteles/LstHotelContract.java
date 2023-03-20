package com.example.bookingandroid.lst_hoteles;

import com.example.bookingandroid.entities.Hotel;

import java.util.ArrayList;

public interface LstHotelContract {
    public interface View{
        void onSuccessLstHoteles(ArrayList<Hotel> lstHoteles);
        void onFailureLstHoteles(String err);
    }
    public interface Presenter{
        //Listado de los 10 hoteles con mejor valoracion.
        void lstHoteles(String categoria);
    }
    public interface Model{
        interface onLstHotelListener{
            void onSuccess(ArrayList<Hotel> lstHoteles);
            void onFailure(String err);
        }
        void lstHotelWS(String categoria, onLstHotelListener onLstHotelListener);
    }
}

package com.example.bookingandroid.lstHabitacion;

import com.example.bookingandroid.entities.Habitacion;
import com.example.bookingandroid.entities.Hotel;
import com.example.bookingandroid.lst_hoteles.LstHotelContract;

import java.util.ArrayList;

public interface LstHabitacionContract {
    public interface View{
        void onSuccessLstHabitacion(ArrayList<Habitacion> lstHabitacion);
        void onFailureLstHabitacion(String err);
    }
    public interface Presenter{

        void lstHabitacion(Habitacion habitacion);
    }
    public interface Model{
        interface onLstHabitacionListener{
            void onSuccess(ArrayList<Habitacion> lstHabitacion);
            void onFailure(String err);
        }
        void lstHabitacionWS(Habitacion habitacion, LstHabitacionContract.Model.onLstHabitacionListener onLstHabitacionListener);
    }
}

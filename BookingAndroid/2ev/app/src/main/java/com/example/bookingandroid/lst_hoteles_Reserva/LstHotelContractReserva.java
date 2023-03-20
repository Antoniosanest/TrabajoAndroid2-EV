package com.example.bookingandroid.lst_hoteles_Reserva;

import com.example.bookingandroid.entities.Hotel;
import com.example.bookingandroid.lst_hoteles.LstHotelContract;

import java.util.ArrayList;

public interface LstHotelContractReserva {
    public interface View{
        void onSuccessLstHotelesReserva(ArrayList<Hotel> lstHoteles_Reserva);
        void onFailureLstHotelesReserva(String err);
    }
    public interface Presenter{
        //Listado de los 10 hoteles con mejor reserva.
        void lstHotelesReservas(Hotel hotel);
    }
    public interface Model{
        interface onLstHotelListenerReservas{
            void onSuccess(ArrayList<Hotel> lstHoteles_Reserva);
            void onFailure(String err);
        }
        void lstHotelWSReservas(Hotel hotel, LstHotelContractReserva.Model.onLstHotelListenerReservas onLstHotelListenerReservas);
    }
}

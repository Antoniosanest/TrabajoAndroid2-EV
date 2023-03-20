package com.example.bookingandroid.lst_hoteles_Reserva.presenter;

import com.example.bookingandroid.entities.Hotel;
import com.example.bookingandroid.lst_hoteles_Reserva.LstHotelContractReserva;
import com.example.bookingandroid.lst_hoteles_Reserva.model.LstHotelModelReservas;
import com.example.bookingandroid.lst_hoteles_Reserva.LstHotelContractReserva;
import com.example.bookingandroid.lst_hoteles_Reserva.model.LstHotelModelReservas;

import java.util.ArrayList;

public class LstHotelPresenterReservas implements LstHotelContractReserva.Presenter{
    private LstHotelModelReservas lstHotelModelReservas;
    private LstHotelContractReserva.View viewReservas;

    public LstHotelPresenterReservas(LstHotelContractReserva.View viewReservas){
        this.viewReservas = viewReservas;
        this.lstHotelModelReservas = new LstHotelModelReservas();
    }



    @Override
    public void lstHotelesReservas(Hotel hotel) {
        lstHotelModelReservas.lstHotelWSReservas(null, new LstHotelContractReserva.Model.onLstHotelListenerReservas() {
            @Override
            public void onSuccess(ArrayList<Hotel> lstHotelesReservas) {
                if(lstHotelesReservas!=null && lstHotelesReservas.size()>0){
                    viewReservas.onSuccessLstHotelesReserva(lstHotelesReservas);

                }else{
                    viewReservas.onSuccessLstHotelesReserva(lstHotelesReservas);
                }
            }

            @Override
            public void onFailure(String err) {
                viewReservas.onFailureLstHotelesReserva(err);
            }
        });
    }

}

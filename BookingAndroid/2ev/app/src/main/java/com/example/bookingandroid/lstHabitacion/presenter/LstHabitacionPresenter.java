package com.example.bookingandroid.lstHabitacion.presenter;

import com.example.bookingandroid.entities.Habitacion;
import com.example.bookingandroid.entities.Hotel;
import com.example.bookingandroid.lstHabitacion.LstHabitacionContract;
import com.example.bookingandroid.lstHabitacion.model.LstHabitacionModel;
import com.example.bookingandroid.lst_hoteles.LstHotelContract;
import com.example.bookingandroid.lst_hoteles.model.LstHotelModel;

import java.util.ArrayList;

public class LstHabitacionPresenter  implements   LstHabitacionContract.Presenter{
    private LstHabitacionModel lstHabitacionModel;
    private LstHabitacionContract.View view;

    public LstHabitacionPresenter(LstHabitacionContract.View view){
        this.view = view;
        this.lstHabitacionModel = new LstHabitacionModel();
    }



    @Override
    public void lstHabitacion(Habitacion habitacion) {
        lstHabitacionModel.lstHabitacionWS(habitacion, new LstHabitacionContract.Model.onLstHabitacionListener() {
            @Override
            public void onSuccess(ArrayList<Habitacion> lstHabitacion) {
                if(lstHabitacion!=null && lstHabitacion.size()>0){
                    view.onSuccessLstHabitacion(lstHabitacion);

                }else{
                    view.onSuccessLstHabitacion(lstHabitacion);
                }
            }

            @Override
            public void onFailure(String err) {
                view.onFailureLstHabitacion(err);
            }
        });
    }
}

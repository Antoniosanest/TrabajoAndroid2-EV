package com.example.bookingandroid.lst_hoteles.presenter;

import com.example.bookingandroid.entities.Hotel;
import com.example.bookingandroid.lst_hoteles.LstHotelContract;
import com.example.bookingandroid.lst_hoteles.model.LstHotelModel;

import java.util.ArrayList;

public class LstHotelPresenter implements LstHotelContract.Presenter {
    private LstHotelModel lstHotelModel;
    private LstHotelContract.View view;

    public LstHotelPresenter(LstHotelContract.View view){
        this.view = view;
        this.lstHotelModel = new LstHotelModel();
    }



    @Override
    public void lstHoteles(String categoria) {
        lstHotelModel.lstHotelWS(categoria, new LstHotelContract.Model.onLstHotelListener() {
            @Override
            public void onSuccess(ArrayList<Hotel> lstHoteles) {
                if(lstHoteles!=null && lstHoteles.size()>0){
                    view.onSuccessLstHoteles(lstHoteles);

                }else{
                    view.onSuccessLstHoteles(lstHoteles);
                }
            }

            @Override
            public void onFailure(String err) {
                view.onFailureLstHoteles(err);
            }
        });
    }
}

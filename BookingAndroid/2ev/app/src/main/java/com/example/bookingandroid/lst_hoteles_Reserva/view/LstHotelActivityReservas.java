package com.example.bookingandroid.lst_hoteles_Reserva.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.bookingandroid.Login;
import com.example.bookingandroid.R;
import com.example.bookingandroid.entities.Hotel;
import com.example.bookingandroid.lst_hoteles.LstHotelContract;
import com.example.bookingandroid.lst_hoteles.view.LstHotelActivity;
import com.example.bookingandroid.lst_hoteles_Reserva.LstHotelContractReserva;
import com.example.bookingandroid.lst_hoteles_Reserva.presenter.LstHotelPresenterReservas;

import java.util.ArrayList;

public class LstHotelActivityReservas extends AppCompatActivity  implements LstHotelContractReserva.View {

    private LstHotelAdapterReservas lstHotelAdapterReservas;
    private LstHotelPresenterReservas lstHotelPresenterReservas;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_hotel_reservas);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        initPresenter();
        initData();
    }


    public void evento(View view){
        switch (view.getId()){

            case R.id.buttonRate:
                Intent intent = new Intent(getBaseContext(), LstHotelActivity.class);
                startActivity(intent);
                break;

        }
    }
    public void initPresenter(){
        lstHotelPresenterReservas = new LstHotelPresenterReservas(this);
    }
    public void initData(){
        lstHotelPresenterReservas.lstHotelesReservas(null); //SELECT * FROM SIMPSON
    }


    @Override
    public void onSuccessLstHotelesReserva(ArrayList<Hotel> lstHotelesReservas) {
        LstHotelAdapterReservas adapter = new LstHotelAdapterReservas(getBaseContext(),lstHotelesReservas);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onFailureLstHotelesReserva(String err) {
        Toast.makeText(this, err, Toast.LENGTH_LONG).show();
    }
}
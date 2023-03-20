package com.example.bookingandroid.lst_hoteles.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bookingandroid.R;
import com.example.bookingandroid.entities.Hotel;
import com.example.bookingandroid.lst_hoteles.LstHotelContract;
import com.example.bookingandroid.lst_hoteles.presenter.LstHotelPresenter;

import java.util.ArrayList;

public class LstHotelActivity extends AppCompatActivity implements LstHotelContract.View {
    private LstHotelAdapter lstHotelAdapter;
    private LstHotelPresenter lstHotelPresenter;
    private RecyclerView recyclerView;


    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_hotel);
        //recyclerView = (RecyclerView) findViewById(R.id.recyclerV);

        //recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        initPresenter();
        initComponents();
       // initData();

    }

    public void initPresenter(){
        lstHotelPresenter = new LstHotelPresenter(this);
    }
    public void initData(String categoria){
        lstHotelPresenter.lstHoteles(categoria);
        //SELECT * FROM SIMPSON
    }

    @Override
    public void onSuccessLstHoteles(ArrayList<Hotel> lstHoteles) {
        LstHotelAdapter adapter = new LstHotelAdapter(getBaseContext(),lstHoteles);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onFailureLstHoteles(String err) {
        Toast.makeText(this, err, Toast.LENGTH_LONG).show();
    }

    public void initComponents(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, new String[]{"Buscar por Reservas","Buscar por Destacados"});
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                initData(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // No se ha seleccionado ninguna opción
            }
        });




        //ArrayAdapter<CharSequence> adapter = createFromResource(this);
        //spinner.setAdapter(adapter);
    }
}
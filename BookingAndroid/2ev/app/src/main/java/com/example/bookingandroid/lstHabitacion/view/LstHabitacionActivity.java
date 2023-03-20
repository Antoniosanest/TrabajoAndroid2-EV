package com.example.bookingandroid.lstHabitacion.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.bookingandroid.Habitacion1;
import com.example.bookingandroid.R;
import com.example.bookingandroid.entities.Habitacion;
import com.example.bookingandroid.lstHabitacion.LstHabitacionContract;
import com.example.bookingandroid.lstHabitacion.presenter.LstHabitacionPresenter;
import com.example.bookingandroid.lstHabitacion.view.LstHabitacionAdapter;
import com.example.bookingandroid.lst_hoteles.view.LstHotelActivity;


import java.util.ArrayList;

public class LstHabitacionActivity extends AppCompatActivity implements LstHabitacionContract.View {

    private LstHabitacionAdapter lstHabitacionAdpater;
    private LstHabitacionPresenter lstHabitacionPresenter;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_habitacion);
        String id = getIntent().getExtras().getString("id");
        initComponents();
        initPresenter();
        initData(id);

    }

    private void initComponents() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }

    private void initPresenter() {
        lstHabitacionPresenter = new LstHabitacionPresenter(this);
    }
    public void initData(String id){
        Habitacion habitacion = new Habitacion();
        habitacion.setIdHabitacion(Integer.parseInt(id));
        lstHabitacionPresenter.lstHabitacion(habitacion);
    }
    @Override
    public void onSuccessLstHabitacion(ArrayList<Habitacion> lstHabitacion) {
        LstHabitacionAdapter adapter = new LstHabitacionAdapter(getBaseContext(),lstHabitacion);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onFailureLstHabitacion(String err) {
        Toast.makeText(getBaseContext(),err,Toast.LENGTH_LONG).show();
    }
    public void evento(View view){
        switch (view.getId()){


            case R.id.buttonReserva:
                Intent intent6 = new Intent(getBaseContext(), Habitacion1.class);
                startActivity(intent6);
                Toast.makeText(this, "Datos completos", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
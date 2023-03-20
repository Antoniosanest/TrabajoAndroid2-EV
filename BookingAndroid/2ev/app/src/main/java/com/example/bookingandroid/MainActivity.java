package com.example.bookingandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.bookingandroid.lstHabitacion.view.LstHabitacionActivity;
import com.example.bookingandroid.lst_hoteles.view.LstHotelActivity;
import com.example.bookingandroid.lst_hoteles_Reserva.view.LstHotelActivityReservas;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Intent intent = new Intent(getBaseContext(), LstHotelActivityReservas.class);
        // startActivity(intent);
    }

    public void evento(View view){
        switch (view.getId()){



            case R.id.buttonReservas:
                Intent intent2 = new Intent(getBaseContext(), LstHotelActivity.class);
                startActivity(intent2);
                Toast.makeText(this, "Los 10 hoteles con mas reservas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonLogin:
                Intent intent3 = new Intent(getBaseContext(),Login.class );
                startActivity(intent3);
                break;
            case R.id.buttonHabitacion:
                //Toast.makeText(this, "Los 10 hoteles con mas reservas", Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(getBaseContext(), LstHabitacionActivity.class );
                startActivity(intent5);
        }
    }


}
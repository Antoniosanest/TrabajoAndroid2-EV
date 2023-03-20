package com.example.bookingandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.bookingandroid.lst_hoteles.view.LstHotelActivity;

public class Habitacion1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habitacion);
    }
    public void evento(View view){
        switch (view.getId()){



            case R.id.buttonConfirmar:
                    Intent intent2 = new Intent(getBaseContext(), LstHotelActivity.class);
                startActivity(intent2);
                Toast.makeText(this, "Reserva Confirmada, enviando correo", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
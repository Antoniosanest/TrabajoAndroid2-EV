package com.example.bookingandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.bookingandroid.lst_hoteles.view.LstHotelActivity;
import com.example.bookingandroid.lst_hoteles_Reserva.view.LstHotelActivityReservas;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void evento(View view){
        switch (view.getId()){



            case R.id.button_login:
                Intent intent2 = new Intent(getBaseContext(), LstHotelActivity.class);
                startActivity(intent2);
                Toast.makeText(this, "Los 10 hoteles con mas reservas", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
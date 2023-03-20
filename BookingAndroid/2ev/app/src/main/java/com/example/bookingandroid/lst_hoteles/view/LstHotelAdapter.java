package com.example.bookingandroid.lst_hoteles.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.bookingandroid.R;
import com.example.bookingandroid.entities.Hotel;
import com.example.bookingandroid.lstHabitacion.view.LstHabitacionActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class LstHotelAdapter extends RecyclerView.Adapter<LstHotelAdapter.ViewHolder>{
    private ArrayList<Hotel> dataset;
    private Context mContext;

    public LstHotelAdapter(Context mContext, ArrayList<Hotel> lstHoteles){
        this.dataset = lstHoteles;
        this.mContext = mContext;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_hotel,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Hotel r = dataset.get(position);
        holder.idHotel.setText(String.valueOf(r.getIdHotel()));
        holder.nombreHotel.setText(r.getNombreHotel());
        //holder.descripcionHotel.setText(r.getDescripcionHotel());
        holder.ciudadHotel.setText(r.getCiudadHotel());
        //holder.paisHotel.setText(r.getPaisHotel());
        holder.rateHotel.setText(String.valueOf(r.getRateHotel()));
        //holder.opinionesHotel.setText(String.valueOf(r.getOpinionesHotel()));
        Picasso.get().load(r.getImgHotel()).into(holder.imgHotel);
        holder.buttonHotel.setOnClickListener(new View.OnClickListener() {
            String id = String.valueOf(holder.idHotel.getText());
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(view.getContext(), LstHabitacionActivity.class);
                intent4.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent4.putExtra("id",id);
                view.getContext().startActivity(intent4);

            }
        });

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView idHotel;
        private TextView nombreHotel;
        //private TextView descripcionHotel ;
        private TextView ciudadHotel;
        //private TextView paisHotel;
        private TextView rateHotel;
        //private TextView opinionesHotel;
        private ImageView imgHotel;
        private Button buttonHotel;


        public ViewHolder(View itemView) {
            super(itemView);

            idHotel = itemView.findViewById(R.id.idHotel);
            nombreHotel = itemView.findViewById(R.id.nombreHotel);
            //descripcionHotel = itemView.findViewById(R.id.descripcionHotel);
            ciudadHotel = itemView.findViewById(R.id.ciudadHotel);
            //paisHotel = itemView.findViewById(R.id.paisHotel);
            rateHotel = itemView.findViewById(R.id.rateHotel);
            //opinionesHotel = itemView.findViewById(R.id.opinionesHotel);
            imgHotel=(ImageView)itemView.findViewById(R.id.imgHotel);
            buttonHotel=itemView.findViewById(R.id.buttonHabitacion);
        }
    }
    public void adicionarListaHotel(ArrayList<Hotel> lstHoteles) {
        //dataset.addAll(lstRestaurant);
        //notifyDataSetChanged();
    }
}

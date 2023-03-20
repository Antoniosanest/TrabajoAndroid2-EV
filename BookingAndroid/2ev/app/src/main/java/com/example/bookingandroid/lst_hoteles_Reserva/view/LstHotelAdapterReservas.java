package com.example.bookingandroid.lst_hoteles_Reserva.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.bookingandroid.R;
import com.example.bookingandroid.entities.Hotel;
import com.example.bookingandroid.lst_hoteles_Reserva.view.LstHotelAdapterReservas;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class LstHotelAdapterReservas extends RecyclerView.Adapter<LstHotelAdapterReservas.ViewHolder>{
    private ArrayList<Hotel> dataset;
    private Context mContext;

    public LstHotelAdapterReservas(Context mContext, ArrayList<Hotel> lstHotelesReservas){
        this.dataset = lstHotelesReservas;
        this.mContext = mContext;
    }


    @Override
    public LstHotelAdapterReservas.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_hotelreservas,parent,false);
        return new LstHotelAdapterReservas.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LstHotelAdapterReservas.ViewHolder holder, int position) {
        Hotel r = dataset.get(position);
        //holder.idHotel.setText(String.valueOf(r.getIdHotel()));
        holder.nombreHotel.setText(r.getNombreHotel());
        //holder.descripcionHotel.setText(r.getDescripcionHotel());
        holder.ciudadHotel.setText(r.getCiudadHotel());
        //holder.paisHotel.setText(r.getPaisHotel());
        //holder.rateHotel.setText(String.valueOf(r.getRateHotel()));
        holder.opinionesHotel.setText(String.valueOf(r.getOpinionesHotel()));
        Picasso.get().load(r.getImgHotel()).into(holder.imgHotel);

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //private TextView idHotel;
        private TextView nombreHotel;
        //private TextView descripcionHotel ;
        private TextView ciudadHotel;
        //private TextView paisHotel;
        //private TextView rateHotel;
        private TextView opinionesHotel;
        private ImageView imgHotel;


        public ViewHolder(View itemView) {
            super(itemView);

            //idHotel = itemView.findViewById(R.id.idHotel);
            nombreHotel = itemView.findViewById(R.id.nombreHotel);
            //descripcionHotel = itemView.findViewById(R.id.descripcionHotel);
            ciudadHotel = itemView.findViewById(R.id.ciudadHotel);
            //paisHotel = itemView.findViewById(R.id.paisHotel);
            //rateHotel = itemView.findViewById(R.id.rateHotel);
            opinionesHotel = itemView.findViewById(R.id.opinionesHotel);
            imgHotel=(ImageView)itemView.findViewById(R.id.imgHotel);
        }
    }
    public void adicionarListaHotel(ArrayList<Hotel> lstHoteles) {
        //dataset.addAll(lstRestaurant);
        //notifyDataSetChanged();
    }
}

package com.example.bookingandroid.lstHabitacion.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.bookingandroid.Habitacion1;
import com.example.bookingandroid.R;
import com.example.bookingandroid.entities.Habitacion;

import java.util.ArrayList;

public class LstHabitacionAdapter extends RecyclerView.Adapter<LstHabitacionAdapter.ViewHolder>{
    private ArrayList<Habitacion> dataset;
    private Context mContext;

    public LstHabitacionAdapter(Context mContext, ArrayList<Habitacion> lstHabitacion){
        this.dataset = lstHabitacion;
        this.mContext = mContext;
    }


    @Override
    public LstHabitacionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_habitacion,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LstHabitacionAdapter.ViewHolder holder, int position) {
        Habitacion r = dataset.get(position);
       // holder.idHabitacion.setText(String.valueOf(r.getIdHabitacion()));
        holder.numeroHabitacion.setText(r.getNumeroHabitacion());
        holder.descripcionHabitacion.setText(r.getDescripcionHabitacion());
        holder.capacidadHabitacion.setText(r.getCapacidadHabitacion());
        holder.precioHabitacion.setText(String.valueOf(r.getPrecioHabitacion()));
        holder.disponibleHabitacion.setText(r.getDisponible());
        holder.buttonReserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(view.getContext(), Habitacion1.class);
                intent6.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                view.getContext().startActivity(intent6);

                //Toast.makeText(this, "Datos completos", Toast.LENGTH_SHORT).show();
            }
        });

        if (holder.disponibleHabitacion.equals("F") ){
            holder.disponibleHabitacion.setText("RESERVADA");
        }else{
            holder.disponibleHabitacion.setText("DISPONIBLE");
        }

        /*holder.buttonHotel.setOnClickListener(new View.OnClickListener() {
            String id = String.valueOf(holder.idHotel.getText());
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(view.getContext(), LstHabitacionActivity.class);
                intent4.putExtra("id",id);
                view.getContext().startActivity(intent4);
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //private TextView idHabitacion;
        private TextView numeroHabitacion;
        private TextView descripcionHabitacion ;
        private TextView capacidadHabitacion;
        private TextView precioHabitacion;
        private Button buttonReserva;
        private TextView disponibleHabitacion;





        public ViewHolder(View itemView) {
            super(itemView);

            //idHabitacion = itemView.findViewById(R.id.idHabitacion);
            numeroHabitacion = itemView.findViewById(R.id.numeroHabitacion);
            descripcionHabitacion = itemView.findViewById(R.id.descripcionHabitacion);
            capacidadHabitacion = itemView.findViewById(R.id.capacidadHabitacion);
            precioHabitacion = itemView.findViewById(R.id.precioHabitacion);
            disponibleHabitacion = itemView.findViewById(R.id.disponible);
            //imgHotel=(ImageView)itemView.findViewById(R.id.imgHotel);
            buttonReserva= itemView.findViewById(R.id.buttonReserva);

        }
    }
    public void adicionarListaHotel(ArrayList<Habitacion> lstHabitaciones) {
        //dataset.addAll(lstRestaurant);
        //notifyDataSetChanged();
    }
}

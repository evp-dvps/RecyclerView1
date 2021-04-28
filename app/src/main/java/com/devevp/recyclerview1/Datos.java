package com.devevp.recyclerview1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//extendes RecyclerView, generar metodos  y clases ViewHolder
public class Datos extends RecyclerView.Adapter<Datos.ViewHolder> {

    //variables globales
    //layout inflater se utiliza para instanciar el archivo de diseño y que se muestre en MainActivity
    LayoutInflater inflater=null;
    //generar los datos
    Context context;
    String[] artist;
    String [] canc;
    int [] caract;
    //generar constructor

    public Datos(Context context, String[] artist, String[] canc, int[] caract) {
        this.context = context;
        this.artist = artist;
        this.canc = canc;
        this.caract = caract;

        //inicializar inflater
        inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }

    @NonNull
    @Override
    public Datos.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view =inflater.inflate(R.layout.item_fila, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }
    //asignar datos a cada una de las posiciones
    @Override
    public void onBindViewHolder(@NonNull Datos.ViewHolder holder, int position){

        holder.artist.setText(artist[position]);
        holder.canc.setText(canc[position]);
        holder.caract.setImageResource(caract[position]);

    }
    @Override
    public int getItemCount(){
        return artist.length;
    }

    //generar vista, extends RecyclerView.ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView artist, canc;
        ImageView caract;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            artist=itemView.findViewById(R.id.artista);
            canc=itemView.findViewById(R.id.cancion);
            caract=itemView.findViewById(R.id.caratula);
        }

    }}
package com.example.appfilmes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    public ListaDados[] lista;

    public Adapter(Context context, ListaDados[] lista) {
        this.context = context;
        this.lista = lista;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.um_item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.tvNome.setText(lista[position].getName());
        holder.imgView.setImageResource(lista[position].getImgId());

    }

    @Override
    public int getItemCount() {
        return lista.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder  {
        TextView tvNome;
        ImageView imgView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNome = itemView.findViewById(R.id.tvNome);
            imgView = itemView.findViewById(R.id.image1);
        }
    }
}

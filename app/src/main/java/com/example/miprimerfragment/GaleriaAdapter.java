package com.example.miprimerfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GaleriaAdapter extends RecyclerView.Adapter<GaleriaAdapter.GaleriaViewHolder> {

    private final List<Libro> libros;

    public GaleriaAdapter(List<Libro> libros) {
        this.libros = libros;
    }

    @NonNull
    @Override
    public GaleriaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_galeria, parent, false);
        return new GaleriaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GaleriaViewHolder holder, int position) {
        Libro libro = libros.get(position);

        holder.imageViewPortada.setImageResource(libro.getImagenResourceId());
        holder.textViewTitulo.setText(libro.getTitulo());
        holder.textViewDescripcion.setText(libro.getDescripcion());
        holder.textViewFechaCaduca.setText("10 oct"); // ejemplo fijo

    }

    @Override
    public int getItemCount() {
        return libros.size();
    }

    static class GaleriaViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewPortada;
        TextView textViewTitulo;
        TextView textViewDescripcion;
        TextView textViewFechaCaduca;


        public GaleriaViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewPortada = itemView.findViewById(R.id.ivPortada);
            textViewTitulo = itemView.findViewById(R.id.tvTitulo);
            textViewDescripcion= itemView.findViewById(R.id.tvDescripcion);
            textViewFechaCaduca = itemView.findViewById(R.id.tvFechaCaduca);

        }
    }
}


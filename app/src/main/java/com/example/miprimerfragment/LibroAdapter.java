package com.example.miprimerfragment;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.LibroViewHolder> {

private final List<Libro> libros;

public LibroAdapter(List<Libro> libros) {
    this.libros = libros;
}

    @NonNull
    @Override
    public LibroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_libro, parent, false);
        return new LibroViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull LibroViewHolder holder, int position) {
        Libro libro = libros.get(position);

        holder.imageViewPortada.setImageResource(libro.getImagenResourceId());
        holder.textViewTitulo.setText(libro.getTitulo());
        holder.textViewDescripcion.setText(libro.getDescripcion());

        holder.buttonVerDetalle.setOnClickListener(v -> {
            int idTitulo = libro.getIdTitulo();

            Intent intent = new Intent(v.getContext(), DetalleLibroActivity.class);
            intent.putExtra("ID_TITULO", idTitulo);

            v.getContext().startActivity(intent);
        });

        holder.buttonAgregarCarrito.setOnClickListener(v -> {
            Carrito.agregarItem(libro.getIdTitulo(), 1);

            Toast.makeText(v.getContext(),
                    libro.getTitulo() + " agregado al carrito", Toast.LENGTH_SHORT).show();
        });


    }
    @Override
    public int getItemCount() {
        return libros.size();
    }

    public static class LibroViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageViewPortada;
        public Button buttonVerDetalle;
        public Button buttonAgregarCarrito;

        public TextView textViewTitulo;
        public TextView textViewDescripcion;

        public TextView textViewPrecio;


    public LibroViewHolder(@NonNull View itemView) {
        super(itemView);
        imageViewPortada = itemView.findViewById(R.id.iv_portada);
        buttonVerDetalle = itemView.findViewById(R.id.btn_ver_detalle);
        buttonAgregarCarrito = itemView.findViewById(R.id.btn_agregar_carrito);
        textViewTitulo = itemView.findViewById(R.id.tvTitulo);
        textViewDescripcion = itemView.findViewById(R.id.tvDescripcion);
        textViewPrecio = itemView.findViewById(R.id.tvPrecio);





    }
}
}
package com.example.miprimerfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarritoAdapter extends RecyclerView.Adapter<CarritoAdapter.CarritoViewHolder> {


    private final List<ItemCarrito> items;

    public CarritoAdapter(List<ItemCarrito> items) {
        this.items = items;
    }

    private OnCarritoChangeListener listener;

    public void setOnCarritoChangeListener(OnCarritoChangeListener listener) {
        this.listener = listener;
    }


    @NonNull
    @Override
    public CarritoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_carrito, parent, false);
        return new CarritoViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull CarritoViewHolder holder, int position) {
        ItemCarrito item = items.get(position);
        Libro libro = LibrosData.getInstance().getLibroById(item.getIdTitulo());

        if (libro != null) {
            holder.txtNombre.setText(libro.getTitulo());
            holder.txtPrecio.setText(String.valueOf("$ " + libro.getPrecio()));
            holder.imgProducto.setImageResource(libro.getImagenResourceId());
            holder.txtCantidad.setText(String.valueOf(item.getCantidad()));
        }
        holder.btnMas.setOnClickListener(v -> {
            item.setCantidad(item.getCantidad() + 1);
            notifyItemChanged(position);
            if (listener != null) listener.onCarritoChanged();
        });

        holder.btnMenos.setOnClickListener(v -> {
            if (item.getCantidad() > 1) {
                item.setCantidad(item.getCantidad() - 1);
                notifyItemChanged(position);
                if (listener != null) listener.onCarritoChanged();
            } else {
                items.remove(position);
                notifyItemRemoved(position);
                if (listener != null) listener.onCarritoChanged();
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class CarritoViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre;
        TextView txtPrecio;
        TextView txtCantidad;
        ImageView imgProducto;


        Button btnMas, btnMenos;

        public CarritoViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombre = itemView.findViewById(R.id.tvTitulo);
            txtPrecio = itemView.findViewById(R.id.tvPrecio);
            txtCantidad = itemView.findViewById(R.id.etCantidad);
            imgProducto = itemView.findViewById(R.id.ivPortada);
            btnMas = itemView.findViewById(R.id.btnMas);
            btnMenos = itemView.findViewById(R.id.btnMenos);

        }
    }

    public interface OnCarritoChangeListener {
        void onCarritoChanged();
    }



}

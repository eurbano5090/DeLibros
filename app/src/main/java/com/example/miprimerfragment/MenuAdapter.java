package com.example.miprimerfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private List<MenuItem> items;

    public MenuAdapter(List<MenuItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_menu, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        MenuItem item = items.get(position);
        holder.icono.setImageResource(item.icono);
        holder.titulo.setText(item.titulo);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class MenuViewHolder extends RecyclerView.ViewHolder {
        ImageView icono;
        TextView titulo;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            icono = itemView.findViewById(R.id.iconoMenu);
            titulo = itemView.findViewById(R.id.txtTituloMenu);
        }
    }
}

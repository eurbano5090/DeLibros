package com.example.miprimerfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class BuscarFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_buscar, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view,
                              @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerMenu);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem(R.drawable.ic_reserva, "Reservas"));
        menuItems.add(new MenuItem(R.drawable.ic_sugerencias, "Sugerencias de contenido"));
        menuItems.add(new MenuItem(R.drawable.ic_historial, "Historial"));
        menuItems.add(new MenuItem(R.drawable.ic_retos, "Retos"));
        menuItems.add(new MenuItem(R.drawable.ic_ranking, "Ranking y medallas"));
        menuItems.add(new MenuItem(R.drawable.ic_notificaciones, "Notificaciones"));
        menuItems.add(new MenuItem(R.drawable.ic_clublectura, "Club de Lectura"));
        menuItems.add(new MenuItem(R.drawable.ic_ajustes, "Ajustes"));
        menuItems.add(new MenuItem(R.drawable.ic_micuenta, "Mi cuenta"));
        menuItems.add(new MenuItem(R.drawable.ic_ayuda, "Ayuda"));
        menuItems.add(new MenuItem(R.drawable.ic_acercade, "Acerca de"));

        MenuAdapter adapter = new MenuAdapter(menuItems);
        recyclerView.setAdapter(adapter);
    }
}

package com.example.miprimerfragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.miprimerfragment.databinding.FragmentGaleriaBinding;

import java.util.ArrayList;

public class GaleriaFragment extends Fragment {
    private FragmentGaleriaBinding binding;
    private LibroAdapter adaptador;
    private ArrayList<Libro> listaLibros;


    public GaleriaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentGaleriaBinding.inflate(inflater, container, false);
        inicializarVistas();
        return binding.getRoot();
    }

    private void inicializarVistas() {
        iniciarRecyclerView();
        cargarDatos();
    }

    private void cargarDatos() {
        listaLibros.addAll(Datos.cargarLibros());
        //  notificar Cambio
        adaptador.notifyDataSetChanged();
    }

    private void iniciarRecyclerView() {
        listaLibros = new ArrayList<>();

        binding.rvGaleria.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));

        adaptador = new LibroAdapter(listaLibros);

        binding.rvGaleria.setAdapter(adaptador);
    }
}
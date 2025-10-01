package com.example.miprimerfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.miprimerfragment.databinding.FragmentCarritoBinding;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CarritoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CarritoFragment extends Fragment {
    private FragmentCarritoBinding binding;
    private LibroAdapter adaptador;
    private GestorCarroCompra gestor;
    private ArrayList<Libro> carroLibros;




    public CarritoFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCarritoBinding.inflate(inflater, container, false);
        // Inflate the layout for this fragment
        inicializarVistas();
        return binding.getRoot();
    }

    private void inicializarVistas() {
        iniciarRecyclerView();
        cargarDatosCarro();
    }

    private void iniciarRecyclerView() {
        carroLibros = new ArrayList<>();

        binding.rvCarro.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));

        adaptador = new LibroAdapter(carroLibros);

        binding.rvCarro.setAdapter(adaptador);
    }

    private void cargarDatosCarro() {
        // obtener carro en memoria
        gestor = GestorCarroCompra.getInstancia();

        carroLibros.addAll(gestor.getCarroCompra());
        //  notificar Cambio
        adaptador.notifyDataSetChanged();
    }
}
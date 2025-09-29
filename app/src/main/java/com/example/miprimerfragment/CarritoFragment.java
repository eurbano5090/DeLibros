package com.example.miprimerfragment;

import android.annotation.SuppressLint;
import android.icu.text.NumberFormat;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.miprimerfragment.databinding.FragmentCarritoBinding;

import java.util.List;
import java.util.Locale;

public class CarritoFragment extends Fragment {

        private FragmentCarritoBinding binding;
        private CarritoAdapter adapter;


        public CarritoFragment() {

        }

        @SuppressLint("SetTextI18n")
        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                                 @Nullable Bundle savedInstanceState) {
            binding = FragmentCarritoBinding.inflate(inflater, container, false);


            binding.recyclerViewCarrito.setLayoutManager(new LinearLayoutManager(getContext()));

            Bundle args = getArguments();
            if (args != null) {
                int idLibro = args.getInt("ID_TITULO", -1);

                if (idLibro != -1) {
                    Libro libro = LibrosData.getInstance().getLibroById(idLibro);
                    if (libro != null) {

                        Carrito.agregarItem(libro.getIdTitulo(), 1); // cantidad fija por ahora
                    }
                }
            }

            List<ItemCarrito> items = Carrito.getItems();

            adapter = new CarritoAdapter(items);
            binding.recyclerViewCarrito.setAdapter(adapter);

            binding.tvTotal.setText("Total a Pagar " +
                    NumberFormat.getCurrencyInstance(new Locale("es", "CL"))
                            .format(Carrito.total()));

            adapter.setOnCarritoChangeListener(() -> {
                binding.tvTotal.setText(
                        NumberFormat.getCurrencyInstance(new Locale("es", "CL"))
                                .format(Carrito.total())
                );
            });

            return binding.getRoot();

        }


}
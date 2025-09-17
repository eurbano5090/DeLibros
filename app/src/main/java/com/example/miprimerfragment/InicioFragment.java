package com.example.miprimerfragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.miprimerfragment.databinding.FragmentInicioBinding;

import java.util.ArrayList;
import java.util.List;

public class InicioFragment extends Fragment {

    public FragmentInicioBinding binding;
    private final Handler carruselHandler = new Handler(Looper.getMainLooper());  // Handler para el carrusel
    private static final long TIEMPO_CAMBIO = 3000;
    private Runnable carruselRunnable;


    public InicioFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentInicioBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        configurarCarrusel();

        configurarListaDeLibros();
    }

    private void configurarCarrusel() {
        ViewPager2 viewPager = binding.viewPager;

        List<Integer> images = new ArrayList<>();
        images.add(R.drawable.img4);
        images.add(R.drawable.img5);
        images.add(R.drawable.img6);

        CarruselAdapter adapter = new CarruselAdapter(images);
        viewPager.setAdapter(adapter);

        carruselRunnable = new Runnable() {
            @Override
            public void run() {
                int currentItem = viewPager.getCurrentItem();
                int totalItems = adapter.getItemCount();

                if (currentItem == totalItems - 1) {
                    viewPager.setCurrentItem(0, true); // true para una transición suave
                } else {
                    viewPager.setCurrentItem(currentItem + 1, true);
                }

                carruselHandler.postDelayed(this, TIEMPO_CAMBIO);
            }
        };
        carruselHandler.postDelayed(carruselRunnable, TIEMPO_CAMBIO);
    }
    private void configurarListaDeLibros() {

        List<Libro> listaLibros = LibrosData.getInstance().getLibros();

        LibroAdapter adaptador = new LibroAdapter(listaLibros);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);

        binding.recyclerViewLibros.setLayoutManager(gridLayoutManager);
        binding.recyclerViewLibros.setAdapter(adaptador);

    }


        @Override
        public void onDestroyView() {
            super.onDestroyView();
            binding = null;
        }
    }


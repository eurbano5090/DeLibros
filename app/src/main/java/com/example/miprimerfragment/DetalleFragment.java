package com.example.miprimerfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.miprimerfragment.databinding.FragmentDetalleBinding;

import java.util.ArrayList;

public class DetalleFragment extends Fragment {
    private FragmentDetalleBinding binding; // Declare binding
    private GestorCarroCompra gestor;
    private ArrayList<Libro> carroCompra;

    public DetalleFragment(){
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout using View Binding
        binding = FragmentDetalleBinding.inflate(inflater, container, false);

        // Initialize views and data
        inicializarVistas();

        return binding.getRoot(); // Return the root view
    }
    
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Additional setup after the view is created
    }

    @Override
    public void onDestroyView() {
        //guardarCarroActualizado();
        super.onDestroyView();
        // Important: Clear the binding to prevent memory leaks
        binding = null;
    }

    private void inicializarVistas() {
        cargarDatos();
        cargarMetodos();
    }

    private void cargarMetodos() {
        binding.imageBtn.setOnClickListener( v -> {
            agregarAlCarro();
            //guardarCarroActualizado();
        });
    }

    private void agregarAlCarro() {
        // Recuperar el objeto Libro del Bundle
        Bundle args = getArguments();
        if (args != null) {
            Libro nuevoLibro = (Libro) args.getSerializable("libroDetallado");
            if (nuevoLibro != null) {
                String msg = "";
                if (!carroCompra.contains(nuevoLibro)){
                    gestor.agregarAlCarro(nuevoLibro);
                    msg = "agregado al carro";
                }else{
                    msg = "agregado previamente\n" + carroCompra.size() + " elem. en carro";
                }
                Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void cargarDatos() {
        cargarCarroCompra();
        // Recuperar el objeto Libro del Bundle
        Bundle args = getArguments();
        if (args != null) {
            Libro libro = (Libro) args.getSerializable("libroDetallado");

            if (libro != null) {
                // Set the data to your views using binding
                binding.tvTitulo.setText("Título: " + libro.getNombre());
                binding.tvAutor.setText("Autor: " + libro.getAutor());
                binding.tvIdioma.setText("Idioma: " + libro.getIdioma());
                binding.tvDescripcion.setText("Descripción: " + libro.getDescripcion());
                binding.tvPaginas.setText(libro.getPaginas() + " páginas");
                binding.tvEdicion.setText("Edición: " + libro.getEdicion());
                binding.tvPrecio.setText("Precio: $" + libro.getPrecio() + "-");
                binding.tvIsbn.setText("ISBN: " + libro.getIsbn());

                if (libro.getImagen() != null && !libro.getImagen().isEmpty()) {
                    // Convertir el nombre del recurso a ID
                    int resourceId = binding.ivLibro.getContext().getResources()
                            .getIdentifier(libro.getImagen(), "drawable",
                                    binding.ivLibro.getContext().getPackageName());

                    if (resourceId != 0) {
                        binding.ivLibro.setImageResource(resourceId);
                    } else {
                        // Imagen por defecto si no se encuentra el recurso
                        binding.ivLibro.setImageResource(R.drawable.libro_portada_default);
                    }
                } else {
                    // Imagen por defecto si no hay imagen especificada
                    binding.ivLibro.setImageResource(R.drawable.libro_portada_default);
                }
            }
        }
    }

    private void cargarCarroCompra() {
        gestor = GestorCarroCompra.getInstancia();
// Obtener la lista
        carroCompra = gestor.getCarroCompra();
    }
}
package com.example.miprimerfragment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.example.miprimerfragment.databinding.ActivityDetalleBinding;


public class DetalleActivity extends AppCompatActivity {
    private ActivityDetalleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        inflarBinding();
        inicializarAtributosBinding(savedInstanceState);
        addMetodosBinding();


        ViewCompat.setOnApplyWindowInsetsListener(binding.getRoot(), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void inicializarAtributosBinding(Bundle savedInstanceState) {
        DetalleFragment detalleFragment = new DetalleFragment();

        // Recuperar el objeto Libro del Intent
        Libro libro = (Libro) getIntent().getSerializableExtra("libroDetallado");

        // Enviar el objeto Libro directamente al fragmento
        Bundle args = new Bundle();
        if (libro != null) {
            args.putSerializable("libroDetallado", libro);
        }

        mostrarFragment(detalleFragment, args);
    }

    private void mostrarFragment(Fragment fragment, Bundle args) {
        fragment.setArguments(args);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(binding.fragmentContainerDetalleActivity.getId(), fragment)
                .commit();
    }

    private void addMetodosBinding() {
    }

    private void inflarBinding() {
        binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

}
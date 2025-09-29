package com.example.miprimerfragment;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import com.example.miprimerfragment.databinding.ActivityDetalleLibroBinding;


public class DetalleLibroActivity extends AppCompatActivity {

    private ActivityDetalleLibroBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetalleLibroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int idTitulo = getIntent().getIntExtra("ID_TITULO", -1);
        if (idTitulo != -1) {

            Libro libro = LibrosData.getInstance().getLibroById(idTitulo);

            if (libro != null) {
                binding.tvTitulo.setText(libro.getTitulo());
                binding.tvDetalle.setText(libro.getDetalle());
                binding.ivPortada.setImageResource(libro.getImagenResourceId());

            }
        }


        binding.btnTvVolver.setOnClickListener(v -> NavUtils.navigateUpFromSameTask(DetalleLibroActivity.this));

        binding.btnComprar.setOnClickListener(v -> {

            Carrito.agregarItem(idTitulo, 1);
            Toast.makeText(this, "Agregado al carrito", Toast.LENGTH_SHORT).show();
            finish();
        });

    }
}


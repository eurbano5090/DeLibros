package com.example.miprimerfragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
                binding.tvDescripcion.setText(libro.getDescripcion());
                binding.ivPortada.setImageResource(libro.getImagenResourceId());
            }
        }

        TextView backButton = findViewById(R.id.btn_tv_volver);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavUtils.navigateUpFromSameTask(DetalleLibroActivity.this);
            }
        });

    }


}


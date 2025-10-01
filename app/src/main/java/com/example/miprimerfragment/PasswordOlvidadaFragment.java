package com.example.miprimerfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.miprimerfragment.databinding.FragmentPasswordOlvidadaBinding;

public class PasswordOlvidadaFragment extends Fragment {

    private FragmentPasswordOlvidadaBinding binding;

    public PasswordOlvidadaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflando el layout de passwordOlvidada
        binding = FragmentPasswordOlvidadaBinding.inflate(inflater, container, false);
        if (getArguments() != null) {
            String nombreUsuario = getArguments().getString("nombre_usuario", "");
            // Establecer el texto en tu EditText del correo
            binding.etEmail.setText(nombreUsuario);
        }

        // Configurar el botón "Atrás"
        binding.btnTvVolver.setOnClickListener(v -> {
            // Mostrar nuevamente el layout del login
            if (getActivity() instanceof LoginActivity) {
                ((LoginActivity) getActivity()).showLoginLayout();
            }
            // Remover el fragment
            requireActivity().getSupportFragmentManager().popBackStack();
        });

        return binding.getRoot();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Limpiar el binding para evitar memory leaks
        binding = null;
    }
}
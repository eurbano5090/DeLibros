package com.example.miprimerfragment;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.miprimerfragment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Configurar NavController
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        AppBarConfiguration appBarConfiguration =
                new AppBarConfiguration.Builder(navController.getGraph()).build();

        NavigationUI.setupWithNavController(binding.topAppBar, navController, appBarConfiguration);

        // Configurar clicks del menú de la AppBar
        binding.topAppBar.setOnMenuItemClickListener(item -> {
            if (item.getItemId() == R.id.action_settings) {
                Toast.makeText(this, "Configuraciones", Toast.LENGTH_SHORT).show();
                return true;
            } else if (item.getItemId() == R.id.action_profile) {
                Toast.makeText(this, "Perfil de usuario", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        });
    }
}

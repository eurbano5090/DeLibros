package com.example.miprimerfragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

public class InicioFragment extends Fragment {
    public InicioFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_inicio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewPager2 viewPager = view.findViewById(R.id.viewPager);

        List<Integer> images = Arrays.asList(
                R.drawable.img4,
                R.drawable.img5,
                R.drawable.img3
        );

        CarruselAdapter adapter = new CarruselAdapter(images);
        viewPager.setAdapter(adapter);

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                // Si llegas al final, vuelve al principio
                if (position == images.size() - 1) {
                    viewPager.postDelayed(() -> viewPager.setCurrentItem(0,true), 1000);
                }
            }
        });
    }
}

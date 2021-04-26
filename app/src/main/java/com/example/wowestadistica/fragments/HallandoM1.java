package com.example.wowestadistica.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.wowestadistica.R;
import com.example.wowestadistica.interfaces.BotonPresionado;


public class HallandoM1 extends Fragment {

    private View vista;
    private ImageView ivArrowRight;
    private ImageView ivArrowLeft;
    private ImageView btnMenu;



    public HallandoM1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_hallando_m1, container, false);

        ivArrowRight = vista.findViewById(R.id.ivArrowRight);
        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);
        btnMenu = vista.findViewById(R.id.btnMenus);

        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);

        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(4);
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(4);
            }
        });

        ivArrowRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(18);
            }
        });

        return  vista;
    }
}
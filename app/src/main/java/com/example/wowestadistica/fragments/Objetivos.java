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


public class Objetivos extends Fragment {


    private View vista;
    private ImageView btnMenu;



    public Objetivos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_objetivos, container, false);

        btnMenu = vista.findViewById(R.id.btnMenu);

        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(1);
            }
        });

        return vista;

    }
}
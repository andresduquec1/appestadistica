package com.example.wowestadistica.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.wowestadistica.R;
import com.example.wowestadistica.interfaces.BotonPresionado;
import com.example.wowestadistica.interfaces.Respuestas;


public class FinAnalicemos extends Fragment {


    private View vista;
    private ImageView btnMenu;
    private String nombre;
    private Respuestas respuestas;


    public FinAnalicemos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_fin_analicemos, container, false);

        btnMenu = vista.findViewById(R.id.btnMenu);

        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);
        respuestas = ((Respuestas)actividad);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                respuestas.finalizar(1);
                boton.menu(4);
            }
        });

        return vista;
    }


}
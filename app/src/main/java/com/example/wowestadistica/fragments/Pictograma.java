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
import com.example.wowestadistica.interfaces.Respuestas;


public class Pictograma extends Fragment {

    private View vista;
    private ImageView ivArrowLeft;


    public Pictograma() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_pictograma, container, false);

        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);

        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);

        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(14);
            }
        });

        return vista;
    }
}
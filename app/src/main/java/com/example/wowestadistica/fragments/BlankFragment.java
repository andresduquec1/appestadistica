package com.example.wowestadistica.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.wowestadistica.R;
import com.example.wowestadistica.interfaces.BotonPresionado;


public class BlankFragment extends Fragment {

    private View vista;
   /* private CardView cvIntroduccion;
    private CardView cvObjetivos;
    private CardView cvUnidades;
    private CardView cvSalir;*/
    private ImageView ivIntroduccion;
    private ImageView ivObjetivos;
    private ImageView ivUnidades;
    private ImageView ivSalir;




    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_blank, container, false);

        ivIntroduccion = vista.findViewById(R.id.ivIntroduccion);
        ivObjetivos = vista.findViewById(R.id.ivObjetivos);
        ivUnidades = vista.findViewById(R.id.ivUnidades);
        ivSalir = vista.findViewById(R.id.ivSalir);

        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);

        ivIntroduccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(2);
            }
        });

        ivObjetivos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(3);
            }
        });

        ivUnidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(4);
            }
        });

        ivSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actividad.finish();
            }
        });

        return vista;
    }


}
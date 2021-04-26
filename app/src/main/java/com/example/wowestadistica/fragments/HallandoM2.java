package com.example.wowestadistica.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wowestadistica.R;
import com.example.wowestadistica.interfaces.BotonPresionado;


public class HallandoM2 extends Fragment {

    private View vista;
    private ImageView ivArrowRight;
    private ImageView ivArrowLeft;
    private ImageView btnMenu;

    private TextView tvMedia;
    private TextView tvMediana;
    private TextView tvModa;

    private String titulo;
    private String mensaje;


    public HallandoM2() {
        // Required empty public constructor
    }

    public void dialogo(){
        new AlertDialog.Builder(getContext())
                .setTitle(titulo)
                .setMessage(mensaje)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                })
                .create().show();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_hallando_m2, container, false);

        ivArrowRight = vista.findViewById(R.id.ivArrowRight);
        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);
        btnMenu = vista.findViewById(R.id.btnMenus);
        tvMedia = vista.findViewById(R.id.tvMedia);
        tvMediana= vista.findViewById(R.id.tvMediana);
        tvModa = vista.findViewById(R.id.tvModa);

        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);

        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(7);
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
                boton.menu(29);
            }
        });

        tvMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titulo = "Media";
                mensaje = "También llamada promedio, los datos presentados se suman y se dividen entre la cantidad de los mismos " +
                "ejemplo 6+5+5+6+3+10+12+8 = 49 \n 49/7 = 7 \nla media es 7";
                dialogo();
            }
        });

        tvMediana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titulo = "Mediana";
                mensaje = "Dato central, sin son dos se saca la media de estos \n3 5 5 6 8 10 12 \nla mediana es 6" ;
                dialogo();
            }
        });

        tvModa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titulo = "Moda";
                mensaje = "Es el dato que mas se repite. Si son dos es bimodal, sin son tres es trimodal \n 3 5 5 6 8 10 12 \nla moda es 5";
                dialogo();
            }
        });

        return  vista;
    }
}
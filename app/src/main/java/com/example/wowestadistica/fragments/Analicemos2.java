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


public class Analicemos2 extends Fragment {

    private View vista;
    private ImageView ivArrowRight;
    private ImageView ivArrowLeft;
    private ImageView btnMenu;
    private ImageView iv1;
    private ImageView iv2;
    private ImageView iv3;
    private ImageView iv4;
    private ImageView iv5;
    private ImageView iv6;
    private ImageView iv7;
    private ImageView iv8;
    private ImageView iv9;
    private ImageView iv10;
    private ImageView iv11;
    private ImageView iv12;
    private ImageView iv13;
    private ImageView iv14;
    private String titulo;
    private String mensaje;


    public Analicemos2() {
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
        vista = inflater.inflate(R.layout.fragment_analicemos2, container, false);

        ivArrowRight = vista.findViewById(R.id.ivArrowRight);
        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);
        btnMenu = vista.findViewById(R.id.btnMenus);
        iv1 = vista.findViewById(R.id.iv1);
        iv2 = vista.findViewById(R.id.iv2);
        iv3 = vista.findViewById(R.id.iv3);
        iv4 = vista.findViewById(R.id.iv4);
        iv5 = vista.findViewById(R.id.iv5);
        iv6 = vista.findViewById(R.id.iv6);
        iv7 = vista.findViewById(R.id.iv7);
        iv8 = vista.findViewById(R.id.iv8);
        iv9 = vista.findViewById(R.id.iv9);
        iv10 = vista.findViewById(R.id.iv10);
        iv11 = vista.findViewById(R.id.iv11);
        iv12 = vista.findViewById(R.id.iv12);
        iv13 = vista.findViewById(R.id.iv13);
        iv14 = vista.findViewById(R.id.iv14);


        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);

        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(5);
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
                boton.menu(10);
            }
        });

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Concepto de Estadística.";
                mensaje = "Ciencia que trata de la toma de desiciones, organización, recopilación, presentación y análisis de datos" +
                        " para deducir conclusiones";
                dialogo();
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Dato";
                mensaje = "Es el conjunto de valores asignados a la variable";
                dialogo();
            }
        });

        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Diagrama";
                mensaje = "Es una representación gráfica de la información recolectada en una tabla de frecuencia";
                dialogo();
            }
        });

        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Espacio muestral";
                mensaje = "Estudia una parte de una población o es un subconjunto de una población";
                dialogo();
            }
        });

        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Frecuencia";
                mensaje = "Número de veces que repite el mismo dato en una lista";
                dialogo();
            }
        });

        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Frecuencia Absoluta";
                mensaje = "Se llama al número de veces que repite un dato especifico dentro de un conjunto";
                dialogo();
            }
        });

        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Frecuencia Relativa";
                mensaje = "Se expresa como una fracción, como un número decimal o como un porcentaje. Se obtiene de dividir" +
                        " la frecuencia absoluta por el número total de datos";
                dialogo();
            }
        });

        iv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Población";
                mensaje = "La totalidad del conjunto estudiado o el conjunto de todos los individuos u objetos que poseen" +
                        " alguna característica común observable";
                dialogo();
            }
        });

        iv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Porcentaje";
                mensaje = "Es el resultado de aplicar el tanto por ciento (%) a una cantidad";
                dialogo();
            }
        });

        iv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Variables";
                mensaje = "Son las características de los elementos de una población y pueden ser cualitativas o cuantitativas";
                dialogo();
            }
        });

        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Variables Continuas";
                mensaje = "Son el resultado de medir y se expresan en números decimales";
                dialogo();
            }
        });

        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Variables Cuantitativas";
                mensaje = "Son las características de una población, muestra que se puede representar numericamente";
                dialogo();
            }
        });

        iv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Variables Cualitativas";
                mensaje = "Representa cualidades o atributos no numericos";
                dialogo();
            }
        });

        iv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Variables Discretas";
                mensaje = "Son el resultado de contar y toman valores enteros";
                dialogo();
            }
        });

        return  vista;
    }
}
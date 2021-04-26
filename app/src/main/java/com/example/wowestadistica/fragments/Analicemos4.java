package com.example.wowestadistica.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.wowestadistica.R;
import com.example.wowestadistica.interfaces.BotonPresionado;
import com.example.wowestadistica.interfaces.Respuestas;

public class Analicemos4 extends Fragment {

    private View vista;
    private ImageView ivArrowRight;
    private ImageView ivArrowLeft;
    private ImageView btnMenu;

    private RadioGroup rg5;
    private RadioGroup rg6;
    private RadioGroup rg7;
    private RadioGroup rg8;
    private RadioGroup rg9;
    private RadioGroup rg10;

    private RadioButton rb13;
    private RadioButton rb14;
    private RadioButton rb15;
    private RadioButton rb16;
    private RadioButton rb17;
    private RadioButton rb18;
    private RadioButton rb19;
    private RadioButton rb20;
    private RadioButton rb21;
    private RadioButton rb22;
    private RadioButton rb23;
    private RadioButton rb24;

    private Respuestas respuestas;




    public Analicemos4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_analicemos4, container, false);

        ivArrowRight = vista.findViewById(R.id.ivArrowRight);
        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);
        btnMenu = vista.findViewById(R.id.btnMenus);


        rg5 = vista.findViewById(R.id.rg5);
        rg6 = vista.findViewById(R.id.rg6);
        rg7 = vista.findViewById(R.id.rg7);
        rg8 = vista.findViewById(R.id.rg8);
        rg9 = vista.findViewById(R.id.rg9);
        rg10 = vista.findViewById(R.id.rg10);

        rb13 = vista.findViewById(R.id.rb13);
        rb14 = vista.findViewById(R.id.rb14);
        rb15= vista.findViewById(R.id.rb15);
        rb16= vista.findViewById(R.id.rb16);
        rb17= vista.findViewById(R.id.rb17);
        rb18= vista.findViewById(R.id.rb18);
        rb19= vista.findViewById(R.id.rb19);
        rb20= vista.findViewById(R.id.rb20);
        rb21= vista.findViewById(R.id.rb21);
        rb22= vista.findViewById(R.id.rb22);
        rb23= vista.findViewById(R.id.rb23);
        rb24= vista.findViewById(R.id.rb24);

        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);
        respuestas = ((Respuestas)actividad);

        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(10);
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
                if(validarRg() ==  0) {
                    if (validarRb()){
                    boton.menu(12);
                }
                }
            }
        });

        return  vista;
    }

    public int validarRg(){
        int numero = 0;
        if (rg5.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta A",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg6.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta B",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg7.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta C",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg8.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta D",Toast.LENGTH_SHORT).show();
            numero++;
        } if (rg9.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta E",Toast.LENGTH_SHORT).show();
            numero++;
        } if (rg10.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la sexta pregunta F",Toast.LENGTH_SHORT).show();
            numero++;
        }

        return numero;
    }

    public boolean validarRb(){
        if(rb13.isChecked()){
            respuestas.respuesta(13);
        } if(rb14.isChecked()){
            respuestas.respuesta(14);
        } if(rb15.isChecked()){
            respuestas.respuesta(15);
        } if(rb16.isChecked()){
            respuestas.respuesta(16);
        } if(rb17.isChecked()){
            respuestas.respuesta(17);
        } if(rb18.isChecked()){
            respuestas.respuesta(18);
        } if(rb19.isChecked()){
            respuestas.respuesta(19);
        } if(rb20.isChecked()){
            respuestas.respuesta(20);
        } if(rb21.isChecked()){
            respuestas.respuesta(21);
        } if(rb22.isChecked()){
            respuestas.respuesta(22);
        } if(rb23.isChecked()){
            respuestas.respuesta(23);
        } if(rb24.isChecked()){
            respuestas.respuesta(24);
        }
        return true;

    }
}
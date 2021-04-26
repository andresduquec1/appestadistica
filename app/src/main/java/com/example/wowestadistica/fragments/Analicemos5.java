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


public class Analicemos5 extends Fragment {

    private View vista;
    private ImageView ivArrowRight;
    private ImageView ivArrowLeft;
    private ImageView btnMenu;

    private RadioGroup rg11;
    private RadioGroup rg12;
    private RadioGroup rg13;
    private RadioGroup rg14;

    private RadioButton rb25;
    private RadioButton rb26;
    private RadioButton rb27;
    private RadioButton rb28;
    private RadioButton rb29;
    private RadioButton rb30;
    private RadioButton rb31;
    private RadioButton rb32;
    private RadioButton rb33;
    private RadioButton rb34;
    private RadioButton rb35;
    private RadioButton rb36;
    private RadioButton rb37;
    private RadioButton rb38;

    private Respuestas respuestas;


    public Analicemos5() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_analicemos5, container, false);

        ivArrowRight = vista.findViewById(R.id.ivArrowRight);
        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);
        btnMenu = vista.findViewById(R.id.btnMenus);

        rg11 = vista.findViewById(R.id.rg11);
        rg12 = vista.findViewById(R.id.rg12);
        rg13 = vista.findViewById(R.id.rg13);
        rg14 = vista.findViewById(R.id.rg14);

        rb25 = vista.findViewById(R.id.rb25);
        rb26 = vista.findViewById(R.id.rb25);
        rb27 = vista.findViewById(R.id.rb25);
        rb28 = vista.findViewById(R.id.rb25);
        rb29 = vista.findViewById(R.id.rb25);
        rb30 = vista.findViewById(R.id.rb25);
        rb31 = vista.findViewById(R.id.rb25);
        rb32 = vista.findViewById(R.id.rb25);
        rb33 = vista.findViewById(R.id.rb25);
        rb34 = vista.findViewById(R.id.rb25);
        rb35 = vista.findViewById(R.id.rb25);
        rb36 = vista.findViewById(R.id.rb25);
        rb37 = vista.findViewById(R.id.rb25);
        rb38 = vista.findViewById(R.id.rb25);

        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);
        respuestas = ((Respuestas)actividad);

        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(11);
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
                    boton.menu(13);
                }
                }
            }
        });

        return  vista;
    }

    public int validarRg(){
        int numero = 0;
        if (rg11.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta A",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg12.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta B",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg13.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta C",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg14.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta D",Toast.LENGTH_SHORT).show();
            numero++;
        }

        return numero;
    }

    public boolean validarRb(){
        if(rb25.isChecked()){
            respuestas.respuesta(25);
        } if(rb26.isChecked()){
            respuestas.respuesta(26);
        } if(rb27.isChecked()){
            respuestas.respuesta(27);
        } if(rb28.isChecked()){
            respuestas.respuesta(28);
        } if(rb29.isChecked()){
            respuestas.respuesta(29);
        } if(rb30.isChecked()){
            respuestas.respuesta(30);
        } if(rb31.isChecked()){
            respuestas.respuesta(31);
        } if(rb32.isChecked()){
            respuestas.respuesta(32);
        } if(rb33.isChecked()){
            respuestas.respuesta(33);
        } if(rb34.isChecked()){
            respuestas.respuesta(34);
        } if(rb35.isChecked()){
            respuestas.respuesta(35);
        } if(rb36.isChecked()){
            respuestas.respuesta(36);
        } if(rb37.isChecked()){
            respuestas.respuesta(37);
        } if(rb38.isChecked()){
            respuestas.respuesta(38);
        }
        return true;
    }
}
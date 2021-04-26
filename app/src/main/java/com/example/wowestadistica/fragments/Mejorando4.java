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


public class Mejorando4 extends Fragment {

    private View vista;
    private ImageView ivArrowRight;
    private ImageView ivArrowLeft;
    private ImageView btnMenu;

    private RadioGroup rg46;
    private RadioGroup rg47;
    private RadioGroup rg48;
    private RadioGroup rg49;
    private RadioGroup rg50;

    private RadioButton rb173;
    private RadioButton rb174;
    private RadioButton rb175;
    private RadioButton rb176;
    private RadioButton rb177;
    private RadioButton rb178;
    private RadioButton rb179;
    private RadioButton rb180;
    private RadioButton rb181;
    private RadioButton rb182;
    private RadioButton rb183;
    private RadioButton rb184;
    private RadioButton rb185;
    private RadioButton rb186;
    private RadioButton rb187;
    private RadioButton rb188;
    private RadioButton rb189;
    private RadioButton rb190;
    private RadioButton rb191;
    private RadioButton rb192;
    private RadioButton rb193;
    private RadioButton rb194;
    private RadioButton rb195;
    private RadioButton rb196;
    private RadioButton rb197;

    private Respuestas respuestas;

    public Mejorando4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_mejorando4, container, false);

        ivArrowRight = vista.findViewById(R.id.ivArrowRight);
        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);
        btnMenu = vista.findViewById(R.id.btnMenus);

        rg46 = vista.findViewById(R.id.rg46);
        rg47 = vista.findViewById(R.id.rg47);
        rg48 = vista.findViewById(R.id.rg48);
        rg49 = vista.findViewById(R.id.rg49);
        rg50 = vista.findViewById(R.id.rg50);


        rb173 = vista.findViewById(R.id.rb173);
        rb174 = vista.findViewById(R.id.rb174);
        rb175 = vista.findViewById(R.id.rb175);
        rb176 = vista.findViewById(R.id.rb176);
        rb177 = vista.findViewById(R.id.rb177);
        rb178 = vista.findViewById(R.id.rb178);
        rb179 = vista.findViewById(R.id.rb179);
        rb180 = vista.findViewById(R.id.rb180);
        rb181 = vista.findViewById(R.id.rb181);
        rb182 = vista.findViewById(R.id.rb182);
        rb183 = vista.findViewById(R.id.rb183);
        rb184 = vista.findViewById(R.id.rb184);
        rb185 = vista.findViewById(R.id.rb185);
        rb186 = vista.findViewById(R.id.rb186);
        rb187 = vista.findViewById(R.id.rb187);
        rb188 = vista.findViewById(R.id.rb188);
        rb189 = vista.findViewById(R.id.rb189);
        rb190 = vista.findViewById(R.id.rb190);
        rb191 = vista.findViewById(R.id.rb191);
        rb192 = vista.findViewById(R.id.rb192);
        rb193 = vista.findViewById(R.id.rb193);
        rb194 = vista.findViewById(R.id.rb194);
        rb195 = vista.findViewById(R.id.rb195);
        rb196 = vista.findViewById(R.id.rb196);
        rb197 = vista.findViewById(R.id.rb197);

        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);
        respuestas = ((Respuestas)actividad);

        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(22);
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
                if (validarRg() == 0) {
                    if (validarRb()){
                    boton.menu(27);
                }
            }
            }
        });

        return  vista;
    }

    public int validarRg(){
        int numero = 0;
        if (rg46.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta A",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg47.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta E",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg48.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta C",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg49.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta D",Toast.LENGTH_SHORT).show();
            numero++;
        } if (rg50.getCheckedRadioButtonId() == -1){
            Toast.makeText(getContext(),"No respondió la pregunta B",Toast.LENGTH_SHORT).show();
            numero++;
        }

        return numero;
    }

    public boolean validarRb(){
        if(rb173.isChecked()){
            respuestas.respuesta(173);
        } if(rb174.isChecked()){
            respuestas.respuesta(174);
        } if(rb175.isChecked()){
            respuestas.respuesta(175);
        } if(rb176.isChecked()){
            respuestas.respuesta(176);
        } if(rb177.isChecked()){
            respuestas.respuesta(177);
        } if(rb178.isChecked()){
            respuestas.respuesta(178);
        } if(rb179.isChecked()){
            respuestas.respuesta(179);
        } if(rb180.isChecked()){
            respuestas.respuesta(180);
        } if(rb181.isChecked()){
            respuestas.respuesta(181);
        } if(rb182.isChecked()){
            respuestas.respuesta(182);
        } if(rb183.isChecked()){
            respuestas.respuesta(183);
        } if(rb184.isChecked()){
            respuestas.respuesta(184);
        }if(rb185.isChecked()){
            respuestas.respuesta(185);
        } if(rb186.isChecked()){
            respuestas.respuesta(186);
        } if(rb187.isChecked()){
            respuestas.respuesta(187);
        } if(rb188.isChecked()){
            respuestas.respuesta(188);
        } if(rb189.isChecked()){
            respuestas.respuesta(189);
        } if(rb190.isChecked()){
            respuestas.respuesta(190);
        } if(rb191.isChecked()){
            respuestas.respuesta(191);
        } if(rb192.isChecked()){
            respuestas.respuesta(192);
        } if(rb193.isChecked()){
            respuestas.respuesta(193);
        } if(rb194.isChecked()){
            respuestas.respuesta(194);
        } if(rb195.isChecked()){
            respuestas.respuesta(195);
        } if(rb196.isChecked()){
            respuestas.respuesta(196);
        } if(rb197.isChecked()){
            respuestas.respuesta(197);
        }
        return true;

    }
}
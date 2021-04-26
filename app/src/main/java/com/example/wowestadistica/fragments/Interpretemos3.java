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


public class Interpretemos3 extends Fragment {


    private View vista;
    private ImageView ivArrowRight;
    private ImageView ivArrowLeft;
    private ImageView btnMenu;

    private RadioGroup rg15;
    private RadioGroup rg16;
    private RadioGroup rg17;
    private RadioGroup rg18;

    private RadioButton rb39;
    private RadioButton rb40;
    private RadioButton rb41;
    private RadioButton rb42;
    private RadioButton rb43;
    private RadioButton rb44;
    private RadioButton rb45;
    private RadioButton rb46;
    private RadioButton rb47;
    private RadioButton rb48;
    private RadioButton rb49;
    private RadioButton rb50;

    private Respuestas respuestas;

    public Interpretemos3() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_interpretemos3, container, false);

        ivArrowRight = vista.findViewById(R.id.ivArrowRight);
        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);
        btnMenu = vista.findViewById(R.id.btnMenus);

        rg15 = vista.findViewById(R.id.rg15);
        rg16 = vista.findViewById(R.id.rg16);
        rg17 = vista.findViewById(R.id.rg17);
        rg18 = vista.findViewById(R.id.rg18);


        rb39 = vista.findViewById(R.id.rb39);
        rb40 = vista.findViewById(R.id.rb40);
        rb41 = vista.findViewById(R.id.rb41);
        rb42 = vista.findViewById(R.id.rb42);
        rb43 = vista.findViewById(R.id.rb43);
        rb44 = vista.findViewById(R.id.rb44);
        rb45 = vista.findViewById(R.id.rb45);
        rb46 = vista.findViewById(R.id.rb46);
        rb47 = vista.findViewById(R.id.rb47);
        rb48 = vista.findViewById(R.id.rb48);
        rb49 = vista.findViewById(R.id.rb49);
        rb50 = vista.findViewById(R.id.rb50);





        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);
        respuestas = ((Respuestas)actividad);


        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(14);
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
                    boton.menu(16);
                }
            }
            }
        });

        return  vista;
    }

    public int validarRg(){
        int numero = 0;
        if (rg15.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 1",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg16.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 2",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg17.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 3",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg18.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 4",Toast.LENGTH_SHORT).show();
            numero++;
        }

        return numero;
    }

    public boolean validarRb(){
        if(rb39.isChecked()){
            respuestas.respuesta(39);
        } if(rb40.isChecked()){
            respuestas.respuesta(40);
        } if(rb41.isChecked()){
            respuestas.respuesta(41);
        } if(rb42.isChecked()){
            respuestas.respuesta(42);
        } if(rb43.isChecked()){
            respuestas.respuesta(43);
        } if(rb44.isChecked()){
            respuestas.respuesta(44);
        } if(rb45.isChecked()){
            respuestas.respuesta(45);
        } if(rb46.isChecked()){
            respuestas.respuesta(46);
        } if(rb47.isChecked()){
            respuestas.respuesta(47);
        } if(rb48.isChecked()){
            respuestas.respuesta(48);
        } if(rb49.isChecked()){
            respuestas.respuesta(49);
        } if(rb50.isChecked()){
            respuestas.respuesta(50);
        }
        return true;

    }

}
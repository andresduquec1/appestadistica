package com.example.wowestadistica.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.wowestadistica.R;
import com.example.wowestadistica.interfaces.BotonPresionado;
import com.example.wowestadistica.interfaces.Respuestas;

import java.util.ArrayList;

public class Analicemos3 extends Fragment {

    private View vista;
    private ImageView ivArrowRight;
    private ImageView ivArrowLeft;
    private ImageView btnMenu;


    private RadioGroup rg1;
    private RadioGroup rg2;
    private RadioGroup rg3;
    private RadioGroup rg4;


    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private RadioButton rb5;
    private RadioButton rb6;
    private RadioButton rb7;
    private RadioButton rb8;
    private RadioButton rb9;
    private RadioButton rb10;
    private RadioButton rb11;
    private RadioButton rb12;

    private Respuestas respuestas;




    public Analicemos3() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_analicemos3, container, false);

        ivArrowRight = vista.findViewById(R.id.ivArrowRight);
        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);
        btnMenu = vista.findViewById(R.id.btnMenus);

        rg1 = vista.findViewById(R.id.rg1);
        rg2 = vista.findViewById(R.id.rg2);
        rg3 = vista.findViewById(R.id.rg3);
        rg4 = vista.findViewById(R.id.rg4);


        rb1 = vista.findViewById(R.id.rb1);
        rb2 = vista.findViewById(R.id.rb2);
        rb3 = vista.findViewById(R.id.rb3);
        rb4 = vista.findViewById(R.id.rb4);
        rb5 = vista.findViewById(R.id.rb5);
        rb6 = vista.findViewById(R.id.rb6);
        rb7 = vista.findViewById(R.id.rb7);
        rb8 = vista.findViewById(R.id.rb8);
        rb9 = vista.findViewById(R.id.rb9);
        rb10= vista.findViewById(R.id.rb10);
        rb11= vista.findViewById(R.id.rb11);
        rb12= vista.findViewById(R.id.rb12);



        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);
        respuestas = ((Respuestas)actividad);


        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(9);
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
                        boton.menu(11);
                    }
                }
            }
        });





          /*      if(rb1.isChecked()){
                    Toast.makeText(getContext(),"Marco el radio 1",Toast.LENGTH_SHORT).show();
                }

           */



        return  vista;
    }

    public int validarRg(){
       int numero = 0;
        if (rg1.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 1",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg2.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 2",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg3.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 3",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg4.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 4",Toast.LENGTH_SHORT).show();
            numero++;
        }

        return numero;
    }

    public boolean validarRb(){
        if(rb1.isChecked()){
            respuestas.respuesta(1);
        } if(rb2.isChecked()){
            respuestas.respuesta(2);
        } if(rb3.isChecked()){
            respuestas.respuesta(3);
        } if(rb4.isChecked()){
            respuestas.respuesta(4);
        } if(rb5.isChecked()){
            respuestas.respuesta(5);
        } if(rb6.isChecked()){
            respuestas.respuesta(6);
        } if(rb7.isChecked()){
            respuestas.respuesta(7);
        } if(rb8.isChecked()){
            respuestas.respuesta(8);
        } if(rb9.isChecked()){
            respuestas.respuesta(9);
        } if(rb10.isChecked()){
            respuestas.respuesta(10);
        } if(rb11.isChecked()){
            respuestas.respuesta(11);
        } if(rb12.isChecked()){
            respuestas.respuesta(12);
        }
        return true;

    }

   /* public void validarSeleccion(ArrayList<Integer> seleccionadas){
        for (int i : seleccionadas) {
            Toast.makeText(getContext(),i,Toast.LENGTH_SHORT).show();
        }
    }
*/
}
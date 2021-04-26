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


public class Interpretemos5 extends Fragment {

    private View vista;
    private ImageView ivArrowRight;
    private ImageView ivArrowLeft;
    private ImageView btnMenu;


    private RadioGroup rg19;
    private RadioGroup rg20;
    private RadioGroup rg21;
    private RadioGroup rg22;

    private RadioButton rb51;
    private RadioButton rb52;
    private RadioButton rb53;
    private RadioButton rb54;
    private RadioButton rb55;
    private RadioButton rb56;
    private RadioButton rb57;
    private RadioButton rb58;
    private RadioButton rb59;
    private RadioButton rb60;
    private RadioButton rb61;
    private RadioButton rb62;
    private RadioButton rb63;
    private RadioButton rb64;
    private RadioButton rb65;
    private RadioButton rb66;

    private Respuestas respuestas;

    public Interpretemos5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_interpretemos5, container, false);

        ivArrowRight = vista.findViewById(R.id.ivArrowRight);
        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);
        btnMenu = vista.findViewById(R.id.btnMenus);

        rg19 = vista.findViewById(R.id.rg19);
        rg20 = vista.findViewById(R.id.rg20);
        rg21 = vista.findViewById(R.id.rg21);
        rg22 = vista.findViewById(R.id.rg22);


        rb51 = vista.findViewById(R.id.rb51);
        rb52 = vista.findViewById(R.id.rb52);
        rb53 = vista.findViewById(R.id.rb53);
        rb54 = vista.findViewById(R.id.rb54);
        rb55 = vista.findViewById(R.id.rb55);
        rb56 = vista.findViewById(R.id.rb56);
        rb57 = vista.findViewById(R.id.rb57);
        rb58 = vista.findViewById(R.id.rb58);
        rb59 = vista.findViewById(R.id.rb59);
        rb60 = vista.findViewById(R.id.rb60);
        rb61 = vista.findViewById(R.id.rb61);
        rb62 = vista.findViewById(R.id.rb62);
        rb63 = vista.findViewById(R.id.rb63);
        rb64 = vista.findViewById(R.id.rb64);
        rb65 = vista.findViewById(R.id.rb65);
        rb66 = vista.findViewById(R.id.rb66);

        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);
        respuestas = ((Respuestas)actividad);

        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(16);
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
                    boton.menu(25);
                }
            }
            }
        });

        return  vista;
    }

    public int validarRg(){
        int numero = 0;
        if (rg19.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 1",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg20.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 2",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg21.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 3",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg22.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 4",Toast.LENGTH_SHORT).show();
            numero++;
        }

        return numero;
    }

    public boolean validarRb(){
        if(rb51.isChecked()){
            respuestas.respuesta(51);
        } if(rb52.isChecked()){
            respuestas.respuesta(52);
        } if(rb53.isChecked()){
            respuestas.respuesta(53);
        } if(rb54.isChecked()){
            respuestas.respuesta(54);
        } if(rb55.isChecked()){
            respuestas.respuesta(55);
        } if(rb56.isChecked()){
            respuestas.respuesta(56);
        } if(rb57.isChecked()){
            respuestas.respuesta(57);
        } if(rb58.isChecked()){
            respuestas.respuesta(58);
        } if(rb59.isChecked()){
            respuestas.respuesta(59);
        } if(rb60.isChecked()){
            respuestas.respuesta(60);
        } if(rb61.isChecked()){
            respuestas.respuesta(61);
        } if(rb62.isChecked()){
            respuestas.respuesta(62);
        }if(rb63.isChecked()){
            respuestas.respuesta(63);
        }if(rb64.isChecked()){
            respuestas.respuesta(64);
        }if(rb65.isChecked()){
            respuestas.respuesta(65);
        }if(rb66.isChecked()){
            respuestas.respuesta(66);
        }
        return true;

    }
}
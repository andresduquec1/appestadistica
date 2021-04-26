package com.example.wowestadistica.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
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


public class HallandoM3 extends Fragment {

    private View vista;
    private ImageView ivArrowRight;
    private ImageView ivArrowLeft;
    private ImageView btnMenu;
    private TextInputEditText respuesta1;
    private TextInputEditText respuesta2;
    private RadioGroup rg23;
    private RadioGroup rg24;

    private RadioButton rb67;
    private RadioButton rb68;
    private RadioButton rb69;
    private RadioButton rb70;

    private Respuestas respuestas;


    public HallandoM3() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_hallando_m3, container, false);

        ivArrowRight = vista.findViewById(R.id.ivArrowRight);
        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);
        btnMenu = vista.findViewById(R.id.btnMenus);

        respuesta1 = vista.findViewById(R.id.tiRespuesta1);
        respuesta2 = vista.findViewById(R.id.tiRespuesta2);


        rg23 = vista.findViewById(R.id.rg23);
        rg24 = vista.findViewById(R.id.rg24);

        rb67 = vista.findViewById(R.id.rb67);
        rb68 = vista.findViewById(R.id.rb68);
        rb69 = vista.findViewById(R.id.rb69);
        rb70 = vista.findViewById(R.id.rb70);

        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);
        respuestas = ((Respuestas)actividad);

        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(18);
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

                        if(!respuesta1.getText().toString().isEmpty() && !respuesta2.getText().toString().isEmpty()) {
                            respuestas.respuesta1(respuesta1.getText().toString());
                            respuestas.respuesta2(respuesta2.getText().toString());
                            boton.menu(20);
                        }else{
                            Toast.makeText(getContext(),"Por favor escriba su respuesta",Toast.LENGTH_SHORT).show();
                        }
                }
            }
            }
        });

        return  vista;
    }

    public int validarRg(){
        int numero = 0;
        if (rg23.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la primera pregunta",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg24.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la tercera pregunta",Toast.LENGTH_SHORT).show();
            numero++;
        }

        return numero;
    }

    public boolean validarRb(){
        if(rb67.isChecked()){
            respuestas.respuesta(67);
        } if(rb68.isChecked()){
            respuestas.respuesta(68);
        } if(rb69.isChecked()){
            respuestas.respuesta(69);
        } if(rb70.isChecked()){
            respuestas.respuesta(70);
        }
        return true;

    }
}
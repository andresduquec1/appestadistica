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


public class HallandoM4 extends Fragment {

    private View vista;
    private ImageView ivArrowRight;
    private ImageView ivArrowLeft;
    private ImageView btnMenu;

    private RadioGroup rg25;
    private RadioGroup rg26;
    private RadioGroup rg27;

    private RadioButton rb71;
    private RadioButton rb72;
    private RadioButton rb73;
    private RadioButton rb74;
    private RadioButton rb75;
    private RadioButton rb76;
    private RadioButton rb77;
    private RadioButton rb78;
    private RadioButton rb79;
    private RadioButton rb80;
    private RadioButton rb81;
    private RadioButton rb82;
    private RadioButton rb83;
    private RadioButton rb84;
    private RadioButton rb85;

    private Respuestas respuestas;

    public HallandoM4() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_hallando_m4, container, false);

        ivArrowRight = vista.findViewById(R.id.ivArrowRight);
        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);
        btnMenu = vista.findViewById(R.id.btnMenus);

        rg25 = vista.findViewById(R.id.rg25);
        rg26 = vista.findViewById(R.id.rg26);
        rg27 = vista.findViewById(R.id.rg27);

        rb71 = vista.findViewById(R.id.rb71);
        rb72 = vista.findViewById(R.id.rb72);
        rb73 = vista.findViewById(R.id.rb73);
        rb74 = vista.findViewById(R.id.rb74);
        rb75 = vista.findViewById(R.id.rb75);
        rb76 = vista.findViewById(R.id.rb76);
        rb77 = vista.findViewById(R.id.rb77);
        rb78 = vista.findViewById(R.id.rb78);
        rb79 = vista.findViewById(R.id.rb79);
        rb80 = vista.findViewById(R.id.rb80);
        rb81 = vista.findViewById(R.id.rb81);
        rb82 = vista.findViewById(R.id.rb82);
        rb83 = vista.findViewById(R.id.rb83);
        rb84 = vista.findViewById(R.id.rb84);
        rb85 = vista.findViewById(R.id.rb85);

        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);
        respuestas = ((Respuestas)actividad);

        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(29);
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
                    boton.menu(26);
                }
            }
            }
        });

        return  vista;
    }

    public int validarRg(){
        int numero = 0;
        if (rg25.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 1",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg26.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 2",Toast.LENGTH_SHORT).show();
            numero++;
        } if (rg27.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 3",Toast.LENGTH_SHORT).show();
            numero++;
        }

        return numero;
    }

    public boolean validarRb(){
        if(rb71.isChecked()){
            respuestas.respuesta(71);
        } if(rb72.isChecked()){
            respuestas.respuesta(72);
        } if(rb73.isChecked()){
            respuestas.respuesta(73);
        } if(rb74.isChecked()){
            respuestas.respuesta(74);
        } if(rb75.isChecked()){
            respuestas.respuesta(75);
        } if(rb76.isChecked()){
            respuestas.respuesta(76);
        } if(rb77.isChecked()){
            respuestas.respuesta(77);
        } if(rb78.isChecked()){
            respuestas.respuesta(78);
        } if(rb79.isChecked()){
            respuestas.respuesta(79);
        } if(rb80.isChecked()){
            respuestas.respuesta(80);
        } if(rb81.isChecked()){
            respuestas.respuesta(81);
        } if(rb82.isChecked()){
            respuestas.respuesta(82);
        }if(rb83.isChecked()){
            respuestas.respuesta(83);
        }if(rb84.isChecked()){
            respuestas.respuesta(84);
        }if(rb85.isChecked()){
            respuestas.respuesta(85);
        }
        return true;

    }
}
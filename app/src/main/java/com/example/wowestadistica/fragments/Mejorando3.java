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


public class Mejorando3 extends Fragment {

    private View vista;
    private ImageView ivArrowRight;
    private ImageView ivArrowLeft;
    private ImageView btnMenu;

    private RadioGroup rg38;
    private RadioGroup rg39;
    private RadioGroup rg40;
    private RadioGroup rg41;
    private RadioGroup rg42;
    private RadioGroup rg43;
    private RadioGroup rg44;
    private RadioGroup rg45;

    private RadioButton rb126;
    private RadioButton rb127;
    private RadioButton rb128;
    private RadioButton rb129;
    private RadioButton rb130;
    private RadioButton rb131;
    private RadioButton rb132;
    private RadioButton rb133;
    private RadioButton rb134;
    private RadioButton rb135;
    private RadioButton rb136;
    private RadioButton rb137;
    private RadioButton rb138;
    private RadioButton rb139;
    private RadioButton rb140;
    private RadioButton rb141;
    private RadioButton rb142;
    private RadioButton rb143;
    private RadioButton rb144;
    private RadioButton rb145;
    private RadioButton rb146;
    private RadioButton rb147;
    private RadioButton rb148;
    private RadioButton rb149;
    private RadioButton rb150;
    private RadioButton rb151;
    private RadioButton rb152;
    private RadioButton rb153;
    private RadioButton rb154;
    private RadioButton rb155;
    private RadioButton rb156;
    private RadioButton rb157;
    private RadioButton rb158;
    private RadioButton rb159;
    private RadioButton rb160;
    private RadioButton rb161;
    private RadioButton rb162;
    private RadioButton rb163;
    private RadioButton rb164;
    private RadioButton rb165;
    private RadioButton rb166;
    private RadioButton rb167;
    private RadioButton rb168;
    private RadioButton rb169;
    private RadioButton rb170;
    private RadioButton rb171;
    private RadioButton rb172;

    private Respuestas respuestas;

    public Mejorando3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_mejorando3, container, false);

        ivArrowRight = vista.findViewById(R.id.ivArrowRight);
        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);
        btnMenu = vista.findViewById(R.id.btnMenus);

        rg38 = vista.findViewById(R.id.rg38);
        rg39 = vista.findViewById(R.id.rg39);
        rg40 = vista.findViewById(R.id.rg40);
        rg41 = vista.findViewById(R.id.rg41);
        rg42 = vista.findViewById(R.id.rg42);
        rg43 = vista.findViewById(R.id.rg43);
        rg44 = vista.findViewById(R.id.rg44);
        rg45 = vista.findViewById(R.id.rg45);


        rb126 = vista.findViewById(R.id.rb126);
        rb127 = vista.findViewById(R.id.rb127);
        rb128 = vista.findViewById(R.id.rb128);
        rb129 = vista.findViewById(R.id.rb129);
        rb130 = vista.findViewById(R.id.rb130);
        rb131 = vista.findViewById(R.id.rb131);
        rb132 = vista.findViewById(R.id.rb132);
        rb133 = vista.findViewById(R.id.rb133);
        rb134 = vista.findViewById(R.id.rb134);
        rb135 = vista.findViewById(R.id.rb135);
        rb136 = vista.findViewById(R.id.rb136);
        rb137 = vista.findViewById(R.id.rb137);
        rb138 = vista.findViewById(R.id.rb138);
        rb139 = vista.findViewById(R.id.rb139);
        rb140 = vista.findViewById(R.id.rb140);
        rb141 = vista.findViewById(R.id.rb141);
        rb142 = vista.findViewById(R.id.rb142);
        rb143 = vista.findViewById(R.id.rb143);
        rb144 = vista.findViewById(R.id.rb144);
        rb145 = vista.findViewById(R.id.rb145);
        rb146 = vista.findViewById(R.id.rb146);
        rb147 = vista.findViewById(R.id.rb147);
        rb148 = vista.findViewById(R.id.rb148);
        rb149 = vista.findViewById(R.id.rb149);
        rb150 = vista.findViewById(R.id.rb150);
        rb151 = vista.findViewById(R.id.rb151);
        rb152 = vista.findViewById(R.id.rb152);
        rb153 = vista.findViewById(R.id.rb153);
        rb154 = vista.findViewById(R.id.rb154);
        rb155 = vista.findViewById(R.id.rb155);
        rb156 = vista.findViewById(R.id.rb156);
        rb157 = vista.findViewById(R.id.rb157);
        rb158 = vista.findViewById(R.id.rb158);
        rb159 = vista.findViewById(R.id.rb159);
        rb160 = vista.findViewById(R.id.rb160);
        rb161 = vista.findViewById(R.id.rb161);
        rb162 = vista.findViewById(R.id.rb162);
        rb163 = vista.findViewById(R.id.rb163);
        rb164 = vista.findViewById(R.id.rb164);
        rb165 = vista.findViewById(R.id.rb165);
        rb166 = vista.findViewById(R.id.rb166);
        rb167 = vista.findViewById(R.id.rb167);
        rb168 = vista.findViewById(R.id.rb168);
        rb169 = vista.findViewById(R.id.rb169);
        rb170 = vista.findViewById(R.id.rb170);
        rb171 = vista.findViewById(R.id.rb171);
        rb172 = vista.findViewById(R.id.rb172);



        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);
        respuestas = ((Respuestas)actividad);

        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(21);
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
                    boton.menu(23);
                }
            }
            }
        });

        return  vista;
    }

    public int validarRg(){
        int numero = 0;
        if (rg38.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 1.A",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg39.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 1.B",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg40.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 1.C",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg41.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 1.D",Toast.LENGTH_SHORT).show();
            numero++;
        }if (rg42.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 2.A",Toast.LENGTH_SHORT).show();
            numero++;
        }if (rg43.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 2.B",Toast.LENGTH_SHORT).show();
            numero++;
        }if (rg44.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 2.C",Toast.LENGTH_SHORT).show();
            numero++;
        }if (rg45.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 2.D",Toast.LENGTH_SHORT).show();
            numero++;
        }

        return numero;
    }

    public boolean validarRb(){
        if(rb126.isChecked()){
            respuestas.respuesta(126);
        }if(rb127.isChecked()){
            respuestas.respuesta(127);
        } if(rb128.isChecked()){
            respuestas.respuesta(128);
        } if(rb129.isChecked()){
            respuestas.respuesta(129);
        } if(rb130.isChecked()){
            respuestas.respuesta(130);
        } if(rb131.isChecked()){
            respuestas.respuesta(131);
        } if(rb132.isChecked()){
            respuestas.respuesta(132);
        } if(rb133.isChecked()){
            respuestas.respuesta(133);
        } if(rb134.isChecked()){
            respuestas.respuesta(134);
        } if(rb135.isChecked()){
            respuestas.respuesta(135);
        } if(rb136.isChecked()){
            respuestas.respuesta(136);
        } if(rb137.isChecked()){
            respuestas.respuesta(137);
        } if(rb138.isChecked()){
            respuestas.respuesta(138);
        }if(rb139.isChecked()){
            respuestas.respuesta(139);
        } if(rb140.isChecked()){
            respuestas.respuesta(140);
        } if(rb141.isChecked()){
            respuestas.respuesta(141);
        } if(rb142.isChecked()){
            respuestas.respuesta(142);
        } if(rb143.isChecked()){
            respuestas.respuesta(143);
        } if(rb144.isChecked()){
            respuestas.respuesta(144);
        } if(rb145.isChecked()){
            respuestas.respuesta(145);
        } if(rb146.isChecked()){
            respuestas.respuesta(146);
        } if(rb147.isChecked()){
            respuestas.respuesta(147);
        } if(rb148.isChecked()){
            respuestas.respuesta(148);
        } if(rb149.isChecked()){
            respuestas.respuesta(149);
        } if(rb150.isChecked()){
            respuestas.respuesta(150);
        }if(rb151.isChecked()){
            respuestas.respuesta(151);
        } if(rb152.isChecked()){
            respuestas.respuesta(152);
        } if(rb153.isChecked()){
            respuestas.respuesta(153);
        } if(rb154.isChecked()){
            respuestas.respuesta(154);
        } if(rb155.isChecked()){
            respuestas.respuesta(155);
        } if(rb156.isChecked()){
            respuestas.respuesta(156);
        } if(rb157.isChecked()){
            respuestas.respuesta(157);
        } if(rb158.isChecked()){
            respuestas.respuesta(158);
        } if(rb159.isChecked()){
            respuestas.respuesta(159);
        } if(rb160.isChecked()){
            respuestas.respuesta(160);
        } if(rb161.isChecked()){
            respuestas.respuesta(161);
        } if(rb162.isChecked()){
            respuestas.respuesta(162);
        }if(rb163.isChecked()){
            respuestas.respuesta(163);
        }if(rb164.isChecked()){
            respuestas.respuesta(164);
        }if(rb165.isChecked()){
            respuestas.respuesta(165);
        }if(rb166.isChecked()){
            respuestas.respuesta(166);
        }if(rb167.isChecked()){
            respuestas.respuesta(167);
        } if(rb168.isChecked()){
            respuestas.respuesta(168);
        } if(rb169.isChecked()){
            respuestas.respuesta(169);
        } if(rb170.isChecked()){
            respuestas.respuesta(170);
        } if(rb171.isChecked()){
            respuestas.respuesta(171);
        } if(rb172.isChecked()){
            respuestas.respuesta(172);
        }
        return true;

    }
}
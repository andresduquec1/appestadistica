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


public class Mejorando2 extends Fragment {

    private View vista;
    private ImageView ivArrowRight;
    private ImageView ivArrowLeft;
    private ImageView btnMenu;

    private RadioGroup rg28;
    private RadioGroup rg29;
    private RadioGroup rg30;
    private RadioGroup rg31;
    private RadioGroup rg32;
    private RadioGroup rg33;
    private RadioGroup rg34;
    private RadioGroup rg35;
    private RadioGroup rg36;
    private RadioGroup rg37;

    private RadioButton rb86;
    private RadioButton rb87;
    private RadioButton rb88;
    private RadioButton rb89;
    private RadioButton rb90;
    private RadioButton rb91;
    private RadioButton rb92;
    private RadioButton rb93;
    private RadioButton rb94;
    private RadioButton rb95;
    private RadioButton rb96;
    private RadioButton rb97;
    private RadioButton rb98;
    private RadioButton rb99;
    private RadioButton rb100;
    private RadioButton rb101;
    private RadioButton rb102;
    private RadioButton rb103;
    private RadioButton rb104;
    private RadioButton rb105;
    private RadioButton rb106;
    private RadioButton rb107;
    private RadioButton rb108;
    private RadioButton rb109;
    private RadioButton rb110;
    private RadioButton rb111;
    private RadioButton rb112;
    private RadioButton rb113;
    private RadioButton rb114;
    private RadioButton rb115;
    private RadioButton rb116;
    private RadioButton rb117;
    private RadioButton rb118;
    private RadioButton rb119;
    private RadioButton rb120;
    private RadioButton rb121;
    private RadioButton rb122;
    private RadioButton rb123;
    private RadioButton rb124;
    private RadioButton rb125;

    private Respuestas respuestas;




    public Mejorando2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_mejorando2, container, false);

        ivArrowRight = vista.findViewById(R.id.ivArrowRight);
        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);
        btnMenu = vista.findViewById(R.id.btnMenus);

        rg28 = vista.findViewById(R.id.rg28);
        rg29 = vista.findViewById(R.id.rg29);
        rg30 = vista.findViewById(R.id.rg30);
        rg31 = vista.findViewById(R.id.rg31);
        rg32 = vista.findViewById(R.id.rg32);
        rg33 = vista.findViewById(R.id.rg33);
        rg34 = vista.findViewById(R.id.rg34);
        rg35 = vista.findViewById(R.id.rg35);
        rg36 = vista.findViewById(R.id.rg36);
        rg37 = vista.findViewById(R.id.rg37);


        rb86 = vista.findViewById(R.id.rb86);
        rb87 = vista.findViewById(R.id.rb87);
        rb88 = vista.findViewById(R.id.rb88);
        rb89 = vista.findViewById(R.id.rb89);
        rb90 = vista.findViewById(R.id.rb90);
        rb91 = vista.findViewById(R.id.rb91);
        rb92 = vista.findViewById(R.id.rb92);
        rb93 = vista.findViewById(R.id.rb93);
        rb94 = vista.findViewById(R.id.rb94);
        rb95 = vista.findViewById(R.id.rb95);
        rb96 = vista.findViewById(R.id.rb96);
        rb97 = vista.findViewById(R.id.rb97);
        rb98 = vista.findViewById(R.id.rb98);
        rb99 = vista.findViewById(R.id.rb99);
        rb100 = vista.findViewById(R.id.rb100);
        rb101 = vista.findViewById(R.id.rb101);
        rb102 = vista.findViewById(R.id.rb102);
        rb103 = vista.findViewById(R.id.rb103);
        rb104 = vista.findViewById(R.id.rb104);
        rb105 = vista.findViewById(R.id.rb105);
        rb106 = vista.findViewById(R.id.rb106);
        rb107 = vista.findViewById(R.id.rb107);
        rb108 = vista.findViewById(R.id.rb108);
        rb109 = vista.findViewById(R.id.rb109);
        rb110 = vista.findViewById(R.id.rb110);
        rb111 = vista.findViewById(R.id.rb111);
        rb112 = vista.findViewById(R.id.rb112);
        rb113 = vista.findViewById(R.id.rb113);
        rb114 = vista.findViewById(R.id.rb114);
        rb115 = vista.findViewById(R.id.rb115);
        rb116 = vista.findViewById(R.id.rb116);
        rb117 = vista.findViewById(R.id.rb117);
        rb118 = vista.findViewById(R.id.rb118);
        rb119 = vista.findViewById(R.id.rb119);
        rb120 = vista.findViewById(R.id.rb120);
        rb121 = vista.findViewById(R.id.rb121);
        rb122 = vista.findViewById(R.id.rb122);
        rb123 = vista.findViewById(R.id.rb123);
        rb124 = vista.findViewById(R.id.rb124);
        rb125 = vista.findViewById(R.id.rb125);


        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);
        respuestas = ((Respuestas)actividad);

        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(8);
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
                    boton.menu(22);
                }
            }
            }
        });

        return  vista;
    }

    public int validarRg(){
        int numero = 0;
        if (rg28.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 1",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg29.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 2",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg30.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 3",Toast.LENGTH_SHORT).show();
            numero++;
        }  if (rg31.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 4",Toast.LENGTH_SHORT).show();
            numero++;
        }if (rg32.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 5",Toast.LENGTH_SHORT).show();
            numero++;
        }if (rg33.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 6",Toast.LENGTH_SHORT).show();
            numero++;
        }if (rg34.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 7",Toast.LENGTH_SHORT).show();
            numero++;
        }if (rg35.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 8",Toast.LENGTH_SHORT).show();
            numero++;
        }if (rg36.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 9",Toast.LENGTH_SHORT).show();
            numero++;
        }if (rg37.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(getContext(),"No respondió la pregunta 10",Toast.LENGTH_SHORT).show();
            numero++;
        }

        return numero;
    }

    public boolean validarRb(){
        if(rb86.isChecked()){
            respuestas.respuesta(86);
        } if(rb87.isChecked()){
            respuestas.respuesta(87);
        } if(rb88.isChecked()){
            respuestas.respuesta(88);
        } if(rb89.isChecked()){
            respuestas.respuesta(89);
        } if(rb90.isChecked()){
            respuestas.respuesta(90);
        } if(rb91.isChecked()){
            respuestas.respuesta(91);
        } if(rb92.isChecked()){
            respuestas.respuesta(92);
        } if(rb93.isChecked()){
            respuestas.respuesta(93);
        } if(rb94.isChecked()){
            respuestas.respuesta(94);
        } if(rb95.isChecked()){
            respuestas.respuesta(95);
        } if(rb96.isChecked()){
            respuestas.respuesta(96);
        } if(rb97.isChecked()){
            respuestas.respuesta(97);
        }if(rb98.isChecked()){
            respuestas.respuesta(98);
        } if(rb99.isChecked()){
            respuestas.respuesta(99);
        } if(rb100.isChecked()){
            respuestas.respuesta(100);
        } if(rb101.isChecked()){
            respuestas.respuesta(101);
        } if(rb102.isChecked()){
            respuestas.respuesta(102);
        } if(rb103.isChecked()){
            respuestas.respuesta(103);
        } if(rb104.isChecked()){
            respuestas.respuesta(104);
        } if(rb105.isChecked()){
            respuestas.respuesta(105);
        } if(rb106.isChecked()){
            respuestas.respuesta(106);
        } if(rb107.isChecked()){
            respuestas.respuesta(107);
        } if(rb108.isChecked()){
            respuestas.respuesta(108);
        } if(rb109.isChecked()){
            respuestas.respuesta(109);
        }if(rb110.isChecked()){
            respuestas.respuesta(110);
        } if(rb111.isChecked()){
            respuestas.respuesta(111);
        } if(rb112.isChecked()){
            respuestas.respuesta(112);
        } if(rb113.isChecked()){
            respuestas.respuesta(113);
        } if(rb114.isChecked()){
            respuestas.respuesta(114);
        } if(rb115.isChecked()){
            respuestas.respuesta(115);
        } if(rb116.isChecked()){
            respuestas.respuesta(116);
        } if(rb117.isChecked()){
            respuestas.respuesta(117);
        } if(rb118.isChecked()){
            respuestas.respuesta(118);
        } if(rb119.isChecked()){
            respuestas.respuesta(119);
        } if(rb120.isChecked()){
            respuestas.respuesta(120);
        } if(rb121.isChecked()){
            respuestas.respuesta(121);
        }if(rb122.isChecked()){
            respuestas.respuesta(122);
        }if(rb123.isChecked()){
            respuestas.respuesta(123);
        }if(rb124.isChecked()){
            respuestas.respuesta(124);
        }if(rb125.isChecked()){
            respuestas.respuesta(125);
        }
        return true;

    }
}
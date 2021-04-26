package com.example.wowestadistica.fragments;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wowestadistica.R;
import com.example.wowestadistica.activities.MainActivity;
import com.example.wowestadistica.interfaces.BotonPresionado;
import com.example.wowestadistica.interfaces.Respuestas;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;


public class Unidades extends Fragment {

    private View vista;
   /* private TextView tvAnalicemos;
    private TextView tvInterpretemos;
    private TextView tvHallando;
    private TextView tvMejorando; */
    private ImageView ivAnalicemos;
    private ImageView ivInterpretemos;
    private ImageView ivHallando;
    private ImageView ivMejorando;
    private ImageView ivEvaluacion;
    private ImageView btnMenu;
    private TextInputEditText tiNombre;
    private ImageView ivGuardar;
    private ImageView ivResultados;
    private TextView tvCorrectas;
    private TextView tvIncrrectas;
    private LinearLayout llPuntaje;
    private Button btnEvaluacion;
    private TextView tvRespuesta1;
    private TextView tvRespuesta2;




    public Unidades() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
       
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_unidades, container, false);

        ivAnalicemos = vista.findViewById(R.id.ivAnalicemos);
        ivInterpretemos = vista.findViewById(R.id.ivInterpretemos);
        ivHallando = vista.findViewById(R.id.ivHallando);
        ivMejorando = vista. findViewById(R.id.ivMejorando);
        btnMenu = vista.findViewById(R.id.btnMenu);
        tiNombre = vista.findViewById(R.id.tiNombre);
        ivGuardar = vista.findViewById(R.id.ivGuardar);
        llPuntaje = vista.findViewById(R.id.llPuntaje);
        ivEvaluacion = vista.findViewById(R.id.ivEvaluacion);

        ivResultados = vista.findViewById(R.id.ivResultados);
        tvCorrectas = vista.findViewById(R.id.tvCorrectas);
        tvIncrrectas = vista.findViewById(R.id.tvIncorrectas);

        tvRespuesta1 = vista.findViewById(R.id.tvRespuesta1);
        tvRespuesta2 = vista.findViewById(R.id.tvRespuesta2);


        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);
        final Respuestas respuestas = ((Respuestas)actividad);


        if(respuestas.finalizar() < 4){
            llPuntaje.setVisibility(View.GONE);
        }



        if(respuestas.nombre() != null){
            tiNombre.setText(respuestas.nombre());
            ivGuardar.setVisibility(View.GONE);
            tiNombre.setEnabled(false);
        }

        ivResultados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvCorrectas.setText(respuestas.correctas());
                tvIncrrectas.setText(respuestas.incorrectas());
                tvRespuesta1.setText(respuestas.respuesta1());
                tvRespuesta2.setText(respuestas.respuesta2());
            }
        });

      ivGuardar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if(!tiNombre.getText().toString().isEmpty() ){
                  respuestas.nombre(tiNombre.getText().toString());
                  ivGuardar.setVisibility(View.GONE);
                  tiNombre.setEnabled(false);
              }else{
                  Toast.makeText(getContext(),"Ingresa tu nombre completo",Toast.LENGTH_SHORT).show();
              }
          }
      });


        ivAnalicemos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(respuestas.finalizar() == 4){
                    respuestas.reset();
                }

                if(!tiNombre.getText().toString().isEmpty() ) {
                    boton.menu(5);
                }else{
                    Toast.makeText(getContext(),"Ingresa tu nombre completo",Toast.LENGTH_SHORT).show();
                }
            }
        });

        ivInterpretemos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(respuestas.finalizar() == 4){
                    respuestas.reset();
                }

                if(!tiNombre.getText().toString().isEmpty() ) {
                    boton.menu(6);
                }else{
                    Toast.makeText(getContext(),"Ingresa tu nombre completo",Toast.LENGTH_SHORT).show();
                }
            }
        });

        ivHallando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(respuestas.finalizar() == 4){
                    respuestas.reset();
                }

                if(!tiNombre.getText().toString().isEmpty() ) {
                    boton.menu(7);
                }else{
                    Toast.makeText(getContext(),"Ingresa tu nombre completo",Toast.LENGTH_SHORT).show();
                }
            }
        });

        ivMejorando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(respuestas.finalizar() == 4){
                    respuestas.reset();
                }

                if(!tiNombre.getText().toString().isEmpty() ) {
                    boton.menu(8);
                }else{
                    Toast.makeText(getContext(),"Ingresa tu nombre completo",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(1);
            }
        });


        ivEvaluacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScKwKlj_bDBwaHk6IYiGskbEetYAPgyTTPWZQwSBo1Sfzkb2w/viewform");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });




        return vista;
    }
}
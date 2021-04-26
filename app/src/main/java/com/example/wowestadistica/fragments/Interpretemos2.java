package com.example.wowestadistica.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.wowestadistica.R;
import com.example.wowestadistica.activities.MainActivity;
import com.example.wowestadistica.interfaces.BotonPresionado;


public class Interpretemos2 extends Fragment {

    private View vista;
    private ImageView ivArrowRight;
    private ImageView ivArrowLeft;
    private ImageView btnMenu;
    private ImageView iv15;
    private ImageView iv16;
    private ImageView iv17;
    private ImageView iv18;
    private ImageView iv19;
    private ImageView iv20;

    private String titulo;
    private String mensaje;

    @Nullable
    @Override
    public Context getContext() {
        return super.getContext();
    }

    public Interpretemos2() {
        // Required empty public constructor
    }

    public void dialogo(){
        new AlertDialog.Builder(getContext())
                .setTitle(titulo)
                .setMessage(mensaje)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                })
                .create().show();
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_interpretemos2, container, false);

        ivArrowRight = vista.findViewById(R.id.ivArrowRight);
        ivArrowLeft = vista.findViewById(R.id.ivArrowLeft);
        btnMenu = vista.findViewById(R.id.btnMenus);
        iv15 = vista.findViewById(R.id.iv15);
        iv16 = vista.findViewById(R.id.iv16);
        iv17 = vista.findViewById(R.id.iv17);
        iv18 = vista.findViewById(R.id.iv18);
        iv19 = vista.findViewById(R.id.iv19);
        iv20 = vista.findViewById(R.id.iv20);

        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);

        ivArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(6);
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

                boton.menu(15);
            }
        });

        iv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo = "Gráficos estadisticos";
                mensaje = "Un gráfico estadístico es una representación visual de una serie de datos estadísticos. Es una\n" +
                        "herramienta muy eficaz, ya que un buen gráfico:\n" +
                        "• capta la atención del lector;\n" +
                        "• presenta la información de forma sencilla, clara y precisa;\n" +
                        "• no induce a error;\n" +
                        "• facilita la comparación de datos y destaca las tendencias y las diferencias;\n" +
                        "• ilustra el mensaje, tema o trama del texto al que acompaña.";
                dialogo();
            }
        });

        iv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(19);
            }
        });

        iv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(30);
            }
        });

        iv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(31);
            }
        });

        iv19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(32);
            }
        });

        iv20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(28);
            }
        });



        return  vista;
    }
}
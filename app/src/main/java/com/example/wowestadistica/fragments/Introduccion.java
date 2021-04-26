package com.example.wowestadistica.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;


import com.example.wowestadistica.R;
import com.example.wowestadistica.interfaces.BotonPresionado;


public class Introduccion extends Fragment {

    private View vista;
    private VideoView videoView;
    private ImageView ivReproducir;
    private ImageView ivPausar;
    private ImageView ivDetener;
    private ImageView btnMenu;

    public Introduccion() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_introduccion, container, false);


        videoView = vista.findViewById(R.id.videoView);
        ivReproducir = vista.findViewById(R.id.ivReproducir);
        ivPausar = vista.findViewById(R.id.ivPausar);
        ivDetener = vista.findViewById(R. id.ivDetener);
        btnMenu = vista.findViewById(R.id.btnMenu);


        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.video;
        videoView.setVideoURI(Uri.parse(path));



        Activity actividad = getActivity();
        final BotonPresionado boton = ((BotonPresionado)actividad);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton.menu(1);
            }
        });

        ivReproducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoView.start();
            }
        });



        ivPausar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.pause();
            }
        });

        ivDetener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.pause();
                videoView.seekTo(0);
            }
        });


        return vista;
    }



}
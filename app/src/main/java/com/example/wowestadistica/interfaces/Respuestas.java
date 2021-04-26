package com.example.wowestadistica.interfaces;

import java.util.ArrayList;

public interface Respuestas {

    public void respuesta(int numero) ;

    public String correctas();

    public String incorrectas();

    public void nombre(String nombre);

    public String nombre();

    public void finalizar(int numero);

    public int finalizar();

    public void respuesta1(String r1);

    public String respuesta1();

    public void respuesta2(String r2);

    public String respuesta2();

    public void reset();

}

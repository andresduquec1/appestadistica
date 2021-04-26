package com.example.wowestadistica.activities;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.wowestadistica.R;
import com.example.wowestadistica.fragments.Analicemos1;
import com.example.wowestadistica.fragments.Analicemos2;
import com.example.wowestadistica.fragments.Analicemos3;
import com.example.wowestadistica.fragments.Analicemos4;
import com.example.wowestadistica.fragments.Analicemos5;
import com.example.wowestadistica.fragments.BlankFragment;
import com.example.wowestadistica.fragments.DiagramaCircular;
import com.example.wowestadistica.fragments.DiagramaHorizontal;
import com.example.wowestadistica.fragments.DiagramaVertical;
import com.example.wowestadistica.fragments.FinAnalicemos;
import com.example.wowestadistica.fragments.FinHallandoM;
import com.example.wowestadistica.fragments.FinInterpretemos;
import com.example.wowestadistica.fragments.FinMejorando;
import com.example.wowestadistica.fragments.HallandoM1;
import com.example.wowestadistica.fragments.HallandoM2;
import com.example.wowestadistica.fragments.HallandoM3;
import com.example.wowestadistica.fragments.HallandoM4;
import com.example.wowestadistica.fragments.Interpretemos1;
import com.example.wowestadistica.fragments.Interpretemos2;
import com.example.wowestadistica.fragments.Interpretemos3;
import com.example.wowestadistica.fragments.Interpretemos4;
import com.example.wowestadistica.fragments.Interpretemos5;
import com.example.wowestadistica.fragments.Introduccion;
import com.example.wowestadistica.fragments.Mejorando1;
import com.example.wowestadistica.fragments.Mejorando2;
import com.example.wowestadistica.fragments.Mejorando3;
import com.example.wowestadistica.fragments.Mejorando4;
import com.example.wowestadistica.fragments.Objetivos;
import com.example.wowestadistica.fragments.Pictograma;
import com.example.wowestadistica.fragments.TablaFrecuencia;
import com.example.wowestadistica.fragments.Unidades;
import com.example.wowestadistica.interfaces.BotonPresionado;
import com.example.wowestadistica.interfaces.Respuestas;


public class MainActivity extends AppCompatActivity implements  BotonPresionado, Respuestas {


    private LinearLayout LlContenedor;
    private String nombre;
    private int numeroCorrectas = 0;
    private int correctas;
    private int incorrectas;
    private int finalizar = 0;
    private String respuestauno;
    private String respuestados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LlContenedor = (LinearLayout) findViewById(R.id.LlContenedor);

        BlankFragment blankFragment = new BlankFragment();

        //getSupportFragmentManager().beginTransaction().add(R.id.LyContenedor, principal, valueOf(1)).commit();
         getSupportFragmentManager().beginTransaction().add(R.id.LlContenedor,blankFragment).commit();
    }



    @Override
    public void onBackPressed() {

    }

    @Override
    public void menu(int opc) {

        switch (opc) {
            case 1:
                BlankFragment blankFragment = new BlankFragment();
                mostrarFragment(blankFragment);
                break;
            case 2:
                Introduccion introduccion = new Introduccion();
                mostrarFragment(introduccion);
                break;
            case 3:
                Objetivos objetivos = new Objetivos();
                mostrarFragment(objetivos);
                break;
            case 4:
                Unidades unidades = new Unidades();
                mostrarFragment(unidades);
                break;
            case 5:
                Analicemos1 analicemos1 = new Analicemos1();
                mostrarFragment(analicemos1);
                break;
            case 6:
                Interpretemos1 interpretemos1 = new Interpretemos1();
                mostrarFragment(interpretemos1);
                break;
            case 7:
                HallandoM1  hallandoM1 = new HallandoM1();
                mostrarFragment(hallandoM1);
                break;
            case 8:
                Mejorando1 mejorando1 = new Mejorando1();
                mostrarFragment(mejorando1);
                break;
            case 9:
                Analicemos2 analicemos2 = new Analicemos2();
                mostrarFragment(analicemos2);
                break;
            case 10:
                Analicemos3 analicemos3 = new Analicemos3();
                mostrarFragment(analicemos3);
                break;
            case 11:
                Analicemos4 analicemos4 = new Analicemos4();
                mostrarFragment(analicemos4);
                break;
            case 12:
                Analicemos5 analicemos5 = new Analicemos5();
                mostrarFragment(analicemos5);
                break;
            case 13:
                FinAnalicemos finAnalicemos = new FinAnalicemos();
                mostrarFragment(finAnalicemos);
                break;
            case 14:
                Interpretemos2 interpretemos2 = new Interpretemos2();
                mostrarFragment(interpretemos2);
                break;
            case 15:
                Interpretemos3 interpretemos3 = new Interpretemos3();
                mostrarFragment(interpretemos3);
                break;
            case 16:
                Interpretemos4 interpretemos4 = new Interpretemos4();
                mostrarFragment(interpretemos4);
                break;
            case 17:
                Interpretemos5 interpretemos5 = new Interpretemos5();
                mostrarFragment(interpretemos5);
                break;
            case 18:
                HallandoM2 hallandoM2 = new HallandoM2();
                mostrarFragment(hallandoM2);
                break;
            case 29:
                HallandoM3 hallandoM3 = new HallandoM3();
                mostrarFragment(hallandoM3);
                break;
            case 20:
                HallandoM4 hallandoM4 = new HallandoM4();
                mostrarFragment(hallandoM4);
                break;
            case 21:
                Mejorando2 mejorando2 = new Mejorando2();
                mostrarFragment(mejorando2);
                break;
            case 22:
                Mejorando3 mejorando3 = new Mejorando3();
                mostrarFragment(mejorando3);
                break;
            case 23:
                Mejorando4 mejorando4 = new Mejorando4();
                mostrarFragment(mejorando4);
                break;
            /*case 24:
                Mejorando5 mejorando5 = new Mejorando5();
                mostrarFragment(mejorando5);
                break;*/
            case 25:
                FinInterpretemos finInterpretemos = new FinInterpretemos();
                mostrarFragment(finInterpretemos);
                break;
            case 26:
                FinHallandoM finHallandoM = new FinHallandoM();
                mostrarFragment(finHallandoM);
                break;
            case 27:
                FinMejorando finMejorando = new FinMejorando();
                mostrarFragment(finMejorando);
                break;
                case 28:
                    Pictograma pictograma = new Pictograma();
                mostrarFragment(pictograma);
                break;
                case 19:
                    TablaFrecuencia tablaFrecuencia = new TablaFrecuencia();
                mostrarFragment(tablaFrecuencia);
                break;
                case 30:
                DiagramaHorizontal diagramaHorizontal = new DiagramaHorizontal();
                    mostrarFragment(diagramaHorizontal);

                break;
                case 31:
                    DiagramaVertical diagramaVertical = new DiagramaVertical();
                mostrarFragment(diagramaVertical);
                break;
                case 32:
                    DiagramaCircular diagramaCircular = new DiagramaCircular();
                mostrarFragment(diagramaCircular);
                break;

        }

    }

    @Override
    public void mostrarFragment(Fragment fragment) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.LlContenedor, fragment).addToBackStack(null).commit();

        }


    @Override
    public void respuesta(int numero) {
      //  Toast.makeText(getApplication(),"respondió "+numero,Toast.LENGTH_SHORT).show();
        if(numero == 1 || numero == 4 || numero == 9 || numero == 11 || numero == 14 || numero == 16 || numero == 17 || numero == 20 || numero == 21 || numero == 23 || numero == 26
        || numero == 29 || numero == 33 || numero == 34 || numero == 40 || numero == 43 || numero == 47 || numero == 48 || numero == 53 || numero == 58 || numero == 61 || numero == 63
                || numero == 66 || numero == 68 || numero == 69 || numero == 73 || numero == 77 || numero == 81 || numero == 86 || numero == 91 || numero == 97 || numero == 98
                || numero == 104 || numero == 106 || numero == 112 || numero == 115 || numero == 119 || numero == 125 || numero == 131 || numero == 136
                || numero == 141 || numero == 146 || numero == 150 || numero == 156 || numero == 164 || numero == 168 || numero == 173 || numero == 179 || numero == 187 || numero == 188 || numero == 195){
            correctas++;
        }else{
            incorrectas++;
        }

    }

    @Override
    public String correctas() {
       // Toast.makeText(getApplication(),"correctas "+correctas.size(),Toast.LENGTH_SHORT).show();
        return String.valueOf(correctas);
    }

    @Override
    public String incorrectas() {
        return String.valueOf(incorrectas);
    }


    @Override
    public void nombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public void finalizar(int numeros) {
        finalizar+=numeros;
    }

    @Override
    public int finalizar() {
        return finalizar;
    }

    @Override
    public void respuesta1(String r1) {
        respuestauno = r1;
    }

    @Override
    public String respuesta1() {
        return "Descriptiva 2. "+respuestauno;
    }

    @Override
    public void respuesta2(String r2) {
      respuestados = r2;
    }

    @Override
    public String respuesta2() {
        return "Descriptiva 3. "+respuestados;
    }

    @Override
    public void reset() {
        finalizar = 0;
        incorrectas = 0;
        correctas = 0;
    }


}







package com.devevp.recyclerview1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;
    int max=500;
    int min=100;
        Random rand = new Random();
        int n = rand.nextInt((max-min)+1)+min;
        int rango = n;

        String artist[] = new String[rango];
        String canc[] = new String[rango];
        int caract[] = new int[rango];;

    private int [] caratulas = {R.drawable.car1,R.drawable.car2,R.drawable.car3,R.drawable.car4,R.drawable.car5,R.drawable.car6,R.drawable.car7,R.drawable.car8,R.drawable.car1,R.drawable.car2};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanciamos recy cler
        recyclerview=(RecyclerView)findViewById(R.id.RecyclerV);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(new Datos( this,artist,canc,caract));
        rellenarartist();
        rellenarcancion();
        rellenacaratula ();
    }

    private void rellenacaratula() {
        for (int i=0; i<caract.length; i++) {
            Random ra = new Random();
            int num = ra.nextInt(10);
            caract[i]=caratulas[num];

        }
    }

    private void rellenarartist() {
        for (int i=0; i<artist.length; i++) {
            Random rando = new Random();
            int num = rando.nextInt(10);
            String Artista="";
            switch (num) {
                case 0:
                    Artista= "Artista 1";
                    break;
                case 1:
                    Artista= "Artista 2";
                    break;
                case 2:
                    Artista= "Artista 3";
                    break;
                case 3:
                    Artista= "Artista 4";
                    break;
                case 4:
                    Artista= "Artista 5";
                    break;
                case 5:
                    Artista= "Artista 6";
                    break;
                case 6:
                    Artista= "Artista 7";
                    break;
                case 7:
                    Artista="Artista 8";
                    break;
                case 8:
                    Artista= "Artista 9";
                    break;
                case 9:
                    Artista="Artista 10";
                    break;
            }
            artist[i]=Artista;
        }
    }

    private void rellenarcancion() {
            for (int i = 0; i< canc.length; i++) {
                Random rando = new Random();
                int num = rando.nextInt(10);
                String Cancion = "";
                switch (num) {
                    case 0:
                        Cancion = "Cancion 1";
                        break;
                    case 1:
                        Cancion = "Cancion 2";
                        break;
                    case 2:
                        Cancion = "Cancion 3";
                        break;
                    case 3:
                        Cancion = "Cancion 4";
                        break;
                    case 4:
                        Cancion = "Cancion 5";
                        break;
                    case 5:
                        Cancion = "Cancion 6";
                        break;
                    case 6:
                        Cancion = "Cancion 7";
                        break;
                    case 7:
                        Cancion = "Cancion 8";
                        break;
                    case 8:
                        Cancion = "Cancion 9";
                        break;
                    case 9:
                        Cancion = "Cancion 10";
                        break;
                }
                canc[i] = Cancion;
            }
        }
    }


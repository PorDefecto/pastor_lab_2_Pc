package com.example.pastor_lab2_pc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText primero;
    private EditText segundo;
    private TextView res;
    private TextView vocalesprimero;
    private TextView vocalessegundo;
    private int contador;
    private int contadordos;
    private int contadortres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_saludar = (Button) findViewById(R.id.btn_saludar);
        btn_saludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contador = 0;
                contadordos = 0;
                contadortres=0;
                primero = (EditText) findViewById(R.id.txt_primero);
                //////////////
                String primervalor = primero.getText().toString();

                String []  bar = primervalor.split(" ");

                res = (TextView) findViewById(R.id.txt_igualdad);
                vocalesprimero = (TextView) findViewById(R.id.txt_cerradasprimero);
                vocalessegundo = (TextView) findViewById(R.id.txt_cerradassegundoi);

                if (bar[0].equals(bar[1])) {
                    res.setText("Las palabras son iguales");
                } else {
                    res.setText("Las palabras  NO son iguales");
                }

                for (int x = 0; x < bar[0].length(); x++) {
                    if ((bar[0].charAt(x) == 'i') || (bar[0].charAt(x) == 'u')||(bar[0].charAt(x) == 'I') || (bar[0].charAt(x) == 'U')) {
                        contador++;
                    }
                }
                for (int x = 0; x < bar[1].length(); x++) {
                    if ((bar[1].charAt(x) == 'i') || (bar[1].charAt(x) == 'u')||(bar[1].charAt(x) == 'I') || (bar[1].charAt(x) == 'U')) {
                        contadordos++;
                    }
                }


                vocalesprimero.setText("Vocales cerradas de la palabra palabra : " + contador);
                vocalessegundo.setText("Vocales cerradas de la segunda palabra : " + contadordos);
            }
        });
    }
    }


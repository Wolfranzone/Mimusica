package com.example.mimusica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
 Button Rock_btn;
 Button salsa_btn;
 private Spinner spinner;
 private Spinner spinner2;
 private Spinner spinner3;
 private Spinner spinner4;
 private Spinner spinner5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //rock

        spinner=(Spinner)findViewById(R.id.spinner);
        String[] opciones={"Radiorama-Vampires","Rod Stewart-Some guy","Elvon Bishop-Folled Around","Hot Stuff-Doona Summer ","4 non blondes-Whats Up"};
        ArrayAdapter <String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones);
        spinner.setAdapter(adapter);
        //2
        spinner2=(Spinner)findViewById(R.id.spinner2);
        String[] opciones1={"Adolescentes-Anhelo","Grupo niche-Eres","Lluvia-Eddy Santiago","Gilverto Santa Rosa-Conteo Regresivo ","Devorame otra vez"};
        ArrayAdapter <String> adapter1=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones1);
        spinner2.setAdapter(adapter1);
        //3
        spinner3=(Spinner)findViewById(R.id.spinner3);
        String[] opciones2={"Guiltines-Bob Marley","Pimper Paradise-Bob Marley","the little birds-Bob Marley","Trench Tonwn-Bob Marley ","Waiting in vain-Bob Marley"};
        ArrayAdapter <String> adapter2=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones2);
        spinner3.setAdapter(adapter2);
        //4
        spinner4=(Spinner)findViewById(R.id.spinner4);
        String[] opciones3={"Be Mine-Breakbot","Colors-Black Pumas","Do it Again-Steely Dan","Some Feeling-Mild Orange ","Sexiback-Justin Timverlake"};
        ArrayAdapter <String> adapter3=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones3);
        spinner4.setAdapter(adapter3);
        //5
        spinner5=(Spinner)findViewById(R.id.spinner5);
        String[] opciones4={"Internet-Winfree","No negativity-Winfree","Work it Out-Winfree","Shake it-Winfree ","Git on-Winfree"};
        ArrayAdapter <String> adapter4=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones4);
        spinner5.setAdapter(adapter4);


        Rock_btn = (Button) findViewById(R.id.Rock_btn);

        Rock_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }
}
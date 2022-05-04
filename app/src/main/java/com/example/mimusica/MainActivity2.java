package com.example.mimusica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ImageView;

import java.net.URI;

public class MainActivity2 extends AppCompatActivity {
    Button play_pau, btn_siguiente,btn_link;
    MediaPlayer mp;
    int posicion = 0;
    ImageView iv;
    MediaPlayer vectormp[] = new MediaPlayer[26];
    String url="https://los40.com/los40/2019/11/21/los40classic/1574342103_816194.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        play_pau = (Button) findViewById(R.id.play_pau);
        btn_siguiente = (Button) findViewById(R.id.btn_siguiente);
        iv = (ImageView) findViewById(R.id.ImageView);
        btn_link=findViewById(R.id.btn_link);
        btn_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link= Uri.parse(url);
                Intent a=new Intent(Intent.ACTION_VIEW,_link);
                startActivity(a);

                //Log.d("click","Ok");
            }
        });

        vectormp[0] = MediaPlayer.create(this, R.raw.adiorama);
        vectormp[1] = MediaPlayer.create(this, R.raw.row);
        vectormp[2] = MediaPlayer.create(this, R.raw.e);
        vectormp[3] = MediaPlayer.create(this, R.raw.ummer);
        vectormp[4] = MediaPlayer.create(this, R.raw.p);
        vectormp[5] = MediaPlayer.create(this, R.raw.a);
        vectormp[6] = MediaPlayer.create(this, R.raw.l);
        vectormp[7] = MediaPlayer.create(this, R.raw.ivo);
        vectormp[8] = MediaPlayer.create(this, R.raw.gotasdeluvia);
        vectormp[9] = MediaPlayer.create(this, R.raw.guiltiness);
        vectormp[10] = MediaPlayer.create(this, R.raw.pimperparadise);
        vectormp[11] = MediaPlayer.create(this, R.raw.threeittlebirds);
        vectormp[12] = MediaPlayer.create(this, R.raw.trenchtown);
        vectormp[13] = MediaPlayer.create(this, R.raw.waitinginvain);
        vectormp[14] = MediaPlayer.create(this, R.raw.beminetonight);
        vectormp[15] = MediaPlayer.create(this, R.raw.blackpumas);
        vectormp[16] = MediaPlayer.create(this, R.raw.oitagain);
        vectormp[17] = MediaPlayer.create(this, R.raw.omefeeling);
        vectormp[18] = MediaPlayer.create(this, R.raw.thelessknowtheexyback);
        vectormp[19] = MediaPlayer.create(this, R.raw.winfreeinternet);
        vectormp[20] = MediaPlayer.create(this, R.raw.winfreenonegativity);
        vectormp[21] = MediaPlayer.create(this, R.raw.winfreeworkitout);
        vectormp[22] = MediaPlayer.create(this, R.raw.wnfreehakeittonite);
        vectormp[23] = MediaPlayer.create(this, R.raw.icehouse);
        vectormp[24] = MediaPlayer.create(this, R.raw.anhelo);
        vectormp[25] = MediaPlayer.create(this, R.raw.cartassinmarcar);
    }

    public void Play_pau(View view) {
        if (vectormp[posicion].isPlaying()) {
            vectormp[posicion].pause();
            play_pau.setBackgroundResource(R.drawable.play);
            Toast.makeText(MainActivity2.this, "Pausa", Toast.LENGTH_SHORT).show();
        } else {

            vectormp[posicion].start();
            play_pau.setBackgroundResource(R.drawable.play);
            Toast.makeText(MainActivity2.this, "Play", Toast.LENGTH_SHORT).show();
        }
    }

    public void siguiente(View view) {

        if (posicion < vectormp.length - 1) {

            if (vectormp[posicion].isPlaying()) {
                vectormp[posicion].stop();
                posicion++;
                vectormp[posicion].start();

                if (posicion == 0) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 1) iv.setImageResource(R.drawable.banksy);
                else if (posicion == 2) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 3) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 4) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 5) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 6) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 7) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 8) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 9) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 10) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 11) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 12) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 13) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 14) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 15) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 16) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 17) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 18) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 19) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 20) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 21) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 22) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 23) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 24) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 25) {
                    iv.setImageResource(R.drawable.banksy);
                }
            } else {
                posicion++;
                if (posicion == 0) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 1) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 2) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 3) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 4) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 5) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 6) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 7) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 8) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 9) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 10) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 11) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 12) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 13) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 14) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 15) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 16) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 17) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 18) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 19) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 20) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 21) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 22) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 23) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 24) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 25) {
                    iv.setImageResource(R.drawable.banksy);
                }
            }

        } else{
            Toast.makeText(MainActivity2.this, "No hay mas canciones para mostrar", Toast.LENGTH_SHORT).show();
        }
    }



    public void anterior(View view){
        if (posicion >=  1){
            if (vectormp[posicion].isPlaying()) {
                vectormp[posicion].stop();
                vectormp[0] = MediaPlayer.create(this, R.raw.adiorama);
                vectormp[1] = MediaPlayer.create(this, R.raw.row);
                vectormp[2] = MediaPlayer.create(this, R.raw.e);
                vectormp[3] = MediaPlayer.create(this, R.raw.ummer);
                vectormp[4] = MediaPlayer.create(this, R.raw.p);
                vectormp[5] = MediaPlayer.create(this, R.raw.a);
                vectormp[6] = MediaPlayer.create(this, R.raw.l);
                vectormp[7] = MediaPlayer.create(this, R.raw.ivo);
                vectormp[8] = MediaPlayer.create(this, R.raw.gotasdeluvia);
                vectormp[9] = MediaPlayer.create(this, R.raw.guiltiness);
                vectormp[10] = MediaPlayer.create(this, R.raw.pimperparadise);
                vectormp[11] = MediaPlayer.create(this, R.raw.threeittlebirds);
                vectormp[12] = MediaPlayer.create(this, R.raw.trenchtown);
                vectormp[13] = MediaPlayer.create(this, R.raw.waitinginvain);
                vectormp[14] = MediaPlayer.create(this, R.raw.beminetonight);
                vectormp[15] = MediaPlayer.create(this, R.raw.blackpumas);
                vectormp[16] = MediaPlayer.create(this, R.raw.oitagain);
                vectormp[17] = MediaPlayer.create(this, R.raw.omefeeling);
                vectormp[18] = MediaPlayer.create(this, R.raw.thelessknowtheexyback);
                vectormp[19] = MediaPlayer.create(this, R.raw.winfreeinternet);
                vectormp[20] = MediaPlayer.create(this, R.raw.winfreenonegativity);
                vectormp[21] = MediaPlayer.create(this, R.raw.winfreeworkitout);
                vectormp[22] = MediaPlayer.create(this, R.raw.wnfreehakeittonite);
                vectormp[23] = MediaPlayer.create(this, R.raw.icehouse);
                vectormp[24] = MediaPlayer.create(this, R.raw.anhelo);
                vectormp[25] = MediaPlayer.create(this, R.raw.cartassinmarcar);
                posicion--;

                if (posicion == 0) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 1) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 2) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 3) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 4) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 5) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 6) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 7) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 8) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 9) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 10) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 11) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 12) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 13) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 14) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 15) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 16) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 17) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 18) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 19) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 20) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 21) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 22) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 23) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 24) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 25) {
                    iv.setImageResource(R.drawable.banksy);
                }

                vectormp[posicion].start();

            }else {posicion--;
                if (posicion == 0) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 1) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 2) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 3) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 4) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 5) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 6) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 7) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 8) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 9) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 10) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 11) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 12) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 13) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 14) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 15) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 16) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 17) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 18) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 19) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 20) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 21) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 22) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 23) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 24) {
                    iv.setImageResource(R.drawable.banksy);
                } else if (posicion == 25) {
                    iv.setImageResource(R.drawable.banksy);
                }

            }
        }
        else {Toast.makeText(MainActivity2.this, "No hay mas canciones para mostrar", Toast.LENGTH_SHORT).show();
        }
    }}
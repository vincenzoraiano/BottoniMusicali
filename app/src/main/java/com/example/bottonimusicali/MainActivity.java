package com.example.bottonimusicali;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public  void  playButton(View view){

        //creo una variabile di tipo bottone
        Button buttonpressed=(Button) view;

        //uso un log per capire quale bottone è stato premuto
        Log.i("Bottone Premuto",buttonpressed.getTag().toString());

        //avvaire il mediaPlayer utilizzando il metodo onCreate.
        //prendiamo le risorse dal loro indentificatore
        //all'interno dell'identificatore prendiamo la tag della risorsa nella cartella raw
        //utolizzando il packageName.
        MediaPlayer mediaPlayer= MediaPlayer.create(this,getResources().getIdentifier(buttonpressed.getTag().toString(),"raw",getPackageName()));

        //alla nostra reference gli associamo il metodo start.
        mediaPlayer.start();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

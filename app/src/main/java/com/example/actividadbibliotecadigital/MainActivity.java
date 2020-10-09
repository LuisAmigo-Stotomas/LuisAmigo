package com.example.actividadbibliotecadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private Button boton;
    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progress = (ProgressBar)findViewById(R.id.idProgressBar);
        boton = (Button)findViewById(R.id.btnIniciar);

        progress.setVisibility(View.INVISIBLE);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task().execute();
            }
        });

    }

    class Task extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {
            progress.setVisibility(View.VISIBLE);
        }


        @Override
        protected String doInBackground(String... strings) {

            Hilo();

            return null;
        }


        @Override
        protected void onPostExecute(String s) {

            Intent i = new Intent(getBaseContext(),Menu_activity.class);
            startActivity(i);

            progress.setVisibility(View.INVISIBLE);
        }
    }

    public void cargaGitHub(View v)
    {
        Intent i = new Intent(this,github_activity.class);
        startActivity(i);


    }


    //Tarea Pesada
    public void Hilo()
    {
        for(int i = 1; i<10;i++)
        {
            try{

                Thread.sleep(2000);

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
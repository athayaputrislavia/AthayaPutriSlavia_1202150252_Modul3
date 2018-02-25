package com.example.athaya.athayaputrislavia_1202150252_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));

                //untuk pindah tampilan
                Intent a = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(a);
                }
            },     3000L //untuk mengatur lamanya splash
        ); //3000 L = 3 detik
    }

}

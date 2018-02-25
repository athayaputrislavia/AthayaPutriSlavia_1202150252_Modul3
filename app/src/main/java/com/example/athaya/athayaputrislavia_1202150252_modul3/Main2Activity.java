package com.example.athaya.athayaputrislavia_1202150252_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //untuk mengambil id
        username = (EditText)findViewById(R.id.user);
        password = (EditText)findViewById(R.id.pass);
        btnLogin = findViewById(R.id.button);
    }

    public void Login(View view) {
        String usernameKey = username.getText().toString();
        String passwordKey = password.getText().toString();

        //mengatur username & password serta toast login
        if ((usernameKey.equals("EAD") && passwordKey.equals("MOBILE"))){
            //jika Login berhasil
            Toast.makeText(getApplicationContext(), "Login Sukes...!", Toast.LENGTH_SHORT ).show();
            Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
            intent.putExtra("userKey", usernameKey);
            Main2Activity.this.startActivity(intent);
        }else {
            //jika Login gagal
            AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
            builder.setMessage("Username atau Password Anda Salah...!")
                    .setNegativeButton("Retry...", null).create().show();
        }
    }
}

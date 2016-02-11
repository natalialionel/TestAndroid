package com.example.lionel.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TelaLogin extends AppCompatActivity {

    private EditText usuario;
    private  EditText senha;

    private String user;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        usuario = (EditText) findViewById(R.id.editTextLogin);
        senha = (EditText) findViewById(R.id.editTextSenha);



    }

    public  void Login(View view){
        user = usuario.getText().toString();
        password = senha.getText().toString();

        Log.d("Login", user + password);
        Toast.makeText(this, user + password, Toast.LENGTH_SHORT ).show();


            if(user.equals("Nat") && password.equals("123")){
                Intent intent = new Intent(TelaLogin.this, MainActivity.class);
                startActivity(intent);
            }else {
                Toast.makeText(this, "Usuário/Senha incorretos", Toast.LENGTH_SHORT ).show();
            }


    }


}

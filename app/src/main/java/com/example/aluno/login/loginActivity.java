package com.example.aluno.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
     EditText usuario ,senha;
             Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        usuario = (EditText) findViewById(R.id.edUsuario);
        senha = (EditText) findViewById(R.id.edsenha);
        login = (Button) findViewById(R.id.btLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String nome_usuario = usuario.getText().toString();
                String senha_usuario = senha.getText().toString();
                // verifica nome e senha digitada//
                if ("larissa".equals(nome_usuario)&& "123".equals(senha_usuario)){
                    Toast.makeText(loginActivity.this, "Login realizado com sucesso",Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(loginActivity.this, "Login ou senha esta incorreto" ,Toast.LENGTH_SHORT).show();
//larissa//
                }
            }
        });
    }
}

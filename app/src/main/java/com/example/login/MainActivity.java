package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btLogar;
    private Button btCadastrar;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btLogar = findViewById(R.id.btLogar);
        btCadastrar =findViewById(R.id.btCadastrar);


        btLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telelogar();
                @Override

            }
        });


        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                telaCadastrar();
            }
        });

    }

    private void telaCadastrar() {
        startActivity(new Intent(this, cadastroActivity.class));
    }

    private void telelogar() {
        Context packageContext;
        startActivity(new Intent( packageContext this,loginActivity3.class));




    }
}
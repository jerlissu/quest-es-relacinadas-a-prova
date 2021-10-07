package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.login.modelo.Usuario;
import com.google.firebase.auth.FirebaseAuth;

public class loginActivity3 extends AppCompatActivity {


    private EditText etEmail;
    private EditText etSenha;
    private EditText etPhone;
    private EditText etProfissao;
    private EditText etEnddress;
    private Button btCadastrar;
    private FirebaseAuth mAuth;
    private Usuario u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);
        mAuth = FirebaseAuth.getInstance();
        etEmail = findViewById(R.id.etEmail);
        etSenha = findViewById(R.id.etSenha);
        etPhone = findViewById(R.id.etPhone);
        etProfissao = findViewById(R.id.etProfissao);
        etEnddress = findViewById(R.id.etEnddress);
        btCadastrar = findViewById(R.id.btCadastrar);
        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                receberDados();
            }

            private void receberDados() {
                u=new Usuario();
                u.setEmail(etEmail.getText().toString());
                u.setSenha(etSenha.getText().toString());

            }
        });
    }
}
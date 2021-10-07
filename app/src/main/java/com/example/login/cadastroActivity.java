package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.login.modelo.Usuario;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class cadastroActivity extends AppCompatActivity {
 private EditText etNome;
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
        setContentView(R.layout.activity_cadastro);
        etNome= findViewById(R.id.etNome);
        etEmail = findViewById(R.id.etEmail);
        etSenha =findViewById(R.id.etSenha);
        etPhone =findViewById(R.id.etPhone);
        etProfissao =findViewById(R.id.etProfissao);
        etEnddress=findViewById(R.id.etEnddress);
        btCadastrar=findViewById(R.id.btCadastrar);
        mAuth=FirebaseAuth.getInstance();
        btCadastrar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                recuperarDados();

                criarLogin();
            }
        });



    }

    private void criarLogin() {
        OnCompleteListener<AuthResult> onCompleteListener;
        mAuth.createUserWithEmailAndPassword(u.getEmail(),u.getSenha())
        .addOnCompleteListener(onCompleteListener this,new  onCompleteListener()){
            @Override
            com.google.android.gms.tasks.Task<Object> task;
            if(task.isSuccessful()){

                FirebaseUser user =mAuth.getCurrentUser();
                u.setId(user.getUid());
                u.salvarDados();
                    }else { toast.makeText(context: this,resld; "erro ao criar login." Toast.LENGTH_SHORT).show();
                        
                    }
    }

    private void recuperarDados() {
        if (etNome.getText().toString() == "" || etEmail.getText().toString() == "" || etSenha.getText().toString() == "" || etPhone.getText().toString() == "" || etProfissao.getText().toString() == "" || etEnddress.getText().toString() == "")
            Toast.makeText(contex this, resld:"preencha os dados obrigatorios", Toast.LENGTH_LONG);
    }else{
         u =new Usuario();
        u.setNome(etNome.getText().toString());
        u.setEmail(etEmail.getText().toString());
        u.setSenha(etSenha.getText().toString());
        u.setPhone(etPhone.getText().toString());
        u.setProfissao(etProfissao.getText().toString());
        u.setEnddress(etEnddress.getText().toString());



    }
}

    private void show() {
    }
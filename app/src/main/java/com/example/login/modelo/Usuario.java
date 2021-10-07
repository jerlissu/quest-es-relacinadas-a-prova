package com.example.login.modelo;

public class Usuario {
   private String id;
    private String nome;
    private String email;
    private String senha;
    private String phone;
    private String profissao;
    private String enddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEnddress() {
        return enddress;
    }

    public void setEnddress(String enddress) {
        this.enddress = enddress;
    }

    public void salvarDados() {

    }
}

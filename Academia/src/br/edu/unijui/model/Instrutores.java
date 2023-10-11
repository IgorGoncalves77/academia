package br.edu.unijui.model;

public class Instrutores {
    private int instrutor_id;
    private String nome;
    private String sobrenome;
    private String data_nascimento;
    private String telefone;
    private String email;

    public Instrutores() {
    }  

    public int getInstrutor_id() {
        return instrutor_id;
    }

    public void setInstrutor_id(int instrutor_id) {
        this.instrutor_id = instrutor_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return data_nascimento;
    }

    public void setDataNascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

package br.edu.unijui.model;

public class Planos {
    private int plano_id;
    private String nomePlano;
    private String descricao;
    private int duracaoSemanas;
    private double preco;

    public Planos() {
    }  
        
    public int getPlano_id() {
        return plano_id;
    }

    public void setPlano_id(int plano_id) {
        this.plano_id = plano_id;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoSemanas() {
        return duracaoSemanas;
    }

    public void setDuracaoSemanas(int duracaoSemanas) {
        this.duracaoSemanas = duracaoSemanas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}

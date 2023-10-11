package br.edu.unijui.model;

public class Inscricoes {
    private int inscricao_id;
    private int client_id;
    private int plano_id;
    private String dataInscricao;
    private String dataVencimento;
    private String statusPagamento;

    public Inscricoes() {
    }  

    public int getInscricao_id() {
        return inscricao_id;
    }

    public void setInscricao_id(int inscricao_id) {
        this.inscricao_id = inscricao_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getPlano_id() {
        return plano_id;
    }

    public void setPlano_id(int plano_id) {
        this.plano_id = plano_id;
    }

    public String getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(String dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

}

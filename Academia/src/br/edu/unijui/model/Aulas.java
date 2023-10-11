package br.edu.unijui.model;

public class Aulas {
    private int aula_id;
    private String nomeAula;
    private String descricao;
    private String horario;
    private String diaSemana;
    private int instrutor_id;

    public Aulas() {
    }  

    public int getAula_id() {
        return aula_id;
    }

    public void setAula_id(int aula_id) {
        this.aula_id = aula_id;
    }

    public String getNomeAula() {
        return nomeAula;
    }

    public void setNomeAula(String nomeAula) {
        this.nomeAula = nomeAula;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getInstrutor_id() {
        return instrutor_id;
    }

    public void setInstrutor_id(int instrutor_id) {
        this.instrutor_id = instrutor_id;
    }

}

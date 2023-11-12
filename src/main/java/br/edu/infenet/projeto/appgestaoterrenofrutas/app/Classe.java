package br.edu.infenet.projeto.appgestaoterrenofrutas.app;

import java.util.List;

public class Classe {

    private String nome;
    private List<Atributo> atributos;

    public Classe(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {

        return String.format("%s - %d", nome, atributos.size());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Atributo> getAtributos() {
        return atributos;
    }
    public void setAtributos(List<Atributo> atributos) {
        this.atributos = atributos;
    }
}

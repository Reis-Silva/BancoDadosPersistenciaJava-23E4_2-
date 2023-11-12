package br.edu.infenet.projeto.appgestaoterrenofrutas.vo;

import javax.persistence.*;

@Entity
@Table(name = "tbl_polpa")
public class Polpa extends Produto {

    private boolean congelado;

    private Float quantidade;

    private String informacoes;

    public Polpa() {
    }

    public Polpa(boolean congelado, Float tamanho, String informacoes, String descricao, Float valor, Long codigo) {
        super(descricao, valor, codigo);
        this.congelado = congelado;
        this.quantidade = tamanho;
        this.informacoes = informacoes;
    }

    public Polpa(Long id) {
        super(id);
    }

    public boolean isCongelado() {
        return congelado;
    }

    public void setCongelado(boolean congelado) {
        this.congelado = congelado;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    @Override
    public String toString() {
        return String.format("%s - Congelado: %s - quantidade: %.2f - Marca: %s", super.toString(), congelado, quantidade, informacoes);
    }

}

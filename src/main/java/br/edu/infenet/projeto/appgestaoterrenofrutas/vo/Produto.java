package br.edu.infenet.projeto.appgestaoterrenofrutas.vo;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbl_produto")
public abstract class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String descricao;

    private Float valor;

    private Long codigo;

    @ManyToMany(mappedBy = "produtoList")
    private List<Pedido> pedidos;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Produto() {
    }

    public Produto(String descricao, Float valor, Long codigo) {
        this.descricao = descricao;
        this.valor = valor;
        this.codigo = codigo;
    }

    public Produto(Produto produto) {
        this.descricao = produto.getDescricao();
        this.valor = produto.getValor();
        this.codigo = produto.getCodigo();
    }

    public Produto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return String.format("Descrição: %s - Valor: %.2f - Codigo: %d", descricao, valor, codigo);
    }

    public static String buscarSaudacaoAtual() {

        String[] saudacao = new String[]{"Bom Dia", "Boa Tarde", "Boa Noite"};

        Date dataAtual = new Date();

        if (dataAtual.getHours() >= 0 && dataAtual.getHours() < 12) {
            return saudacao[0].toString();
        } else if (dataAtual.getHours() >= 12 && dataAtual.getHours() < 18) {
            return saudacao[1].toString();
        } else {
            return saudacao[2].toString();
        }
    }
}

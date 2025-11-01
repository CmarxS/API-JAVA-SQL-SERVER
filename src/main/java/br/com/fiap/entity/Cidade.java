package br.com.fiap.entity;

import jakarta.persistence.*;

@Entity
@Table(name="mtt_cidade")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cod_cidade")
    private Integer codCidade;

    @Column(name="nome_cidade", nullable = false, length = 50)
    private String nomeCidade;

    @ManyToOne
    @JoinColumn(name="cod_estado")
    private Estado estado;

    public Cidade() {
    }

    public Cidade(String nomeCidade, Estado estado) {
        this.nomeCidade = nomeCidade;
        this.estado = estado;
    }

    public Integer getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(Integer codCidade) {
        this.codCidade = codCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}

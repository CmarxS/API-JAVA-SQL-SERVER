package br.com.fiap.entity;

import jakarta.persistence.*;

@Entity
@Table(name="mtt_filial")
public class Filial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cod_filial")
    private Integer codFilial;

    @Column(name = "nome_filial", nullable = false, length = 50)
    private String nomeFilial;

    @ManyToOne
    @JoinColumn(name = "cod_cidade")
    private Cidade cidade;

   @Column(name = "tamanho_patio")
    private Integer tamanhoPatio;


    public Filial() {
    }

    public Filial(String nomeFilial, Cidade cidade, Integer tamanhoPatio) {
        this.nomeFilial = nomeFilial;
        this.cidade = cidade;
        this.tamanhoPatio = tamanhoPatio;
    }

    public Integer getCodFilial() {
        return codFilial;
    }

    public void setCodFilial(Integer codFilial) {
        this.codFilial = codFilial;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Integer getTamanhoPatio() {
        return tamanhoPatio;
    }

    public void setTamanhoPatio(Integer tamanhoPatio) {
        this.tamanhoPatio = tamanhoPatio;
    }

}

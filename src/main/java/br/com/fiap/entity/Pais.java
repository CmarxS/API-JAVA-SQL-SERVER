package br.com.fiap.entity;


import jakarta.persistence.*;

@Entity
@Table(name="mtt_pais")
public class Pais {
    @Id
    @Column(name="cod_pais")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codPais;

    @Column(name="nome_pais", nullable = false, length = 50)
    private String nomePais;


    public Pais() {
    }

    public Pais(String nomePais) {
        this.nomePais = nomePais;
    }

    public Integer getCodPais() {
        return codPais;
    }

    public void setCodPais(Integer codPais) {
        this.codPais = codPais;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }
}

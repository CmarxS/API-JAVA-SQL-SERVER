package br.com.fiap.entity;


import jakarta.persistence.*;

@Entity
@Table(name="mtt_estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cod_estado")
    private Integer codEstado;

    @Column(name="nome_estado", nullable = false, length = 50)
    private String nomeEstado;

    @ManyToOne
    @JoinColumn(name="cod_pais")
    private Pais pais;

    public Estado() {
    }

    public Estado(String nomeEstado, Pais pais) {
        this.nomeEstado = nomeEstado;
        this.pais = pais;
    }

    public Integer getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(Integer codEstado) {
        this.codEstado = codEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}

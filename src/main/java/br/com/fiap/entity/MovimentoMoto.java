package br.com.fiap.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="mtt_movimento_moto")
public class MovimentoMoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cod_movimento")
    private Integer codMovimento;

    @ManyToOne
    @JoinColumn(name = "cod_moto")
    private Moto moto;

    @ManyToOne
    @JoinColumn(name = "cod_filial")
    private Filial filial;

    @Column(name = "tipo_movimento", length = 50)
    private String tipoMovimento;

    @Column(name = "data_movimento")
    private LocalDateTime dataMovimento;

    @Column(name = "manutencao_necessaria", length = 100)
    private String manutencaoNecessaria;

    public MovimentoMoto() {
    }

    public MovimentoMoto(Moto moto, Filial filial, String tipoMovimento, LocalDateTime dataMovimento, String manutencaoNecessaria) {
        this.moto = moto;
        this.filial = filial;
        this.tipoMovimento = tipoMovimento;
        this.dataMovimento = dataMovimento;
        this.manutencaoNecessaria = manutencaoNecessaria;
    }

    public Integer getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(Integer codMovimento) {
        this.codMovimento = codMovimento;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public LocalDateTime getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(LocalDateTime dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public String getManutencaoNecessaria() {
        return manutencaoNecessaria;
    }

    public void setManutencaoNecessaria(String manutencaoNecessaria) {
        this.manutencaoNecessaria = manutencaoNecessaria;
    }
}

package br.com.fiap.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="mtt_manutencao_moto")
public class ManutencaoMoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_manutencao")
    private Integer codManutencao;

    @ManyToOne
    @JoinColumn(name = "cod_moto")
    private Moto moto;

    @Column(name = "tipo_manutencao", length = 100)
    private String tipoManutencao;

    @Column(name = "data_manutencao")
    private LocalDateTime dataManutencao;

    public ManutencaoMoto() {
    }

    public ManutencaoMoto(Moto moto, String tipoManutencao, LocalDateTime dataManutencao) {
        this.moto = moto;
        this.tipoManutencao = tipoManutencao;
        this.dataManutencao = dataManutencao;
    }

    public Integer getCodManutencao() {
        return codManutencao;
    }

    public void setCodManutencao(Integer codManutencao) {
        this.codManutencao = codManutencao;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    public LocalDateTime getDataManutencao() {
        return dataManutencao;
    }

    public void setDataManutencao(LocalDateTime dataManutencao) {
        this.dataManutencao = dataManutencao;
    }
}

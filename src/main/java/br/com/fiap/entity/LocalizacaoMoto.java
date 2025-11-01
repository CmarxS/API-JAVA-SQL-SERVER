package br.com.fiap.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="mtt_localizacao_moto")
public class LocalizacaoMoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_localizacao")
    private Integer codLocalizacao;

    @ManyToOne
    @JoinColumn(name = "cod_moto")
    private Moto moto;

    @ManyToOne
    @JoinColumn(name = "cod_filial")
    private Filial filial;

    @Column(name = "box_posicao", length = 20)
    private String boxPosicao;

    @Column(name = "status", length = 20)
    private String status;

    @Column(name = "data_entrada")
    private LocalDateTime dataEntrada;

    @Column(name = "data_saida")
    private LocalDateTime dataSaida;

    public LocalizacaoMoto() {
    }

    public LocalizacaoMoto(Moto moto, Filial filial, String boxPosicao, String status, LocalDateTime dataEntrada, LocalDateTime dataSaida) {
        this.moto = moto;
        this.filial = filial;
        this.boxPosicao = boxPosicao;
        this.status = status;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public Integer getCodLocalizacao() {
        return codLocalizacao;
    }

    public void setCodLocalizacao(Integer codLocalizacao) {
        this.codLocalizacao = codLocalizacao;
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

    public String getBoxPosicao() {
        return boxPosicao;
    }

    public void setBoxPosicao(String boxPosicao) {
        this.boxPosicao = boxPosicao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }

}

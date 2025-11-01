package br.com.fiap.dto;

import java.time.LocalDateTime;

public class LocalizacaoMotoDTO {

    private Integer codLocalizacao;
    private Integer codMoto;
    private Integer codFilial;
    private String boxPosicao;
    private String status;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;

    public LocalizacaoMotoDTO() {
    }

    public LocalizacaoMotoDTO(Integer codLocalizacao, Integer codMoto, Integer codFilial, String boxPosicao,
            String status, LocalDateTime dataEntrada, LocalDateTime dataSaida) {
        this.codLocalizacao = codLocalizacao;
        this.codMoto = codMoto;
        this.codFilial = codFilial;
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

    public Integer getCodMoto() {
        return codMoto;
    }

    public void setCodMoto(Integer codMoto) {
        this.codMoto = codMoto;
    }

    public Integer getCodFilial() {
        return codFilial;
    }

    public void setCodFilial(Integer codFilial) {
        this.codFilial = codFilial;
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

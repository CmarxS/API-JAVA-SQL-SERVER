package br.com.fiap.dto;

import java.time.LocalDateTime;

public class manutencaoMotoDTO {

    private Integer codManutencao;
    private Integer codMoto;
    private String tipoManutencao;
    private LocalDateTime dataManutencao;

    public manutencaoMotoDTO() {
    }

    public manutencaoMotoDTO(Integer codManutencao, Integer codMoto, String tipoManutencao, LocalDateTime dataManutencao) {
        this.codManutencao = codManutencao;
        this.codMoto = codMoto;
        this.tipoManutencao = tipoManutencao;
        this.dataManutencao = dataManutencao;
    }

    public Integer getCodManutencao() {
        return codManutencao;
    }

    public void setCodManutencao(Integer codManutencao) {
        this.codManutencao = codManutencao;
    }

    public Integer getCodMoto() {
        return codMoto;
    }

    public void setCodMoto(Integer codMoto) {
        this.codMoto = codMoto;
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

package br.com.fiap.dto;

import java.time.LocalDateTime;

public class MovimentoMotoDTO {

    private Integer codMovimento;
    private Integer codMoto;
    private Integer codFilial;
    private String tipoMovimento;
    private LocalDateTime dataMovimento;
    private String manutencaoNecessaria;

    public MovimentoMotoDTO() {
    }

    public MovimentoMotoDTO(Integer codMovimento, Integer codMoto, Integer codFilial, String tipoMovimento, LocalDateTime dataMovimento, String manutencaoNecessaria) {
        this.codMovimento = codMovimento;
        this.codMoto = codMoto;
        this.codFilial = codFilial;
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

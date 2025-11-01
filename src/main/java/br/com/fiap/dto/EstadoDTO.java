package br.com.fiap.dto;

public class EstadoDTO {

    private Integer codEstado;
    private String nomeEstado;
    private Integer codPais;

    public EstadoDTO() {
    }

    public EstadoDTO(Integer codEstado, String nomeEstado, Integer codPais) {
        this.codEstado = codEstado;
        this.nomeEstado = nomeEstado;
        this.codPais = codPais;
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

    public Integer getCodPais() {
        return codPais;
    }

    public void setCodPais(Integer codPais) {
        this.codPais = codPais;
    }
}

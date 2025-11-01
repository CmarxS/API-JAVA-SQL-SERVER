package br.com.fiap.dto;

public class CidadeDTO {
    private Integer codCidade;
    private String nomeCidade;
    private Integer codEstado;

    public CidadeDTO() {
    }

    public CidadeDTO(Integer codCidade, String nomeCidade, Integer codEstado) {
        this.codCidade = codCidade;
        this.nomeCidade = nomeCidade;
        this.codEstado = codEstado;
    }

    public Integer getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(Integer codCidade) {
        this.codCidade = codCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public Integer getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(Integer codEstado) {
        this.codEstado = codEstado;
    }
}

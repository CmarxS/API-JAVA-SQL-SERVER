package br.com.fiap.dto;

public class FilialDTO {
    private Integer codFilial;
    private String nomeFilial;
    private Integer codCidade;
    private String tamanhoPatio;

    public FilialDTO() {
    }

    public FilialDTO(Integer codFilial, String nomeFilial, Integer codCidade, String tamanhoPatio) {
        this.codFilial = codFilial;
        this.nomeFilial = nomeFilial;
        this.codCidade = codCidade;
        this.tamanhoPatio = tamanhoPatio;
    }

    public Integer getCodFilial() {
        return codFilial;
    }

    public void setCodFilial(Integer codFilial) {
        this.codFilial = codFilial;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public Integer getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(Integer codCidade) {
        this.codCidade = codCidade;
    }

    public String getTamanhoPatio() {
        return tamanhoPatio;
    }

    public void setTamanhoPatio(String tamanhoPatio) {
        this.tamanhoPatio = tamanhoPatio;
    }
}

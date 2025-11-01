package br.com.fiap.dto;

public class MotoDTO {

    private Integer codMoto;
    private String modelo;
    private Integer anoFabricacao;
    private String categoria;
    private Integer codCliente;
    private String placa;

    public MotoDTO() {
    }

    public MotoDTO(Integer codMoto, String modelo, Integer anoFabricacao, String categoria, Integer codCliente) {
        this.codMoto = codMoto;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.categoria = categoria;
        this.codCliente = codCliente;
        this.placa = placa;
    }

    public Integer getCodMoto() {
        return codMoto;
    }

    public void setCodMoto(Integer codMoto) {
        this.codMoto = codMoto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}

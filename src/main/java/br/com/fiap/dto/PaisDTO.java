package br.com.fiap.dto;

public class PaisDTO {
    private Integer id;
    private String nomePais;

    public PaisDTO() {
    }

    public PaisDTO(Integer id, String nomePais) {
        this.id = id;
        this.nomePais = nomePais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }
}

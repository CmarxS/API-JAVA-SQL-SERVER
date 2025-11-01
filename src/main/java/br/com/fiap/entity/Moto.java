package br.com.fiap.entity;

import jakarta.persistence.*;

@Entity
@Table(name="mtt_moto")
public class Moto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_moto")
    private Integer codMoto;

    @Column(name = "modelo", length = 50)
    private String modelo;

    @Column(name = "ano_fabricacao")
    private Integer anoFabricacao;

    @Column(name = "categoria", length = 50)
    private String categoria;

    @Column(name = "placa")
    private String placa;

    @ManyToOne
    @JoinColumn(name = "cod_cliente")
    private Cliente cliente;

    public Moto() {
    }

    public Moto(String modelo, Integer anoFabricacao, String categoria, Cliente cliente , String placa) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.categoria = categoria;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}

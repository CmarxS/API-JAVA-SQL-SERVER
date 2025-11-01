package br.com.fiap.entity;

import jakarta.persistence.*;

@Entity
@Table(name="mtt_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cod_cliente")
    private Integer codCliente;

    @Column(name="nome_cliente", nullable = false, length = 100)
    private String nomeCliente;

    @Column(name="cpf_cliente", nullable = false, length = 15)
    private String cpfCliente;

    @Column(name="telefone_cliente", nullable = false, length = 20)
    private String telefoneCliente;

    public Cliente() {
    }

    public Cliente(String nomeCliente, String cpfCliente, String telefoneCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

}

package br.com.fiap.entity;

import jakarta.persistence.*;

@Entity
@Table(name="mtt_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cod_usuario")
    private Integer codUsuario;

    @Column(name = "nome_usuario", length = 50)
    private String nomeUsuario;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "tipo_acesso", length = 20)
    private String tipoAcesso;

    @ManyToOne
    @JoinColumn(name = "cod_filial")
    private Filial filial;

    @Column(name = "funcao_usuario", length = 50)
    private String funcaoUsuario;

    public Usuario() {
    }

    public Usuario(String nomeUsuario, String email, String tipoAcesso, Filial filial, String funcaoUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.tipoAcesso = tipoAcesso;
        this.filial = filial;
        this.funcaoUsuario = funcaoUsuario;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoAcesso() {
        return tipoAcesso;
    }

    public void setTipoAcesso(String tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public String getFuncaoUsuario() {
        return funcaoUsuario;
    }

    public void setFuncaoUsuario(String funcaoUsuario) {
        this.funcaoUsuario = funcaoUsuario;
    }
}

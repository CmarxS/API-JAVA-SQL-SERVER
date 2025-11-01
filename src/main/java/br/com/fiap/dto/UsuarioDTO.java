package br.com.fiap.dto;

public class UsuarioDTO {
    private Integer codUsuario;
    private String nomeUsuario;
    private String email;
    private String tipoAcesso;
    private Integer codFilial;
    private String funcaoUsuario;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Integer codUsuario, String nomeUsuario, String email, String tipoAcesso, Integer codFilial,
            String funcaoUsuario) {
        this.codUsuario = codUsuario;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.tipoAcesso = tipoAcesso;
        this.codFilial = codFilial;
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

    public Integer getCodFilial() {
        return codFilial;
    }

    public void setCodFilial(Integer codFilial) {
        this.codFilial = codFilial;
    }

    public String getFuncaoUsuario() {
        return funcaoUsuario;
    }

    public void setFuncaoUsuario(String funcaoUsuario) {
        this.funcaoUsuario = funcaoUsuario;
    }
}

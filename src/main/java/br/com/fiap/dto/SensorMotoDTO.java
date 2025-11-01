package br.com.fiap.dto;

public class SensorMotoDTO {

    private Integer codSensor;
    private Integer codFilial;
    private String tipoSensor;
    private String localInstalacao;
    private Integer codMoto;

    public SensorMotoDTO() {
    }

    public SensorMotoDTO(Integer codSensor, Integer codFilial, String tipoSensor, String localInstalacao, Integer codMoto) {
        this.codSensor = codSensor;
        this.codFilial = codFilial;
        this.tipoSensor = tipoSensor;
        this.localInstalacao = localInstalacao;
        this.codMoto = codMoto;
    }

    public Integer getCodSensor() {
        return codSensor;
    }

    public void setCodSensor(Integer codSensor) {
        this.codSensor = codSensor;
    }

    public Integer getCodFilial() {
        return codFilial;
    }

    public void setCodFilial(Integer codFilial) {
        this.codFilial = codFilial;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }

    public String getLocalInstalacao() {
        return localInstalacao;
    }

    public void setLocalInstalacao(String localInstalacao) {
        this.localInstalacao = localInstalacao;
    }

    public Integer getCodMoto() {
        return codMoto;
    }

    public void setCodMoto(Integer codMoto) {
        this.codMoto = codMoto;
    }
}

package br.com.fiap.entity;

import jakarta.persistence.*;

@Entity
@Table(name="mtt_sensor_moto")
public class SensorMoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_sensor")
    private Integer codSensor;

    @ManyToOne
    @JoinColumn(name = "cod_filial")
    private Filial filial;

    @Column(name = "tipo_sensor", length = 50)
    private String tipoSensor;

    @Column(name = "local_instalacao", length = 100)
    private String localInstalacao;

    @ManyToOne
    @JoinColumn(name = "cod_moto")
    private Moto moto;

    public SensorMoto() {
    }

    public SensorMoto(Filial filial, String tipoSensor, String localInstalacao, Moto moto) {
        this.filial = filial;
        this.tipoSensor = tipoSensor;
        this.localInstalacao = localInstalacao;
        this.moto = moto;
    }

    public Integer getCodSensor() {
        return codSensor;
    }

    public void setCodSensor(Integer codSensor) {
        this.codSensor = codSensor;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
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

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }
}

package com.eletronica.deltaApi.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Aparelho implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String modelo;
    private String serial;
    private String pronto;
    private String devolucao;
    private Integer idCliente;
    private String autorizado;
    private String garantia;
    private String entregue;
    private String defeito_obs;
    private Date dataEntrada;
    private Date dataSaida;

    private Double valor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getPronto() {
        return pronto;
    }

    public void setPronto(String pronto) {
        this.pronto = pronto;
    }


    public String getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(String autorizado) {
        this.autorizado = autorizado;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getEntregue() {
        return entregue;
    }

    public void setEntregue(String entregue) {
        this.entregue = entregue;
    }

    public String getDefeito_obs() {
        return defeito_obs;
    }

    public void setDefeito_obs(String defeito_obs) {
        this.defeito_obs = defeito_obs;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntreda(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public double getValor() {
        return valor==null?new Double(0):valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(String devolucao) {
        this.devolucao = devolucao;
    }
}

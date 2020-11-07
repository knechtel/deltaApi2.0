package com.eletronica.deltaApi.dto;

import com.eletronica.deltaApi.bean.Aparelho;
import com.eletronica.deltaApi.util.Util;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class AparelhoDto {
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
    private String dataEntrada;
    private String dataSaida;
    private Double valor;
    private String uuidCliente;

    public Aparelho build(AparelhoDto aparelhoDto){
        Aparelho a = new Aparelho();
        a.setId(aparelhoDto.getId());
        a.setNome(aparelhoDto.getNome());
        a.setModelo(aparelhoDto.getModelo());
        a.setSerial(aparelhoDto.getSerial());
        a.setPronto(aparelhoDto.getPronto());
        a.setDevolucao(aparelhoDto.getDevolucao());
        a.setIdCliente(aparelhoDto.getIdCliente());
        a.setAutorizado(aparelhoDto.getAutorizado());
        a.setGarantia(aparelhoDto.getGarantia());
        a.setEntregue(aparelhoDto.getEntregue());
        a.setDefeito_obs(aparelhoDto.getDefeito_obs());
       // a.setDataEntreda(Util.toDate(aparelhoDto.getDataEntrada()));
        a.setDataSaida(Util.toDate(aparelhoDto.getDataSaida()));
        a.setValor(aparelhoDto.getValor());
        a.setUuidCliente(aparelhoDto.getUuidCliente());
        return a;

    }
    public AparelhoDto toDTO(Aparelho aparelhoDto){
        AparelhoDto a = new AparelhoDto();
        a.setId(aparelhoDto.getId());
        a.setNome(aparelhoDto.getNome());
        a.setModelo(aparelhoDto.getModelo());
        a.setSerial(aparelhoDto.getSerial());
        a.setPronto(aparelhoDto.getPronto());
        a.setDevolucao(aparelhoDto.getDevolucao());
        a.setIdCliente(aparelhoDto.getIdCliente());
        a.setAutorizado(aparelhoDto.getAutorizado());
        a.setGarantia(aparelhoDto.getGarantia());
        a.setEntregue(aparelhoDto.getEntregue());
        a.setDefeito_obs(aparelhoDto.getDefeito_obs());
        a.setDataEntrada(Util.dateToSring(aparelhoDto.getDataEntrada()));
        a.setDataSaida(Util.dateToSring(aparelhoDto.getDataSaida()));
        a.setValor(aparelhoDto.getValor());
        a.setUuidCliente(aparelhoDto.getUuidCliente());
        return a;
    }

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

    public String getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(String devolucao) {
        this.devolucao = devolucao;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
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

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getUuidCliente() {
        return uuidCliente;
    }

    public void setUuidCliente(String uuidCliente) {
        this.uuidCliente = uuidCliente;
    }
}

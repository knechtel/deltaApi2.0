package com.eletronica.deltaApi.dto;

import com.eletronica.deltaApi.bean.Cliente;

/**
 * Created by maiquelknechtel on 04/11/20.
 */
public class ClienteDto {
    private Integer id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private String uuidCliente;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUuidCliente() {
        return uuidCliente;
    }

    public void setUuidCliente(String uuidCliente) {
        this.uuidCliente = uuidCliente;
    }

    public Cliente toCliente(ClienteDto clienteDto){
        Cliente c = new Cliente();
        c.setId(clienteDto.getId());
        c.setNome(clienteDto.getNome());
        c.setCpf(clienteDto.getCpf());
        c.setEndereco(clienteDto.getEndereco());
        c.setTelefone(clienteDto.getTelefone());
        c.setEmail(clienteDto.getEmail());
        c.setUuidCliente(clienteDto.getUuidCliente());
        return c;
    }

    public ClienteDto toClienteDto(Cliente cliente){
        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setId(cliente.getId());
        clienteDto.setNome(cliente.getNome());
        clienteDto.setCpf(cliente.getCpf());
        clienteDto.setEndereco(cliente.getEndereco());
        clienteDto.setTelefone(cliente.getTelefone());
        clienteDto.setEmail(cliente.getEmail());
        clienteDto.setUuidCliente(cliente.getUuidCliente());
        return clienteDto;
    }
}

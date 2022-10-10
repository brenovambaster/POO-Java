/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.relacionamentos;

/**
 * Classe Credencial
 *
 * @author Breno Vambaster C. L
 */
public class Credencial {

    private String email;
    private String senha;
    private boolean ativo;
    private Cliente cliente;

    public Credencial(String email, String senha, boolean ativo) {
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;

    }

    //<editor-fold defaultstate="collapsed" desc="get/set">
    public String getEmail() {
        return email;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Credencial{" + "email=" + email + ", senha=" + senha + ", ativo=" + ativo + '}';
    }
}

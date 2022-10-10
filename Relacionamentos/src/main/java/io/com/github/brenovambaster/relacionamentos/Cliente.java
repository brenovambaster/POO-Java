/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.relacionamentos;

/**
 * Classe Cliente
 *
 * @author Breno Vambaster C. L
 */
public class Cliente {

    private String nome;
    private Credencial credencial;

    public Cliente(String nome, Credencial credencial) {
        this.nome = nome;
        this.credencial = credencial;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", credencial: " + credencial.toString() + "";
    }

    //<editor-fold defaultstate="collapsed" desc="get/set">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    //</editor-fold>
}

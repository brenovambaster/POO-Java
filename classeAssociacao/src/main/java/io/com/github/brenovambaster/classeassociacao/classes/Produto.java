/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.classeassociacao.classes;

import java.math.BigDecimal;

/**
 * Classe Produto
 *
 * @author Breno Vambaster C. L
 */
public class Produto {

    private String nome;
    private BigDecimal preco;
    private Long codigo;

    public Produto() {
    }

    public Produto(String nome, BigDecimal preco, Long codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    //<editor-fold defaultstate="collapsed" desc="geters/seters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

//</editor-fold>
    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + ", codigo=" + codigo + '}';
    }

}

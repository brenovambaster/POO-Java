/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.carrinhodecompras.produto;

import java.math.BigDecimal;

/**
 * Classe Produto
 *
 * @author Breno Vambaster C. L
 */
public class Produto {

    private Long codigo;
    private String nome;
    protected BigDecimal preco;

    public Produto() {

    }

    public Produto(Long codigo, String nome, BigDecimal preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public BigDecimal calcularTotal() {
        return getPreco();
    }
//<editor-fold defaultstate="collapsed" desc="get/set">

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

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

//</editor-fold>
}

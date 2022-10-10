/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.classeassociacao.classes;

import java.math.BigDecimal;

/**
 * Classe Item
 *
 * @author Breno Vambaster C. L
 */
public class Item {

    private Double quantidade;
    Produto produto;

    public Item(Double quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public BigDecimal calcularTotal() {
        return produto.getPreco().multiply(new BigDecimal(quantidade));
    }

    @Override
    public String toString() {
        return "Item{" + "quantidade=" + quantidade + ", produto=" + produto + '}';
    }

}

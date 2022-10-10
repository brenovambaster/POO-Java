/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.classeassociacao.classes;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Classe Compra
 *
 * @author Breno Vambaster C. L
 */
public class Compra {

    private Long notaFiscal;
    private ArrayList<Item> itens;

    public Compra() {
        this.itens = new ArrayList();
    }

    public Compra(Long notaFiscal) {
        this();
        this.notaFiscal = notaFiscal;
    }

    //<editor-fold defaultstate="collapsed" desc="get/set">
    public Long getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(Long notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

//</editor-fold>
    public BigDecimal calcTotal() {
        BigDecimal total = BigDecimal.ZERO;

        for (Item i : itens) {
            total = total.add(i.calcularTotal());
        }
        return total;
    }

    public void addItem(Item item) {
        itens.add(item);
    }

    @Override
    public String toString() {
        return "Compra{"
                + "notaFiscal=" + notaFiscal
                + ", itens=" + itens + '}'
                + "total" + calcTotal();
    }

}

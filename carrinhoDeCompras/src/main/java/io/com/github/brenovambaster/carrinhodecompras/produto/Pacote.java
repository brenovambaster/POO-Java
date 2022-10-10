/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.carrinhodecompras.produto;

import java.math.BigDecimal;

/**
 * Classe Pacote
 *
 * @author Breno Vambaster C. L
 */
public class Pacote extends Produto {

    Unitario unit;
    private Integer qtd;
    private Double desconto;

    @Override
    public BigDecimal calcularTotal() {
        return (new BigDecimal(qtd)
                .multiply(unit.calcularTotal())
                .multiply(new BigDecimal(1 - desconto)));
    }

}

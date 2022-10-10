/*
 * Copyright (C) 2022 pedro
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.mycompany.gestaofolhapagamento;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;
import java.text.NumberFormat;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * Classe Comissionado
 *
 * @author pedro
 */
public class Comissionado extends Empregado {

    private Double salarioFixo;
    private Double venda;
    private Double comissao;

    public Comissionado(Double salarioFixo, Double venda, Double comissao) {
        this.salarioFixo = salarioFixo;
        this.venda = venda;
        this.comissao = comissao;
        
    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">  
    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public Double getVenda() {
        return venda;
    }

    public void setVenda(Double venda) {
        this.venda = venda;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    //</editor-fold>
    public Double calcularSalario() {
        return salarioFixo + (venda * comissao);
    }

    @Override
    public String toString() {
        String cpfAuxiliar = "000.000.000-00";
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        NumberFormat percentual = NumberFormat.getPercentInstance(localeBR);
        try {
            MaskFormatter cpfFormatter = new MaskFormatter("###.###.###-##");
            cpfFormatter.setValueContainsLiteralCharacters(false);
            cpfAuxiliar = cpfFormatter.valueToString(String.format("%011d", getCpf()));
        } catch (ParseException ex) {
            Logger.getLogger(Comissionado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Comissionado{" + "matricula = " + getMatricula()
                + ", nome = " + getNome()
                + ", cpf = " + cpfAuxiliar
                + ", ctps = " + getCtps()
                + ", endereco = " + getEndereco()
                + ", email = " + getEmail()
                + ", telefone = " + getTelefone()
                + ", nascimento = " + getNascimento()
                + ", idade = " + getIdade()
                + ", salarioFixo = " + dinheiro.format(salarioFixo)
                + ", venda = " + dinheiro.format(venda)
                + ", comissao = " + percentual.format(comissao)
                + '}';
    }

}

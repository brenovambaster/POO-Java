/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.gestao_projeto_entidades_isoladas;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Classe Projeto
 *
 * @author Breno Vambaster C. L
 */
public class Projeto {

    Long codigo;
    String nome;
    LocalDate inicio;
    LocalDate termino;
    Byte progresso;
    BigDecimal custoEstimado;
    BigDecimal custoAtual;
//<editor-fold defaultstate="collapsed" desc="comment">

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

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getTermino() {
        return termino;
    }

    public void setTermino(LocalDate termino) {
        this.termino = termino;
    }

    public Byte getProgresso() {
        return progresso;
    }

    public void setProgresso(Byte progresso) {
        this.progresso = progresso;
    }

    public BigDecimal getCustoEstimado() {
        return custoEstimado;
    }

    public void setCustoEstimado(BigDecimal custoEstimado) {
        this.custoEstimado = custoEstimado;
    }

    public BigDecimal getCustoAtual() {
        return custoAtual;
    }

    public void setCustoAtual(BigDecimal custoAtual) {
        this.custoAtual = custoAtual;
    }

//</editor-fold>
}

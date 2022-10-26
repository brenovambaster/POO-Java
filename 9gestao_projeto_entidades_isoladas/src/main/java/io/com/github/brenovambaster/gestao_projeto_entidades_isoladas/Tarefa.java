/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.gestao_projeto_entidades_isoladas;

import java.time.LocalDate;

/**
 * Classe Tarefa
 *
 * @author Breno Vambaster C. L
 */
public class Tarefa {

    Long id;
    String descricao;
    LocalDate conclusao;
    Boolean excluida;

    //<editor-fold defaultstate="collapsed" desc="gets/sets">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getConclusao() {
        return conclusao;
    }

    public void setConclusao(LocalDate conclusao) {
        this.conclusao = conclusao;
    }

    public Boolean getExcluida() {
        return excluida;
    }

    public void setExcluida(Boolean excluida) {
        this.excluida = excluida;
    }

//</editor-fold>
}

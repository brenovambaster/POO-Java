/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.abstratos;

/**
 * Classe FiguraGeometrica
 *
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 * @version 0.1, 2022-10-05
 */
public abstract class FiguraGeometrica {

    private int lados;

    public FiguraGeometrica() {
        lados = -1;
    }

    public FiguraGeometrica(int lados) {
        this.lados = lados;
    }

    public abstract double calcularArea();

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    
}

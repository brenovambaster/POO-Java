/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.abstratos;

/**
 * Classe Triangulo
 *
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 * @version 0.1, 2022-10-05
 */
public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Triangulo() {
        System.out.println("Construtor padrão de Triangulo invocado");
    }

    public Triangulo(int lados) {
        System.out.println("Construtor sobrecarregado de Triangulo invocado");
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }

    //<editor-fold defaultstate="collapsed" desc="get/set">
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

//</editor-fold>
}

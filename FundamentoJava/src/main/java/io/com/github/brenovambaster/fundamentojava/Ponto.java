/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.fundamentojava;

/**
 * Classe Ponto
 *
 * @author Breno Vambaster C. L
 */
import java.lang.Math;

public class Ponto {

    private Double x;
    private Double y;

    public Ponto() {
        System.out.println("Construtor invocado");
        x = y = 0.0;
    }

    public Ponto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Double getX() {
        return this.x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return this.y;
    }

    public void setY(Double y) {
        this.y = y;
    }
//</editor-fold>

    public double calcularDistancia(Ponto p) {
        Double deltaX = Math.pow(p.getX() - this.x, 2);
        Double deltaY = Math.pow(p.getY() - this.y, 2);
        // poderia também incrementar aqui o deltaZ para pontos em 3D;
        return Math.sqrt(deltaY + deltaX);
    }

    @Override
    public String toString() {
        return "Ponto (" + x + "," + y + ")";
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package io.com.github.brenovambaster.abstratos;

/**
 *
 * @author Breno Vambaster C. L
 */
public class Abstratos {

    public static void main(String[] args) {

        Triangulo t1 = new Triangulo(2);
        t1.setAltura(2);
        t1.setBase(2);

        //   FiguraGeometrica f = new FiguraGeometrica(); não pode ser instanciado 
        FiguraGeometrica fig = new Triangulo(3);
        ((Triangulo) fig).setBase(4.0);   //    VAI CAIR NA PROVA
        ((Triangulo) fig).setAltura(3.0);
        System.out.println("Area: " + fig.calcularArea());

    }
}

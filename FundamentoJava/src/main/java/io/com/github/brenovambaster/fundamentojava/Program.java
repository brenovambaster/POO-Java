/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.fundamentojava;

/**
 * Classe Program
 *
 * @author Breno Vambaster C. L
 */
public class Program {

    public static void main(String[] args) {
        Ponto a = new Ponto(1.0, 1.0);
        Ponto b = new Ponto(4.0, 3.0);

        Ponto c = new Ponto(3.0, -1.0);
        Ponto d = new Ponto(6.0, -2.0);

        Ponto e = new Ponto(3.36, 1.44);
        Ponto f = new Ponto(5.0, 0.0);
//        Ponto p4 = b;

//        p4.setX(0.0);
//        p4.setY(5.0);
//        p.imprimePonto();
        System.out.println("Ponto a" + a.toString()); //(1,1)
        System.out.println("Ponto b" + b.toString()); // (2,2)
        System.out.println("Ponto c" + c.toString()); //(3,3)
        System.out.println("Ponto d" + d.toString()); //(3,3)
        System.out.println("Ponto e" + e.toString()); //(3,3)
        System.out.println("Ponto f" + f.toString()); //(3,3)

//        System.out.println(p4.toString()); //(4,4)
        System.out.println("Distancia entre A e B: " + a.calcularDistancia(b));
        System.out.println("Distancia entre C e D: " + c.calcularDistancia(d));
        System.out.println("Distancia entre E e F: " + e.calcularDistancia(f));

    }

}

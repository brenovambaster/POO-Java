/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package io.com.github.brenovambaster.estudointerface;

/**
 *
 * @author Breno Vambaster C. L
 */
public class Main {

    public static void main(String[] args) {
        ObjetoAcessoDados obj = new ObjetoAcessoDados();
        System.out.println("Localizando por ID: " + obj.localizaPorId(21l));
        System.out.println("Obterndo serial: " + obj.obterSerial());

    }
}

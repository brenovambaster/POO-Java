/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package io.com.github.brenovambaster.relacionamentos;

/**
 *
 * @author Breno Vambaster C. L
 */
public class Relacionamentos {

    public static void main(String[] args) {
        Credencial cred = new Credencial("breno@gmail.com", "teste", true);
        Cliente cl = new Cliente("breno vambaster", cred);
        cred.setCliente(cl);
        System.out.println(cl);
        int[] idade = new int[3];
        Arra
    }
}

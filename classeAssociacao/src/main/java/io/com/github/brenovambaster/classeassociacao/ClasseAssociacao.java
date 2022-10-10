/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package io.com.github.brenovambaster.classeassociacao;

import io.com.github.brenovambaster.classeassociacao.classes.Compra;
import io.com.github.brenovambaster.classeassociacao.classes.Item;
import io.com.github.brenovambaster.classeassociacao.classes.Produto;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Breno Vambaster C. L
 */
public class ClasseAssociacao {

    private static String getRandomName() {
        System.out.println("Providing a random name");
        return "John Doe";
    }

    public static void main(String[] args) {

        Produto p1 = new Produto("leite", new BigDecimal(5.), 12l);
        Produto p2 = new Produto("leite", new BigDecimal(2.), 13l);
        Produto p3 = new Produto("leite", new BigDecimal(1), 14l);

        Item it1 = new Item(1.0, p1);
        Item it2 = new Item(1.0, p2);
        Item it3 = new Item(1.0, p3);

        Compra compra1 = new Compra(0142143241l);
        compra1.addItem(it1);
        compra1.addItem(it2);
        compra1.addItem(it3);
        System.out.println("> : " + (p1.getNome() == p2.getNome()));

        System.out.println("Total de compras: " + compra1.calcTotal());
        System.out.println("   " + compra1);

    }
}

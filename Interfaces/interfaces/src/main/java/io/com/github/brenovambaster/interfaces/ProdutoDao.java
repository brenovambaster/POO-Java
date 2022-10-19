/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.interfaces;

/**
 * Classe ProdutoDao
 *
 * @author Breno Vambaster C. L
 */
public class ProdutoDao implements IDao<Produto> {

    @Override
    public Long salvar(Produto o) {
        System.out.println("Dados Produto salvo");

        return 1l;
    }

}

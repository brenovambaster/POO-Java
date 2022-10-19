/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.interfaces;

/**
 * Classe ClienteDao
 *
 * @author Breno Vambaster C. L
 */
public class ClienteDao implements IDao<Cliente> {

    @Override
    public Long salvar(Cliente cl) {
        System.out.println("Dados salvos");
        return 1l;
    }

}

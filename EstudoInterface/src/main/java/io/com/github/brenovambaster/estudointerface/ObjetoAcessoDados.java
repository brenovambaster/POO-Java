/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.estudointerface;

/**
 * Classe ObjetoAcessoDados
 *
 * @author Breno Vambaster C. L
 */
public class ObjetoAcessoDados implements AcessoDados, Serial {

    @Override
    public Object localizaPorId(Long id) {
        return "{retorno aqui }";
    }

    @Override
    public Long obterSerial() {
        return 1l;
    }

}

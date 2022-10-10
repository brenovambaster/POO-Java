/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoafisica;

import com.mycompany.pessoafisica.entidade.PessoaFisica;
import com.mycompany.pessoafisica.entidade.PessoaJuridica;
import java.time.LocalDate;

/**
 * Classe Program
 *
 * @author Breno Vambaster
 */
public class Program {

    public static void main(String[] args) {
        long CPF = 1234567;
        PessoaJuridica a = new PessoaJuridica();
        PessoaFisica b = new PessoaFisica();
        b.setCpf(2345678901L);
        System.out.println("OBJ b> " + b);

        a.setCnpj(1234567890123L);
        System.out.println("CNPJ a: > " + a.getcnpj());

//
//        a.setNome("Juridico");
//        System.out.println("Nome a: > " + a.getNome());
//        a.setEmail("peoi@gmail.com");
//        System.out.println("email a: > " + a.getEmail());
//        a.setSenha("2536gde");
//        a.setFundacao(LocalDate.of(2002, 4, 18));
//        System.out.println("Fundacao a> " + a.getFundacao());
//        System.out.println("Idade a > " + a.getIdade());
//
//        System.out.println("obj a" + a);
    }
}

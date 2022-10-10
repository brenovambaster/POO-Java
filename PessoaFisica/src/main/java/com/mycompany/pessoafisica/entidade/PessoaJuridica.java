/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoafisica.entidade;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;

/**
 * Classe PessoaJuridica
 *
 * @author Breno Vambaster
 */
public class PessoaJuridica {

    private Long cnpj;
    private String nome;
    private String email;
    private String senha;
    private LocalDate fundacao;
    private Byte idade;

    /*
    public PessoaJuridica(Long cnpj, String nome, String email, String senha, LocalDate fundacao) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.fundacao = fundacao;
    }
    
    public PessoaJuridica(){

    }*/
    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Long getcnpj() {
        return cnpj;
    }

    public void setNome(String nome) {
        this.nome = nome.length() > 50 ? nome.substring(0, 50) : nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email.length() > 250 ? email.substring(0, 50) : email;
    }

    public String getEmail() {
        return email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setFundacao(LocalDate fundacao) {
        this.fundacao = fundacao;
        idade = (byte) fundacao.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public LocalDate getFundacao() {
        return fundacao;
    }

    public Byte getIdade() {
        return idade;
    }
//</editor-fold>

    @Override
    public String toString() {

        String sCnpjAuxiliar = "000.000.000/0000-00";

        try {
            MaskFormatter mskFormatter = new MaskFormatter("###.###.###/####-##");
            mskFormatter.setValueContainsLiteralCharacters(false);
            sCnpjAuxiliar = mskFormatter.valueToString(String.format("%015d", cnpj));

        } catch (ParseException ex) {
            Logger.getLogger(PessoaFisica.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "PessoaJuridica{" + "cnpj=" + sCnpjAuxiliar
                + ", nome=" + nome
                + ", email=" + email
                + ", senha=" + senha
                + ", fundacao=" + fundacao
                + ", idade=" + idade
                + '}';
    }

}

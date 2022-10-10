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
 * Classe PessoaFisica
 *
 * @author Breno Vambaster
 */
public class PessoaFisica {

    private Long cpf;
    private String nome;
    private String email;
    private String senha;
    private LocalDate nascimento;
    private Byte idade;

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.length() > 250 ? email.substring(0, 250) : email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.length() > 45 ? nome.substring(0, 45) : nome; //operador ternario
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNacimento(LocalDate nascimento) {
        this.nascimento = nascimento;
        idade = (byte) nascimento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public Byte getIdade() {
        return idade;
    }

    //</editor-fold>
    @Override
    public String toString() {
        String sCpfAuxiliar = "000.000.000-00";

        try {
            MaskFormatter mskFormatter = new MaskFormatter("###.###.###-##");
            mskFormatter.setValueContainsLiteralCharacters(false);
            sCpfAuxiliar = mskFormatter.valueToString(String.format("%011d", cpf));

        } catch (ParseException ex) {
            Logger.getLogger(PessoaFisica.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "PessoaFisica{"
                + "cpf=" + sCpfAuxiliar
                + ", nome=" + nome
                + ", email=" + email
                + ", senha=" + senha
                + ", nascimento=" + nascimento
                + ", idade=" + idade
                + '}';
    }

}
/*
    @Override
    public String toString() {
        MaskFormatter skFomatter = new MaskFomatter ("###.###.###-##");
        return "PessoaFisica{" + "cpf=" + cpf 
                + ", nome=" + nome 
                + ", email=" + email 
                + ", senha=" + senha 
                + ", nascimento=" 
                + nascimento + ", idade=" + idade + '}';
    }*/

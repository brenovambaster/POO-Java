/*
 * Copyright (C) 2022 pedro
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.mycompany.gestaofolhapagamento;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Classe Program
 *
 * @author pedro
 */
public class Program {

    public static void main(String[] args) {
        Mensalista m1 = new Mensalista(400.0);
        m1.setNome("Breno");
        Mensalista m2 = new Mensalista(400.0);
        m2.setNome("lucas");

        Comissionado c1 = new Comissionado(1000.0, 1000.0, 0.1);
        c1.setNome("Alfredo");
        Comissionado c2 = new Comissionado(1000.0, 1000.0, 0.1);
        c2.setNome("Luis");

        Horista h1 = new Horista(12.0, 23.0);
        h1.setNome("Teste horista 1");
        Horista h2 = new Horista(12., 23.0);
        h2.setNome("Teste horista 2");

        Mensalista[] vetorM = new Mensalista[2];
        Horista[] vetorH = new Horista[2];
        Comissionado[] vetorC = new Comissionado[2];

//        vetorM[0] = m1;
//        vetorM[1] = m2;
//
//        vetorH[0] = h1;
//        vetorH[1] = h2;
//
//        vetorC[0] = c1;
//        vetorC[1] = c2;
//// Mensalista
//        double salarioTotalM = 0;
//        for (Mensalista v : vetorM) {
//            salarioTotalM += v.calculaSalario();
//        }
//
//        // horista
//        double salarioTotalH = 0;
//        for (Horista vh : vetorH) {
//            salarioTotalH += vh.calcularSalario();
//        }
//// Comissionado
//        double salarioTotalC = 0;
//        for (Comissionado vc : vetorC) {
//            salarioTotalC += vc.calculaSalario();
//        }
        ArrayList<Empregado> empregados = new ArrayList<>();
        empregados.add(m1);
        empregados.add(m2);
        empregados.add(h1);
        empregados.add(h2);
        empregados.add(c1);
        empregados.add(c2);

        Double total = 0.0;

        for (Empregado e : empregados) {
            total += e.calcularSalario();
            System.out.println(">" + e.calcularSalario());
        }

        System.out.println("SALARIO TOTAL: " + total);
        // imprime a soma de todos os salarios;
        //        
//        a.setCpf(123456789L);
//        a.setNome("123");
//        a.setNascimento(LocalDate.of(2002, 4, 18));
//        System.out.println("> " + a);
//        Horista b = new Horista(2F, 100F);
//        b.setCpf(1234789L);
//        System.out.println("> " + b);
//        System.out.println("> " + b.calcuaSalario());
//        System.out.println("> " + c);
//        System.out.println("> " + c.calculaSalario());
    }
}

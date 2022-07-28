package br.edu.ifsul.controller;

import br.edu.ifsul.model.Conta;
import br.edu.ifsul.model.ContaConjunta;
import br.edu.ifsul.model.ContaPoupanca;

public class ContaController {
    public static void main(String[] args){
        //    Conta conta1 = new Conta(); nao pode instanciar pq é  abstrato
        ContaPoupanca cp1 = new ContaPoupanca();
        System.out.println(cp1);
        cp1.deposita(5000);
        System.out.println(cp1);


        ContaPoupanca cp2 = new ContaPoupanca(1000.00);
        System.out.println(cp2);
        cp2.saca(500);
        System.out.println(cp2);

        ContaConjunta cc1 = new ContaConjunta();
        System.out.println(cc1);
        cc1.deposita(2000);
        System.out.println(cc1);
        cc1.saca(5000);
        System.out.println(cc1);
    }
}

package controller;

import models.Associado;
import models.ContaCorrente;
import models.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    public static void main(String[] args){
        ContaPoupanca contaPoupanca1 = new ContaPoupanca();
        ContaPoupanca contaPoupanca2 = new ContaPoupanca();
        ContaPoupanca contaPoupanca3 = new ContaPoupanca();

        ContaCorrente contaCorrente1 = new ContaCorrente();
        ContaCorrente contaCorrente2 = new ContaCorrente();
        ContaCorrente contaCorrente3 = new ContaCorrente();

        Associado associado1 = new Associado();
        Associado associado2 = new Associado();
        Associado associado3 = new Associado();

        AssociadoVip associadoVip 


        System.out.println(contaPoupanca1);
        System.out.println(contaPoupanca2);
        System.out.println(contaPoupanca3);

        System.out.println(contaCorrente1);
        System.out.println(contaCorrente2);
        System.out.println(contaCorrente3);

        System.out.println(associado1);
        System.out.println(associado2);
        System.out.println(associado3);

        List<ContaCorrente> contaCorrenteList = new ArrayList<>();
        contaCorrenteList.add(contaCorrente1);
        contaCorrenteList.add(contaCorrente2);
        contaCorrenteList.add(contaCorrente3);

        List<ContaPoupanca> contaPoupancaList = new ArrayList<>();
        contaPoupancaList.add(contaPoupanca1);
        contaPoupancaList.add(contaPoupanca2);
        contaPoupancaList.add(contaPoupanca3);

    }
}

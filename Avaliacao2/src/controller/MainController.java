package controller;

import models.Associado;
import models.ContaCorrente;
import models.ContaPoupanca;
import models.Conta;
import models.AssociadoVip;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainController {
    public static void main(String[] args){
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(100);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(200);
        ContaPoupanca contaPoupanca3 = new ContaPoupanca(300);

        ContaCorrente contaCorrente1 = new ContaCorrente(400, 20);
        ContaCorrente contaCorrente2 = new ContaCorrente(500, 30);
        ContaCorrente contaCorrente3 = new ContaCorrente(600, 40);

        Associado associado1 = new Associado("vagner", 50);
        Associado associado2 = new Associado("ana", 60);
        Associado associado3 = new Associado("marcelo", 70);


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

        List<Associado>  associadoList = new ArrayList<>();
        associadoList.add(associado1);
        associadoList.add(associado2);
        associadoList.add(associado3);


        System.out.println(contaPoupanca1);
        contaPoupanca1.deposita(1000);
        System.out.println("pos deposito " + contaPoupanca1);
        contaPoupanca1.atualiza(5);
        System.out.println("pos taxa " + contaPoupanca1);
        contaPoupanca1.saca(50);
        System.out.println("pos saque " + contaPoupanca1);

        System.out.println(contaCorrente1);
        contaCorrente1.deposita(500);
        System.out.println("pos deposito " + contaCorrente1);
        contaCorrente1.saca(400);
        System.out.println("pos saque " + contaCorrente1);

        List<AssociadoVip> associadoVipList = new ArrayList<>();
        associadoVipList.add(contaCorrente1);
        associadoVipList.add(contaCorrente2);
        associadoVipList.add(contaCorrente3);
        associadoVipList.add(associado1);
        associadoVipList.add(associado2);
        associadoVipList.add(associado3);


        System.out.println("\nOrdenando");
        associadoVipList.sort(Comparator.comparing(AssociadoVip::getCota).reversed());
        System.out.println(associadoVipList);

        System.out.println("\nCom maior numero de cotas");
        double maxCotas = associadoVipList.stream().max(Comparator.comparing(AssociadoVip::getCota)).get().getCota();
        for(AssociadoVip associado:associadoVipList) {
            if (associado.getCota() == maxCotas) {
                System.out.println(associado);
            }
        }


        List<Conta> contas = new ArrayList<>();
        contas.add(contaCorrente1);
        contas.add(contaCorrente2);
        contas.add(contaCorrente3);
        contas.add(contaPoupanca1);
        contas.add(contaPoupanca2);
        contas.add(contaPoupanca3);
        System.out.println(contas);

        System.out.println("\nContas ordenadas");
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println(contas);

        System.out.println("\nVip com conta");
        for (AssociadoVip associado : associadoList) {
            if (associado instanceof ContaCorrente) {
                System.out.println(associado);
            }
        }
    }
}

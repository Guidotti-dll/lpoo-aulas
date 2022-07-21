package br.edu.ifsul.exec1.models;

import java.text.NumberFormat;

public class Conta {
    private double saldo;


    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo = valor + this.saldo ;
    }

    public void sacar(double valor) {
        double newSaldo = this.saldo - valor;
        if(newSaldo > 0){
            this.saldo = newSaldo;
        }
    }

//    public void atualiza(double taxa){
//
//    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + NumberFormat.getCurrencyInstance().format(saldo) +
                '}';
    }
}

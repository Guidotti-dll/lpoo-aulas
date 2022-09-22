package models;

import java.text.NumberFormat;

public abstract class Conta {

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor){
        double newSaldo = this.saldo - valor;
        if(newSaldo >= 0){
            this.saldo = newSaldo;
        }
    }

    public void atualiza(double taxa){
        this.saldo = this.saldo + (this.saldo * (taxa/100));
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}

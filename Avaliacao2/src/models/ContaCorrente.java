package models;

import java.text.NumberFormat;

public class ContaCorrente extends Conta implements AssociadoVip{

    private int cota;

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }
    public ContaCorrente(double saldo, int cota) {
        super(saldo);
        this.cota = cota;
    }
    @Override
    public double lucros(int qntCotas, double valorCota) {
        double lucros = qntCotas * valorCota;
        return lucros;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "cota=" + cota +
                ", saldo=" + NumberFormat.getCurrencyInstance().format(saldo) +
                '}';
    }
}

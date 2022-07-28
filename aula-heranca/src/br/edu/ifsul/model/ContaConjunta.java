package br.edu.ifsul.model;

public class ContaConjunta extends Conta{

    @Override
    public void saca(double valor){
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }
}

package br.edu.edu.exec3.model;

public class Gerente extends Funcionario{

    public Gerente() {
        super();
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.salario * (20 /100);
    }
}

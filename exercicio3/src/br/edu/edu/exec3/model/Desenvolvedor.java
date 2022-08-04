package br.edu.edu.exec3.model;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor() {
        super();
    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.salario * (5/100);
    }
}

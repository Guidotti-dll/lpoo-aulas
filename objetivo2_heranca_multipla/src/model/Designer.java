package model;

public class Designer extends Funcionario{
    public Designer() {
        super();
    }

    public Designer(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.01;
    }

    @Override
    public String toString() {
        return "Designer{" +
                ", nome='" + getNome() + '\'' +
                ", salario='" + getSalario() + '\'' +
                '}';
    }
}

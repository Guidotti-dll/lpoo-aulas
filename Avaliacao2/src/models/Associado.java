package models;

public class Associado implements AssociadoVip{
    private String nome;
    private int cota;


    public Associado() {
    }

    public Associado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double lucros(int qntCotas, double valorCota) {
        double lucros = qntCotas * valorCota;
        return lucros;
    }

    @Override
    public String toString() {
        return "Associado{" +
                "nome='" + nome + '\'' +
                ", cota=" + cota +
                '}';
    }
}

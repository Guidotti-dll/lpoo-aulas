package models;

public class Associado implements AssociadoVip{
    private String nome;
    private double cotaValue;
    private int cota;


    public Associado() {
    }

    public Associado(String nome) {
        this.nome = nome;
    }

    public Associado(String nome, int cota) {
        this.nome = nome;
        this.cota = cota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCotaValue() {
        return cotaValue;
    }

    public void setCotaValue(double cotaValue) {
        this.cotaValue = cotaValue;
    }

    @Override
    public int getCota() {
        return cota;
    }

    public void setCota(int cota) {
        this.cota = cota;
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

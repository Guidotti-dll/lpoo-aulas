package models;

public class Gerente extends Funcionario{
    private String formacao;

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Gerente() {
    }

    public Gerente(String formacao) {
        this.formacao = formacao;
    }

    public Gerente(int matricula, String nome, String endereco, String bairro, String cidade, String estado, String cep, String formacao) {
        super(matricula, nome, endereco, bairro, cidade, estado, cep);
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "formacao='" + formacao + '\'' +
                "matricula=" + getMatricula() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", bairro='" + getBairro() + '\'' +
                ", cidade='" + getCidade() + '\'' +
                ", estado='" + getEstado() + '\'' +
                '}';
    }
}


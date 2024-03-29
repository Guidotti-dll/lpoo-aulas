package models;

import java.util.List;

public class Fornecedor {
    private String cnpj;
    private String contato;
    private String nome;
    private List<Produto> produtos;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String contato, String nome, List<Produto> produtos) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "cnpj='" + cnpj + '\'' +
                ", contato='" + contato + '\'' +
                ", nome='" + nome + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}

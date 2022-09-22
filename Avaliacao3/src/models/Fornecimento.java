package models;

import java.util.Date;

public class Fornecimento {
    private Date data;
    private double valorTotal;
    private Produto produto;
    private Fornecedor fornecedor;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Fornecimento() {
    }

    public Fornecimento(Date data, Produto produto, Fornecedor fornecedor, int quantidade) {
        this.data = data;
        this.valorTotal = produto.getPreco() * quantidade;
        this.produto = produto;
        this.fornecedor = fornecedor;

        produto.setQuantidade(produto.getQuantidade() + quantidade);

    }

    @Override
    public String toString() {
        return "\nFornecimento{" +
                "data=" + data +
                ", valorTotal=" + valorTotal +
                ", produto=" + produto +
                ", fornecedor=" + fornecedor +
                '}' +"\n";
    }

}

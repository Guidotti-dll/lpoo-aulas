package models;

public class Item {
    private String codItem;
    private double desconto;
    private int quantidade;
    private Produto produto;

    private double valor;



    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Item() {
    }

    public Item(String codItem, double desconto, Produto produto, int quantidade) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.valor = produto.getPreco() * quantidade;
        this.quantidade = quantidade;

        if(produto.getQuantidade() >= quantidade){
            produto.setQuantidade(produto.getQuantidade() - quantidade);
        }
        else{
            throw new Excecao.EstoqueInsuficienteException();
        }
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "codItem='" + codItem + '\'' +
                ", desconto=" + desconto +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }
}

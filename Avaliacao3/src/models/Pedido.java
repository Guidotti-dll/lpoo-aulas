package models;

import java.util.List;
import java.util.Date;

public class Pedido {
    private int numero;
    private Date data;
    private double valor;
    private Tipo tipo;
    private Vendedor vendedor;
    private List<Item> itens;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pedido() {
    }

    public Pedido(int numero, Date data, double valor, Tipo tipo, Vendedor vendedor, List<Item> itens) {
        this.numero = numero;
        this.valor = valor;
        this.data = data;
        this.vendedor = vendedor;
        this.itens = itens;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", tipo=" + tipo +
                ", vendedor=" + vendedor +
                ", itens=" + itens +
                '}';
    }
}

package br.edu.ifsul.exec1.controllers;

import br.edu.ifsul.exec1.models.Produto;

public class ProdutoController {
    public static void main(String[] args){
        Produto produtoSimple = new Produto();
        Produto produtoFull = new Produto("Computador", "MacBook M1 Pro 16Gb", 14500, 10);

        System.out.println(produtoSimple.toString());
        System.out.println(produtoFull.toString());

        produtoSimple.setNome("Celular");
        produtoSimple.setDescricao("Iphone 10");
        produtoSimple.setValor(3500.49);
        produtoSimple.setEstoque(5);

        System.out.println(produtoSimple.toString());

        produtoSimple.setNome("Notebook");
        produtoSimple.setDescricao("Macbook M2 8Gb");
        produtoSimple.setValor(12300.29);
        produtoSimple.setEstoque(15);

        System.out.println(produtoFull.toString());
    }
}

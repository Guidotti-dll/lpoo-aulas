package controller;


import models.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class mainController {
    public static void main(String[] args) {

        Produto product1 = new Produto("159", "Coca-cola 2L", 18, 7.5);
        Produto product2 = new Produto("753", "Fandangos 400g", 25, 4.0);
        System.out.println(product1);
        System.out.println(product2);

        List<Produto> productList = new ArrayList<>();
        productList.add(product1);

        Item item1 = new Item("16", 0, product1, 1);
        Item item2 = new Item("48", 0, product2, 2);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);

        Vendedor seller = new Vendedor(134, "Ivano", "Rua Rui Barbosa", "Jardim America", "96160-000", "Capão do Leão", "RS", "Jardim America");

        //Pedidos
        Pedido order1 = new Pedido(1,new Date(10L), 10, Tipo.atendindo, seller, itemList);
        Pedido order2 = new Pedido(2,new Date(10L), 11, Tipo.atendindo, seller, itemList);

        List<Pedido> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);

        seller.setPedidos(orderList);

        System.out.println("\nPedidos");
        System.out.println(orderList);

        //Fornecimento
        Fornecedor provider = new Fornecedor("1709", "ivano@contato.com", "Mini Mercado Guidotti", productList);

        Fornecimento supply1 = new Fornecimento(new Date(10L), product1, provider, 10);
        Fornecimento supply2 = new Fornecimento(new Date(10L), product2, provider, 15);


        System.out.println("\nPós fornecimento");
        List<Fornecimento> supplyList = new ArrayList<>();
        supplyList.add(supply1);
        supplyList.add(supply2);

        System.out.println(product1);
        System.out.println(product2);

        System.out.println(supplyList);
        double sum = 0;
        for (Fornecimento supply:supplyList) {
            sum +=  supply.getValorTotal();
        }
        System.out.println("Fornecimento total: R$" + sum);


        System.out.println("\nGerando exceção");
        Item item3 = new Item("56", 2, product2, 76);

    }
}

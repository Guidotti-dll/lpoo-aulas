package br.edu.ifsul.exec1.controllers;

import  br.edu.ifsul.exec1.models.Carro;

public class CarroController {
    public static void main(String[] args){
        Carro carroSimple = new Carro();
        Carro carroFull = new Carro("Ford", "Verona", 1500);

        System.out.println(carroSimple.toString());
        System.out.println(carroFull.toString());

        carroSimple.setMarca("Honda");
        carroSimple.setModelo("Civic");
        carroSimple.setAnoFabricacao(2015);
        System.out.println(carroSimple.toString());

        carroFull.setMarca("VolksWagen");
        carroFull.setModelo("Gol");
        carroFull.setAnoFabricacao(2007);

        System.out.println(carroFull.toString()

        );
    }

}

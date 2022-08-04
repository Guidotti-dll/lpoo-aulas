package controller;

import model.Desenvolvedor;
import model.Designer;
import model.Funcionario;
import model.Gerente;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioInvenstidorController {
    public static void main(String [] args){
        Desenvolvedor d1 = new Desenvolvedor("Ana", 2000.00);
        Gerente g1 = new Gerente("Rafael", 4000.00);
        Designer dg1 = new Designer("Tiago", 1000.00);

        System.out.println(d1);
        System.out.println(g1);
        System.out.println(dg1);


        System.out.println("\n Folha salarial da startup");
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(d1);
        funcionarios.add(g1);
        funcionarios.add(dg1);

        double acum = 0;

        //funcionarios.forEach(f -> {
        //    acum += f.getSalario()
        //}); não aceita usar item fora do escopo

        for(Funcionario f : funcionarios){
            acum+= f.getSalario();
            System.out.println("Nome: " + f.getNome() + " - Salario: " + f.getSalario() + " - Bonus: " + f.getBonus());

        }

        System.out.println("Valor total: " + acum);

    }
}

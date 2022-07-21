package br.edu.ifsul.exec1.controllers;

import br.edu.ifsul.exec1.models.Funcionario;

public class FuncionarioController {
    public static void main(String[] args){
        Funcionario funcionarioSimple = new Funcionario();
        Funcionario funcionarioFull = new Funcionario("Carlos",1060.50);

        System.out.println(funcionarioSimple.toString());
        System.out.println(funcionarioFull.toString());

        funcionarioSimple.setNome("Vagner");
        funcionarioSimple.setSalario(1508.68);

        System.out.println(funcionarioSimple.toString());

        funcionarioFull.setNome("Carlos Costa");
        funcionarioFull.setSalario(1200);
        System.out.println(funcionarioFull.toString());
    }
}

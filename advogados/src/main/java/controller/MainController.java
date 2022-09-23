package controller;

import dao.AdvogadoDAO;
import model.Advogado;

import java.util.Scanner;

public class MainController {


    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 0;
        do {
            System.out.print("\n\"[**  Advogados  **]\"");
            System.out.print(
                "\n1. Listar advogados" +
                "\n2. Buscar advogado pelo OAB" +
                "\n3. Contratar advogado" +
                "\n4. Atualizar dados do advogado" +
                "\n5. Promover associado a cliente" +
                "\nOpção (Zero p/sair): ");
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    selectAllAdvogados();
                    break;
                case 2:
                    selectAdvogadoByOAB();
                    break;
                case 3:
                    contratar();
                    break;
                case 4:
                    atualizar();
                    break;
                case 5:
                    demitir();

                    break;
                default:
                    if (option != 0)
                        System.out.println("Opção inválida.");
            }
        } while (option != 0);

    }

    private static void selectAllAdvogados() {
        System.out.println("\nAdvogados da empresa:\n" + AdvogadoDAO.selectAllAdvogados());
    }

    private static void selectAdvogadoByOAB() {
        System.out.print("\nDigite o OAB do advogado: ");
        Advogado advogado = AdvogadoDAO.selectAdvogadoById(input.nextLong());
        input.nextLine();
        if(advogado != null){
            System.out.println(advogado);
        }else{
            System.out.println("Código não localizado.");
        }
    }
    private static void contratar() {
        Advogado advogado = new Advogado();
        System.out.println("\n[ Contratação de novo associado  ]");
        System.out.print("Digite o nome do advogado: ");
        advogado.setNomeAdvogado(input.nextLine());
        System.out.print("Digite o cep do advogado: ");
        advogado.setCepAdvogado(input.nextLine());
        System.out.print("Digite o bairro do advogado: ");
        advogado.setBairroAdvogado(input.nextLine());
        System.out.print("Digite o endereço do advogado: ");
        advogado.setEnderecoAdvogado(input.nextLine());
        System.out.print("Digite o telefone do advogado: ");
        advogado.setTelefoneAdvogado(input.nextLine());
        System.out.print("Digite o email do advogado: ");
        advogado.setEmailAdvogado(input.nextLine());


        if(AdvogadoDAO.insertAdvogado(advogado)) {
            System.out.println("\nAdvogado contratado com sucesso!!!");
        }else {
            System.out.println("\nHouve um erro ao salvar a contratação do advogado. Tente novamente mais tarde!");
        }
    }

    private static void atualizar() {
        System.out.println("\n[ Alterar dados do cadastro de um advogado ]");
        Advogado advogado = null;
        int opcao = 0;
        do{
            System.out.print("\nDigite o OAB do advogado (Zero p/sair): ");
            long oab = input.nextLong();
            input.nextLine();
            if(oab == 0) {
                opcao = 0;
            } else {
                advogado = AdvogadoDAO.selectAdvogadoById(oab);
                if(advogado == null){
                    System.out.println("OAB inválido.");
                }else{
                    System.out.println("Nome: " + advogado.getNomeAdvogado());
                    System.out.print("Alterar? (0-sim/1-não) ");

                    if(input.nextInt() == 0){
                        input.nextLine();
                        System.out.println("Digite o novo nome do advogado: ");
                        advogado.setNomeAdvogado(input.nextLine());
                    }

                    System.out.println("CEP: " + advogado.getCepAdvogado());
                    System.out.print("Alterar? (0-sim/1-não) ");

                    if(input.nextInt() == 0){
                        input.nextLine();
                        System.out.println("Digite o novo CEP do advogado: ");
                        advogado.setCepAdvogado(input.nextLine());
                    }

                    System.out.println("Bairro: " + advogado.getBairroAdvogado());
                    System.out.print("Alterar? (0-sim/1-não) ");

                    if(input.nextInt() == 0){
                        input.nextLine();
                        System.out.println("Digite o novo bairro do advogado: ");
                        advogado.setBairroAdvogado(input.nextLine());
                    }

                    System.out.println("Endereço: " + advogado.getEnderecoAdvogado());
                    System.out.print("Alterar? (0-sim/1-não) ");

                    if(input.nextInt() == 0){
                        input.nextLine();
                        System.out.println("Digite o novo endereço do advogado: ");
                        advogado.setEnderecoAdvogado(input.nextLine());
                    }

                    System.out.println("Telefone: " + advogado.getTelefoneAdvogado());
                    System.out.print("Alterar? (0-sim/1-não) ");

                    if(input.nextInt() == 0){
                        input.nextLine();
                        System.out.println("Digite o novo telefone do advogado: ");
                        advogado.setTelefoneAdvogado(input.nextLine());
                    }

                    System.out.println("Email: " + advogado.getEmailAdvogado());
                    System.out.print("Alterar? (0-sim/1-não) ");

                    if(input.nextInt() == 0){
                        input.nextLine();
                        System.out.println("Digite o novo email do advogado: ");
                        advogado.setEmailAdvogado(input.nextLine());
                    }


                    if(AdvogadoDAO.updateAdvogado(advogado)){
                        System.out.println("Dados do advogado salvos:" + advogado);
                    }else{
                        System.out.println("Erro ao tentar atualizar dados do advogado. Tente novamente mais tarde!!");
                    }
                    opcao = 1;
                }

            }
        }while(opcao != 0);
    }

    private static void demitir() {
        System.out.println("\n[ Promover advogado a cliente ]");
        Advogado advogado = null;
        int opcao = 0;
        do{
            System.out.print("\nDigite o OAB do advogado (Zero p/sair): ");
            long oab = input.nextLong();
            input.nextLine();
            if(oab == 0) {
                opcao = 0;
            } else {
                advogado = AdvogadoDAO.selectAdvogadoById(oab);
                if(advogado == null){
                    System.out.println("OAB inválido.");
                }else{

                    System.out.print("Remover? (0-sim/1-não) ");
                    if(input.nextInt() == 0){
                        if(AdvogadoDAO.deleteAdvogado(oab)){
                            System.out.println("Advogado removido com sucesso");
                        }else{
                            System.out.println("Erro ao tentar desligar o advogado da empresa. Tente novamente mais tarde!!");
                        }
                    }



                    opcao = 1;
                }

            }
        }while(opcao != 0);
    }


}

package Simulacoes.Bancaria;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double saldo = 0;
        int opcao;
        double valorDeposito;
        double valorSaque;

        while (true) {
        // Loop infinito para manter o programa em execução até que o usuário decida sair

            System.out.println("----------------");
            System.out.println("** MENU **");
            System.out.println("1 > DEPOSITAR;");
            System.out.println("2 > SACAR;");
            System.out.println("3 > CONSULTAR SALDO;");
            System.out.println("0 > ENCERRAR.");
            System.out.println("----------------");
            System.out.print("Por favor, digite uma das opções acima: ");
            opcao = sc.nextInt();
            System.out.println(" ");

            switch (opcao) {
                case 1:
                // Depósito
                    System.out.print("Informe o valor a depositar: ");
                    valorDeposito = sc.nextDouble();
                    System.out.println("---------------------------");
                    System.out.println("REALIZANDO DEPÓSITO...");
                    System.out.println(" ");

                    saldo += valorDeposito; // saldo se torna valorDepósito informado

                    System.out.println("DEPÓSITO REALIZADO COM SUCESSO!");
                    break;

                case 2:
                // Saque
                    System.out.print("Informe o valor a sacar: ");
                    valorSaque = sc.nextDouble();
                    System.out.println("-----------------------");
                    System.out.println("REALIZANDO SAQUE...");

                    if (valorSaque <= saldo) { // SE valorSaque for menor ou igual a saldo, faça:

                        saldo -= valorSaque; // saldo subtrai valorSaque informado
                        System.out.println(" ");
                        System.out.println("SAQUE REALIZADO COM SUCESSO!");

                    } else { // Se valorSaque for maior que saldo, faça:

                        System.out.println(" ");
                        System.out.println("!!! ERROR !!!");
                        System.out.println("SALDO INSUFICIENTE.");

                    }
                    break;

                case 3:
                // Consultar saldo
                    System.out.println("--------------------");
                    System.out.println("VERIFICANDO SALDO...");
                    System.out.println(" ");
                    System.out.println("SALDO ATUAL: " + saldo);
                    break;

                case 0:
                // Encerrar programa
                    System.out.println("ENCERRANDO PROGRAMA...");
                    System.out.println(" ");
                    System.out.println("PROGRAMA ENCERRADO.");
                    System.out.println("OBRIGADA PELA PARTICIPAÇÃO!");
                    System.out.println("---------------------------");
                    sc.close();
                    return;
                    // Termina o método main e encerra o programa

                default:
                // Opção inválida
                    System.out.println("!!! ERROR !!!");
                    System.out.println("OPÇÃO INVÁLIDA.");
                    System.out.println(" ");
                    System.out.println("Por favor, tente novamente:");
                    break;
            }
        }
    }
}

package Simulacoes.Bancaria;
import java.util.Scanner;

public class NumeroConta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        String numero;

        System.out.println("----------------");
        System.out.println("BEM VINDO!");
        System.out.println("----------------");
        System.out.print("Digite seu nome: ");
        nome = sc.next();
        System.out.println("----------------");
        System.out.print(nome + ", insira o número da sua conta bancária: ");
        numero = sc.next();
        System.out.println("ANALISANDO...");
        System.out.println(" ");

        try {
            verificarNumero(numero);
            System.out.println("NÚMERO DE CONTA VÁLIDO!");
            System.out.println("----------------");

            System.out.println("Segue abaixo informações que obtive sobre você: ");
            System.out.println("> NOME: " + nome);
            System.out.println("> CONTA BANCÁRIA: " + numero);
            System.out.println("----------------");

        } catch (IllegalArgumentException e) {
            System.out.println("!!! ERROR !!!");
            System.out.println(e.getMessage());

            sc.close();
        }
    }

    private static void verificarNumero(String numeroConta) {

        int contadorNumero;
        int numeroDigitado;

        contadorNumero = numeroConta.length(); // Verifique se "numero" tem exatamente 8 dígitos
        numeroDigitado = 0;

        for (int i = 0; i < contadorNumero; i++) { // Conta "numero" de 1 em 1
            numeroDigitado++;

        }

        if (numeroDigitado != 8) { // Implementa uma exceção, caso "numero" não tenha 8 dígitos
            throw new IllegalArgumentException("CONTA INVÁLIDA, POR FAVOR DIGITE EXATAMENTE 8 NÚMEROS.");

        }
    }
}
package Aulas_JavaPOO;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Aula23 {

    public static void main(String[] args) {

        try { // TENTE:
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            String nome;
            String sobrenome;
            int idade;
            Double altura;

            System.out.print("Digite seu nome: ");
            nome = sc.next();
            System.out.print("Digite seu sobrenome: ");
            sobrenome = sc.next();
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();
            System.out.print("Digite sua altura: ");
            altura = sc.nextDouble();

            System.out.println("------------------------------------");
            System.out.println("Olá, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");

        } catch (InputMismatchException e) { // SE DER ERRO, MOSTRE:
            System.out.println("------------------------------------");
            System.out.println("!!!! ERRO !!!!");
            System.out.println("Os campos idade e altura precisam ser numéricos.");
            System.out.println("Tente novamente!");
            System.out.println("------------------------------------");
        }
    }
}
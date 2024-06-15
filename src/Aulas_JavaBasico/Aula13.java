package Aulas_JavaBasico;

import java.util.Scanner;

public class Aula13 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.println("Digite sua nota: ");
        nota = sc.nextInt();

        if (nota >= 7) { // SE nota for maior ou igual a sete, faça:
            System.out.println("Aprovado.");
        }
        else if (nota >= 5 && nota < 7) { // OU SE nota for >= a 5 e < que 7, faça:
            System.out.println("Recuperação.");
        }
        else { // SE NÃO, faça:
            System.out.println("Reprovado.");
        }
    }
}
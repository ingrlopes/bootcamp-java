package Aulas_JavaBasico;

import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.println("Insira a sua nota: ");
        nota = sc.nextInt();

        if (nota >= 7) { // SE nota for maior ou igual a sete, execute:
            System.out.println("Aprovado.");
        }
        else { // SE NÃO, execute:
            System.out.println("Reprovado.");
        }
    }
}
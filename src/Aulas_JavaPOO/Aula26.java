package Aulas_JavaPOO;

import java.util.Scanner;

public class Aula26 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 10: ");
        int numero = sc.nextInt();
        sc.close();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial do número " + numero + " é " + fatorial);
    }
}
package Aulas_JavaPOO;

import java.util.Scanner;

public class Aula30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade, contMenor18 = 0;

        for (int cont = 1; cont <= 10; cont ++) {

            System.out.println("Informe a idade da pessoa " + cont);
            idade = sc.nextInt();

            if (idade < 18) {
                contMenor18 ++;

            }
        }
        System.out.println("Total de pessoas com idade abaixo de 18 anos: " + contMenor18);
    }
}
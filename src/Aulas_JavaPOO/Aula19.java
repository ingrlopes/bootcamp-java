package Aulas_JavaPOO;

import java.util.Scanner;

public class Aula19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print("Digite o número:");
        for(i = sc.nextInt(); i <= 5; i++) {
            // contador é igual a nextInt;
            // enquanto contador for menor ou igual a 5, conte;
            // conte de 1 em 1.
            if(i == 3) {
                continue;
                // se o contador for igual a 3, não conte ele e continue.
            }
            System.out.println(i);
        }
    }
}
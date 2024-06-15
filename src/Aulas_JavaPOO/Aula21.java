package Aulas_JavaPOO;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Aula21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double mesada;
        double valorGasto;

        System.out.println("------------------------------");
        System.out.print("Digite o valor da sua mesada: ");
        mesada = sc.nextDouble();
        System.out.print("Digite o valor que deseja gastar: ");
        valorGasto = sc.nextDouble();

        while(mesada > valorGasto) { // ENQUANTO mesada for maior que valor gasto, faça:
            Double valorDoce = valorAleatorio(); // Valores dos doces são aleatórios

            if(valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho!");
            mesada = mesada - valorDoce;
        }
        System.out.println("------------------------------");
        System.out.println("Mesada: " + mesada);
        System.out.println("Valor gasto: " + valorGasto);
    }
    private static double valorAleatorio() { // Números aleatorios de 2 a 15
        return ThreadLocalRandom.current().nextDouble(2, 8); // Doces de 2 a 15 reais
    }
}
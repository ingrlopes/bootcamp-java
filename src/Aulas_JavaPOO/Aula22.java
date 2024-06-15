package Aulas_JavaPOO;

import java.util.Random;

public class Aula22 {

    public static void main(String[] args) {

        System.out.println("Discando...");
        System.out.println("-------------------");

        do { // FAÇA ENQUANTO estiver na ação tocando()
            System.out.println("!!! Tocando !!!");
            System.out.println("!!! Tocando !!!");
            System.out.println("!!! Tocando !!!");
        } while(tocando());

        System.out.println("Alô?!"); // Aparece somente quando a ação tocando() for verdadeira
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        System.out.println("-------------------");
        return !atendeu; // Parando com a ação tocando()
    }
}
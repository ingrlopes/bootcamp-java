package Aulas_JavaBasico;

import java.util.Scanner;

public class Aula14 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int nota;
        String resultado;

        System.out.println("Digite sua nota: ");
        nota = sc.nextInt();

        // SE nota for maior ou igual a 7, mostre "Aprovado."
        // SE NÃO, mostre "Reprovado."
        resultado = nota >= 7 ?"Aprovado." : "Reprovado.";

        System.out.println(resultado);
    }
}

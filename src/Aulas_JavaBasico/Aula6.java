package Aulas_JavaBasico;
import java.util.Scanner;

public class Aula6 {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;
        boolean simNao;

        System.out.print("Digite o número 1: ");
        a = sc.nextInt();
        System.out.print("Digite o número 2: ");
        b = sc.nextInt();

        simNao = a == b; // == mesma coisa que 'igual a'
        System.out.println("Número 1 é igual a número 2? " + simNao);

        simNao = a != b; // != mesma coisa que 'diferente de'
        System.out.println("Número 1 é diferente do número 2? " + simNao);

        simNao = a > b; // > mesma coisa que 'maior que'
        System.out.println("Número 1 é maior que o número 2? " + simNao);

        simNao = a < b; // < mesma coisa que 'menor que'
        System.out.println("Número 1 é menor que o número 2?" + simNao);
    }
}
package Aulas_JavaBasico;
import java.util.Scanner;

public class Aula5 {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        String resultado = a==b ?"Verdadeiro" :"Falso"; // == é o mesmo que 'igual a'
        // ? : é o mesmo que if (?) else (:) para operações boolean
        System.out.println(resultado);
    }
}
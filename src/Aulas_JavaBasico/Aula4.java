package Aulas_JavaBasico;
import java.util.Scanner;

public class Aula4 {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;
        String resultado;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        if(a==b) { // == é o mesmo que "igual a"
            resultado = "verdadeiro";
        }
        else {
            resultado = "falso";
        }
        System.out.println(resultado);
    }
}
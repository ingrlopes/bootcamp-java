package Aulas_JavaBasico;

import java.util.Scanner;

public class Aula15 {
    static public void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        String sigla;

        System.out.println("Digite a sigla: ");
        sigla = sc.next();

        switch (sigla) {
            case "P": { // CASO sigla for igual "P", faça:
                System.out.println("Pequeno.");
                break;
            }
            case "M": { // CASO sigla for igual "M", faça:
                System.out.println("Médio.");
                break;
            }
            case "G" : { // CASO sigla for igual "G", faça:
                System.out.println("Grande.");
                break;
            }
            default: // PADRÃO é igual a:
                System.out.println("INDEFINIDO.");
        }
    }
}

package Contador_Parametros;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int numb1, numb2;

        System.out.println("-----------------------");
        System.out.println("BEM VINDO AO CONTADOR!");
        System.out.println("-----------------------");

        // Primeiro parametro.
        System.out.print("Digite o primeiro número:");
        numb1 = sc.nextInt();

        // Segundo parametro.
        System.out.print("Digite o segundo número: ");
        numb2 = sc.nextInt();

        System.out.println("-----------------------");
        System.out.println("INICIANDO CONTAGEM...");
        System.out.println("-----------------------");

        // Caso o PRIMEIRO valor seja menor que o SEGUNDO
        try {
            // Chamando o método contendo a lógica de contagem
            contar(numb1, numb2);

        } catch (ParametrosException e) { // Caso "numb1" seja maior que "numb2"
            // Mostrar mensagem: O segundo parâmetro deve ser maior que o primeiro;
            // Mostrar mensagem "error";
            System.out.println("-------------------------------");
            System.out.println("!!! Error !!!");
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------------");
        System.out.println("FIM.");
        System.out.println("-----------------------");
    }

    static void contar(int numb1, int numb2) throws ParametrosException { // Validar se numb1 é MAIOR que numb2 e lançar a exceção:

        if (numb1 > numb2) {
            throw new ParametrosException("O segundo número deve ser maior que o primeiro");

        } for(int i = numb1; i <= numb2; i++) { // For para mostrar os números com base na variável contagem
            System.out.println("Número: " + i);

        }
    }
}
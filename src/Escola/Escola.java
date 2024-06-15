package Escola;
import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("--------------------");
        System.out.println("BEM VINDO(A)!");
        System.out.println(" ");
        System.out.print("Por favor, insira seu nome: ");
        // pegando nome digitado
        aluno.setNome(sc.next());
        System.out.print("Digite a sua idade: ");
        // pegando idade digitado
        aluno.setIdade(sc.nextInt());
        System.out.println("--------------------");
        // mostrando nome e idade digitados
        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos de idade.");
    }
}
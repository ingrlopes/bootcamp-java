package Aulas_JavaPOO;

import java.util.Scanner;

public class Aula25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] alunos = {"Camila", "Luan", "Luiz", "Bruna"};
        double media = mediaTurma(alunos, sc);

        System.out.printf("Média da turma --> %.2f", media);
    }

    public static double mediaTurma(String[] alunos, Scanner sc) {

        double soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno); // Nota do aluno + "alunos", seguindo a ordem dada
            double nota = sc.nextDouble();
            soma += nota;
            // += é o mesmo que: "soma" + todas as "notas" inseridas
        }
        return soma / alunos.length;
        // valor total da "soma" divido pela quantidade de "alunos"
    }
}
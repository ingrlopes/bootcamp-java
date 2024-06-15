package Aulas_JavaPOO;

public class Aula17 {

    public static void main(String[] args) {

        String alunos[] = {"FERNANDA", "JONAS", "JULIO", "MARCIA"};

        for (int i = 0; i < alunos.length; i++) {
            // contador inicia no 0;
            // enquanto contador for menor que tamanho de alunos, conte;
            // conte de 1 em 1.
            System.out.println("O aluno no índice contador=" + i + " é " + alunos[i]);
        }
    }
}
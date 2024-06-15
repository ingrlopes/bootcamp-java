package Aulas_JavaBasico;

public class Aula9 {
    public static void main (String[] args) {
        /*
         * args sempre inicia no 0;
         * serve para pegar argumentos do terminal;
         * quando for utilizar int/double, sempre
         * seguir modelo abaixo.
         */

        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Meu nome é " + nome + "" + sobrenome);
        System.out.println("Tenho" + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}
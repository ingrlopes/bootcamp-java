package Aulas_JavaBasico;

public class Aula8 {
    public static void main (String [] args) {

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) { // && mesma coisa que 'e'
            System.out.print("As duas condições são verdadeiras!");
        }
        if(condicao1 || condicao2) { // || mesma coisa que 'ou'
            System.out.println("Uma das condições é verdadeira!");
        }
        System.out.println("Fim.");
    }
}
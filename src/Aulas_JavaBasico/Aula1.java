package Aulas_JavaBasico;

public class Aula1 {

    public static void main (String [] args) {

        String primeiroNome = "Ingrid";
        String segundoNome = "Lopes";
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
            System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
package Aulas_JavaPOO.Pessoa;

public class Aula29pt2 {

    public static void main(String[] args) {

        // "Aulas_JavaPOO.Pessoa ingrid = new Aulas_JavaPOO.Pessoa();
        Aula29 pessoa = new Aula29("Ingrid", "44175209840");
        // Definindo endereço de ingrid
        pessoa.setEndereco("Rua Florentino de Lima");

        System.out.println(pessoa.getNome() + "-" + pessoa.getCpf());
    }
}
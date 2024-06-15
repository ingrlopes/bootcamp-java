package Aulas_JavaPOO.Pessoa;

public class Aula29 {

    private String nome;
    private String cpf;
    private String endereco;

    // getters sempre retorna alguma váriavel
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }

    // setters sempre pega alguma váriavel
    public void setEndereco(String newEndereco) {
        this.endereco = newEndereco;
    }

    // método construtor;
    // nome sempre deve ser igual ao nome da classe
    public Aula29(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
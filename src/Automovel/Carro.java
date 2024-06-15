package Automovel;

public class Carro extends Veiculo {

    public void ligar() {
        combustivel();
        cambio();
        System.out.println("CARRO LIGADO!");
    }
    private void combustivel() {
        System.out.println("CONFERINDO COMBUSTÍVEL...");
    }
    private void cambio() {
        System.out.println("CONFERINDO CÂMBIO...");
    }
}
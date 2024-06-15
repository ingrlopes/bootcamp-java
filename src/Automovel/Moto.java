package Automovel;

public class Moto extends Veiculo {

    public void ligar() {
        combustivel();
        System.out.println("MOTO LIGADA!");
    }
    private void combustivel() {
        System.out.println("CONFERINDO COMBUSTÍVEL...");
    }
}
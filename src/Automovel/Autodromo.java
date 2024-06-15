package Automovel;
import java.util.Scanner;

public class Autodromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Moto mt03 = new Moto();
        Carro audi = new Carro();

        System.out.println("OLÁ!!");
        System.out.println("---------");
        System.out.print("Insira a placa do seu carro: ");
        audi.setPlaca(sc.next());
        audi.ligar();
        System.out.println("---------");
        System.out.print("Agora, insira a placa da sua moto: ");
        mt03.setPlaca(sc.next());
        mt03.ligar();
    }
}
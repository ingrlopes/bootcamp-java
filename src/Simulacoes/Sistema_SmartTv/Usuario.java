package Simulacoes.Sistema_SmartTv;

public class Usuario {
    public static void main (String [] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        System.out.println("--------------------------");

        smartTv.desligar();
        System.out.println("Novo status: TV Ligada? " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Status atual: TV Ligada? " + smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
    }
}
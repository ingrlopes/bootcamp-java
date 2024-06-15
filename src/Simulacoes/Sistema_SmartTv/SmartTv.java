package Simulacoes.Sistema_SmartTv;
public class SmartTv {

        boolean ligada = false;
        int canal = 1;
        int volume = 25;

        public void ligar() {
                System.out.println("Ligando TV...");
                ligada = true;
        }
        public void desligar() {
                System.out.println("Desligando TV...");
                ligada = false;
        }

        public void mudarCanal (int novoCanal) {
                System.out.println("Mudando canal...");
                canal = novoCanal;
        }
        public void subirCanal() {
                canal++;
        }
        public void descerCanal() {
                canal--;
        }

        public void aumentarVolume() {
                System.out.println("Aumentando volume...");
                volume++;
        }
        public void diminuirVolume() {
                System.out.println("Diminuindo volume...");
                volume--;
        }
}
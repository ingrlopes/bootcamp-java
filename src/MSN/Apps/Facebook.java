package MSN.Apps;

import MSN.MensagemInstantanea;

public class Facebook extends MensagemInstantanea {

    public void enviar() {
        internet();
        System.out.println("- Enviando mensagem pelo Facebook...");
    }
    public void receber() {
        System.out.println("> Mensagem recebida!");
    }
}
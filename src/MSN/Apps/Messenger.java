package MSN.Apps;

import MSN.MensagemInstantanea;

public class Messenger extends MensagemInstantanea {

    public void enviar() {
        internet();
        System.out.println("- Enviando mensagem pelo SMS...");
    }
    public void receber() {
        System.out.println("> Mensagem recebida!");
    }
}
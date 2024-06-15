package MSN.Apps;

import MSN.MensagemInstantanea;

public class Telegram extends MensagemInstantanea {

    public void enviar() {
        internet();
        System.out.println("- Enviando mensagem pelo Telegram...");
    }
    public void receber() {
        System.out.println("> Mensagem recebida!");
    }
}
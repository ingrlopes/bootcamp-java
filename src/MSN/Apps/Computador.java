package MSN.Apps;
import MSN.MensagemInstantanea;
import java.util.Scanner;

public class Computador {

    public static void main(String[] args) {

        MensagemInstantanea msn = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------");
        System.out.println("BEM VINDO!!");
        System.out.println("-----------");
        System.out.print("DIGITE O APLICATIVO DESEJADO: ");
        String app = sc.next();
        System.out.println(" ");

        if(app.equals("sms")) {
            msn = new Messenger();
        } else if(app.equals("facebook")) {
            msn = new Facebook();
        } else if(app.equals("telegram")) {
            msn = new Telegram();
        }

        msn.enviar();
        msn.receber();
    }
}
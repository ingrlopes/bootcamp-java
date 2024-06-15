package MSN;

public abstract class MensagemInstantanea {

    public abstract void enviar();
    public abstract void receber();

    protected void internet() {
        System.out.println("- Verificando conexão");
    }
}
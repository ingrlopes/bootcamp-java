package Lanchonete.Atendimento;

public class Atendente {

    public void servindo() {
        pegarLanche();
        System.out.println("SERVINDO A MESA...");
        System.out.println("MESA SERVIDA!");
    }

    private void pegarLanche() {
        System.out.println("PEGANDO O LANCHE NA COZINHA...");
    }

    public void receberPagamento() {
        System.out.println("RECEBENDO PAGAMENTO...");
        System.out.println("PEDIDO PAGO COM SUCESSO!");
    }

    private void pegarPedido() {
        System.out.println("PEGANDO PEDIDO NO BALCÃO...");
    }
}
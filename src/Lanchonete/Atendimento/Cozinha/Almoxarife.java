package Lanchonete.Atendimento.Cozinha;

public class Almoxarife {

    private void controlarEntrada() {
        System.out.println("CONTROLANDO ENTRADA DOS ITENS...");
    }
    private void controlarSaida() {
        System.out.println("CONTROLANDO SAÍDA DOS ITENS...");
    }

    // default
    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES...");
        controlarSaida();
    }

    // default
    void trocarGas() {
        System.out.println("ASSISTENTE TROCOU O GÁS!");
    }
}
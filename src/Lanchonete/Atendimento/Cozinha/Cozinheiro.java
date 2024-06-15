package Lanchonete.Atendimento.Cozinha;

public class Cozinheiro {

    private void ingredientesLanche() {
        System.out.println("ITENS SELECIONADOS: ");
        System.out.println("PÃO, SALADA, CARNE E MOLHO");
    }

    private void ingredientesSuco() {
        System.out.println("ITENS SELECIONADOS: ");
        System.out.println("FRUTA, ÁGUA");
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES...");
    }
    private void prepararLanche() {
        System.out.println("PREPARANDO LANCHE...");
    }
    private void prepararSuco() {
        System.out.println("PREPARANDO SUCO...");
    }
    private void prepararCombo() {
        prepararLanche();
        prepararSuco();
    }

    public void lancheBalcao() {
        System.out.println("ADICIONANDO LANCHE NO BALCÃO...");
        System.out.println("LANCHE ADICIONADO!");
    }

    public void sucoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO...");
        System.out.println("SUCO ADICIONADO!");
    }

    public void comboBalcao() {
        lancheBalcao();
        sucoBalcao();
    }

    private void pedirGas() {
        System.out.println("PEDINDO PARA TROCAR O GÁS");
    }
    private void trocarGas(Almoxarife almoxarife) {
        almoxarife.trocarGas();
    }
}
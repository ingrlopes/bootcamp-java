package Lanchonete;
import Lanchonete.AreaCliente.Cliente;
import Lanchonete.Atendimento.Atendente;
import Lanchonete.Atendimento.Cozinha.Cozinheiro;

public class Estabelecimento {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.lanche();
        cliente.pedido();
        cliente.conta();

        System.out.println("----------------");

        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.comboBalcao();

        System.out.println("----------------");

        Atendente atendente = new Atendente();
        atendente.servindo();
        atendente.receberPagamento();
    }
}
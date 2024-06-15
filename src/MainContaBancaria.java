import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double saldoInicial = sc.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);
        System.out.printf("Saldo atual: %.1f\n", conta.getSaldo());
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);
        System.out.printf("Saldo atual: %.1f\n", conta.getSaldo());

        sc.close();
    }
}

    // TODO: Crie uma classe ContaBanc:
    class ContaBancaria {

    // TODO: Crie uma variável para armazenar o saldo da conta
    private double saldo;

    // TODO: Crie o construtor que inicializa a conta com um saldo inicial fornecido pelo usuário:
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    // Método para realizar depósito na conta:
    public void depositar(double valor) {
        // Aqui é incrementado o saldo da conta com o valor do depósito:
        this.saldo += valor;
        // É impresso uma mensagem indicando que o depósito foi feito:
        System.out.println("Deposito feito.");
    }

    // Método para realizar saque da conta:
    public void sacar(double valor) {
        // Verificamos se valor do saque é maior que saldo disponível na conta:
        if (valor > saldo) {
            // Se for, imprime uma mensagem informando que o saque não pode ser realizado por ser insuficiente:
            System.out.println("Saldo insuficiente. Saque não realizado.");
        } else {
            // Caso contrário, realiza saque subtraindo valor do saldo da conta:
            this.saldo -= valor;
            // Imprime uma mensagem indicando que saque foi feito:
            System.out.println("Saque feito.");
        }
    }

    // Método para obter o saldo atual da conta
    public double getSaldo() {
        return saldo;
    }
}
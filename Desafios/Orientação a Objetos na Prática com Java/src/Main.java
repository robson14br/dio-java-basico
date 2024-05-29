import java.util.Scanner;

class ContaBancaria {
    private double saldo;

    // Construtor para inicializar o saldo inicial
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para realizar depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
        exibirSaldo();
    }

    // Método para realizar saque
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente. Saque não realizado.");
        } else if (valor > 0) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido.");
        }
        exibirSaldo();
    }

    // Método para exibir o saldo atual
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo inicial
        System.out.print("Informe o saldo inicial da conta: R$ ");
        double saldoInicial = scanner.nextDouble();

        // Cria uma conta bancária com o saldo inicial informado
        ContaBancaria conta = new ContaBancaria(saldoInicial);
        conta.exibirSaldo();

        // Menu para realizar transações
        while (true) {
            System.out.println("Escolha a operação: 1-Depósito, 2-Saque, 0-Sair");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                // Depósito
                System.out.print("Informe o valor do depósito: R$ ");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
            } else if (opcao == 2) {
                // Saque
                System.out.print("Informe o valor do saque: R$ ");
                double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
            } else if (opcao == 0) {
                // Sair
                System.out.println("Saindo do programa.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}

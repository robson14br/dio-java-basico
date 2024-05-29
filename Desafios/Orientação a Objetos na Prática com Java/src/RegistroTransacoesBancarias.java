import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a Entrada que informa o saldo inicial da conta
        System.out.print("Informe o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        // Lê a Entrada com a quantidade total de transações
        System.out.print("Informe a quantidade total de transações: ");
        int quantidadeTransacoes = scanner.nextInt();

        // Lista para armazenar as transações
        List<String> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Lê a Entrada com o tipo de transação (D para depósito ou S para saque)
            // O método "toUpperCase" padroniza o tipo de transação com a letra maiúscula
            System.out.print("Digite 'D' para depósito ou 'S' para saque: ");
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);
            // Lê a Entrada com o valor da transação
            System.out.print("Informe o valor da transação: ");
            double valorTransacao = scanner.nextDouble();

            // Atualiza o saldo da conta e adicionar a transação à lista
            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add("Depósito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                if (valorTransacao <= saldo) {
                    saldo -= valorTransacao;
                    transacoes.add("Saque de " + valorTransacao);
                } else {
                    System.out.println("Saldo insuficiente para esta transação.");
                    i--; // Decrementa o índice para repetir a iteração
                }
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
            }
        }

        // Exibir o saldo final e a lista de transações
        System.out.printf("Saldo: %.1f\n", saldo);
        System.out.println("Transações:");
        for (int i = 0; i < transacoes.size(); i++) {
            System.out.println((i + 1) + ". " + transacoes.get(i));
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

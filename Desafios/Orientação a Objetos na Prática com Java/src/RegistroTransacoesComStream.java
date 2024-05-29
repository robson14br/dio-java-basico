import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo inicial da conta
        System.out.print("Informe o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        // Solicita a quantidade total de transações
        System.out.print("Informe a quantidade total de transações: ");
        int quantidadeTransacoes = scanner.nextInt();

        // Lista para armazenar as transações
        List<Transacao> transacoes = new ArrayList<>();

        // Coleta cada transação do usuário
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            System.out.print("Digite 'D' para depósito ou 'S' para saque: ");
            char tipoTransacao = scanner.next().charAt(0);

            System.out.print("Digite o valor da transação: ");
            double valorTransacao = scanner.nextDouble();

            // Cria uma nova transação e adiciona à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'D' || transacao.getTipo() == 'd') {
                saldo += transacao.getValor();
            } else if (transacao.getTipo() == 'S' || transacao.getTipo() == 's') {
                saldo -= transacao.getValor();
            }
        }

        // Exibe o saldo final e a lista de transações formatada
        System.out.println("\nSaldo final da conta: " + saldo);
        System.out.println("\nTransações:");
        transacoes.stream()
                .map(transacao -> "Tipo: " + (transacao.getTipo() == 'D' ? "Depósito" : "Saque") + ", Valor: " + transacao.getValor())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}

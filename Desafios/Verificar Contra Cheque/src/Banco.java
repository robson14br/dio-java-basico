import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double LIMITE_CHEQUE_ESPECIAL = 500.0;
        
        // Solicitar o saldo atual da conta bancária
        System.out.print("Informe o saldo atual da conta bancária: ");
        double saldoAtual = scanner.nextDouble();
        
        // Solicitar o valor do saque
        System.out.print("Informe o valor do saque: ");
        double valorSaque = scanner.nextDouble();
        
        // Verificar se o saque ultrapassa o saldo disponível
        if (valorSaque <= saldoAtual) {
            System.out.println("Transação realizada com sucesso.");
        } else {
            double saldoAposSaque = saldoAtual - valorSaque;
            if (saldoAposSaque >= -LIMITE_CHEQUE_ESPECIAL) {
                System.out.println("Transação realizada com sucesso, utilizando o cheque especial.");
            } else {
                System.out.println("Transação não pode ser realizada devido ao limite excedido.");
            }
        }
        
        scanner.close();
    }
}

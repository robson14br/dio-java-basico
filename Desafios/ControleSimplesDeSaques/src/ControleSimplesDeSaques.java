import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o limite diário de saque
        System.out.print("Informe o limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();
        double totalSacado = 0;

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            System.out.print("Informe o valor do saque: ");
            double valorSaque = scanner.nextDouble();

            // Condição para encerrar transações
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (totalSacado + valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                totalSacado += valorSaque;
                System.out.println("Saque realizado. Limite restante: " + (limiteDiario - totalSacado));
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

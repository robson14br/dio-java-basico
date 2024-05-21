import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int opcao = -1; // Inicializa a variável opcao

        // Loop para manter o programa em execução até que o usuário decida sair
        while (opcao != 0) {
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");

            opcao = scanner.nextInt();

            // Implementa as condições necessárias para avaliar a opção escolhida
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para depositar:");
                    double depositar = scanner.nextDouble();
                    saldo += depositar;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor para sacar:");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close(); 
    }
}

import java.util.Scanner;

public class VerificaElegibilidade {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira sua idade
        System.out.print("Por favor, digite sua idade: ");
        int idade = scanner.nextInt();

        // Verifica se a idade é maior ou igual a 18
        if (idade >= 18) {
            System.out.println("Você é elegível para criar uma conta bancária.");
        } else {
            System.out.println("Você não é elegível para criar uma conta bancária.");
        }

        // Fecha o scanner
        scanner.close();
    }
}

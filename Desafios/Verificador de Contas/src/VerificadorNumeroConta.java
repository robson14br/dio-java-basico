import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                // Leitura do número da conta
               
                String numeroConta = scanner.nextLine();

                // Verificar se o usuário deseja sair
                if (numeroConta.equalsIgnoreCase("sair")) {
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    continue; // Vai para a próxima iteração do loop
                }

                // Chamada para validar o número da conta
                validarNumeroConta(numeroConta);

                // Se validarNumeroConta não lançar exceção, significa que o número é válido
                System.out.println("Numero de conta valido.");
            } catch (IllegalArgumentException e) {
                // Captura e imprime a mensagem de erro
                System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
            }
        }

        // Fechar o scanner antes de sair
        scanner.close();
    }

    // Método para validar o número da conta
    public static void validarNumeroConta(String numeroConta) {
        // Verifica se o número da conta tem exatamente 8 dígitos
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException();
        }

        // Verifica se o número da conta contém apenas dígitos
        for (char c : numeroConta.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException();
            }
        }
    }
}
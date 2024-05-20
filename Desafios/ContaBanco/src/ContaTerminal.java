import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exivir as mensagens para o nosso usuario
          
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        //Exibir a mensagem conta criada
        System.out.println(mensagem);

        scanner.close();
    }
}

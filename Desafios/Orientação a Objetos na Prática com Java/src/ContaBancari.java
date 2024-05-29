import java.util.Scanner;

// Classe base ContaBancaria
class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    // Construtor da classe ContaBancaria
    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para exibir informações da conta
    public void exibirInformacoes() {
        System.out.println("Conta Poupança:");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
    }
}

// Subclasse ContaPoupanca que herda de ContaBancaria
class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    // Construtor da classe ContaPoupanca
    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    // Sobrescreve o método exibirInformacoes para incluir taxa de juros
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da classe base
        System.out.println("Taxa de juros: " + taxaJuros + "%");
    }
}

// Classe principal para interação com o usuário
public class ContaBancari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados para criar uma conta poupança
        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();
        
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.print("Digite o saldo inicial da conta: R$ ");
        double saldoInicial = scanner.nextDouble();
        
        System.out.print("Digite a taxa de juros da conta poupança (%): ");
        double taxaJuros = scanner.nextDouble();

        // Criação do objeto ContaPoupanca com os dados fornecidos
        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, nomeTitular, saldoInicial, taxaJuros);

        // Exibição das informações da conta poupança
        System.out.println("\nConta Poupança:");
        contaPoupanca.exibirInformacoes();

        scanner.close();
    }
}

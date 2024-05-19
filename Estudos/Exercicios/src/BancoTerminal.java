public class BancoTerminal {
    public static void main(String[] args) {
        // Primeira execução com saldo igual a 25 e valor solicitado igual a 18
        double saldo = 25;
        double valorSolicitado = 18;
        
        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }
        
        System.out.println("Saldo após a primeira operação: " + saldo);

        // Segunda execução com saldo igual a 15 e valor solicitado igual a 22
        saldo = 15;
        valorSolicitado = 22;
        
        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }
        
        System.out.println("Saldo após a segunda operação: " + saldo);
    }
}

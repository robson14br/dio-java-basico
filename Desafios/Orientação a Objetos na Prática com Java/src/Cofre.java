import java.util.Scanner;

public class Cofre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de cofre a ser criado (digital/físico): ");
        String tipoCofre = scanner.nextLine().trim().toLowerCase();

        if (tipoCofre.equals("digital")) {
            System.out.print("Digite a senha numérica para o cofre digital: ");
            String senha = scanner.nextLine();
            System.out.print("Confirme a senha numérica: ");
            String confirmacaoSenha = scanner.nextLine();

            while (!senha.equals(confirmacaoSenha)) {
                System.out.println("As senhas não coincidem. Tente novamente.");
                System.out.print("Digite a senha numérica para o cofre digital: ");
                senha = scanner.nextLine();
                System.out.print("Confirme a senha numérica: ");
                confirmacaoSenha = scanner.nextLine();
            }

            // Criar o cofre digital
            CofreDigital cofreDigital = new CofreDigital(senha);
            System.out.println("\nCofre criado com sucesso:");
            System.out.println("Tipo: " + cofreDigital.getTipo());
            System.out.println("Método de abertura: " + cofreDigital.getMetodoAbertura());

        } else if (tipoCofre.equals("físico")) {
            // Criar o cofre físico
            CofreFisico cofreFisico = new CofreFisico();
            System.out.println("\nCofre criado com sucesso:");
            System.out.println("Tipo: " + cofreFisico.getTipo());
            System.out.println("Método de abertura: " + cofreFisico.getMetodoAbertura());

        } else {
            System.out.println("Tipo de cofre inválido. Por favor, escolha 'digital' ou 'físico'.");
        }

        scanner.close();
    }
}

class CofreDigital {
    private String tipo;
    private String metodoAbertura;
    private String senha;

    public CofreDigital(String senha) {
        this.tipo = "Cofre Digital";
        this.metodoAbertura = "senha";
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMetodoAbertura() {
        return metodoAbertura;
    }
}

class CofreFisico {
    private String tipo;
    private String metodoAbertura;

    public CofreFisico() {
        this.tipo = "Cofre Físico";
        this.metodoAbertura = "chave";
    }

    public String getTipo() {
        return tipo;
    }

    public String getMetodoAbertura() {
        return metodoAbertura;
    }
}

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scaner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite Seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite Seu sobrenome: ");
        String sobrenome = scanner.next();
        System.out.println("Digite Sua altura: ");
        String altura = scanner.nextDouble();
        System.out.println("Digite Sua idade: ");
        String idade = scanner.nextInt();
        

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
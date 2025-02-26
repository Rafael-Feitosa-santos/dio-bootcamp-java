import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // String nome = args[0];
        // String sobrenome = args[1];
        // int idade = Integer.valueOf(args[2]);
        // double altura = Double.parseDouble(args[3]);

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome ");
        String sobrenome = scanner.next();

        System.out.println("Qual a sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, meu chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " " + "anos");
        System.out.println("Minha altura é " + altura + " cm ");
    }
}

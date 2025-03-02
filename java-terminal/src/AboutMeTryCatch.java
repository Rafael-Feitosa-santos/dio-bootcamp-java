import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeTryCatch {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu Nome: ");
            String nome = scanner.next();

            System.out.print("Digite seu Sobrenome ");
            String sobrenome = scanner.next();

            System.out.print("Qual a sua Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua Altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Olá, meu chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " " + "anos");
            System.out.println("Minha altura é " + altura + " cm ");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}

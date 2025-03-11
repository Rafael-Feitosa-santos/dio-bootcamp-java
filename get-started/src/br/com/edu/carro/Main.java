package br.com.edu.carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        while (true) {
            System.out.println("=====================");
            System.out.printf("%10s%n", "Menu");
            System.out.println("=====================");
            System.out.println("[1] - Ligar o carro.");
            System.out.println("[2] - Desligar o carro.");
            System.out.println("[3] - Acelerar.");
            System.out.println("[4] - Diminiu a velocidade.");
            System.out.println("[5] - Virar para a esquerda.");
            System.out.println("[6] - Virar para a direita.");
            System.out.println("[7] - Verificar a velocidade.");
            System.out.println("[8] - Trocar marcha.");
            System.out.println("[9] - Reduzir marcha.");
            System.out.println("[10] - Sair.");

            System.out.print("Escolha uma opção: ");
            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.diminiurVelocidade();
                    break;
                case 5:
                    carro.virar("esquerda");
                    break;
                case 6:
                    carro.virar("direita");
                    break;
                case 7:
                    carro.verificarVelocidade();
                    break;
                case 8:
                    System.out.print("Informe a marcha (0 a 6): ");
                    int marcha = scanner.nextInt();
                    carro.trocarMarcha(marcha);
                    break;
                case 9:
                    System.out.print("Informe a marcha (0 a 6): ");
                    int reduzir = scanner.nextInt();
                    carro.reduzirMarcha(reduzir);
                    break;
                case 10:
                    System.out.println("Saindo..");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

package br.com.edu.calculo.geometrico;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        scanner.useLocale(Locale.US);

        int option;
        FormaGeometrica formaGeometrica;
        while (true) {
            System.out.println("Escolha a forma geométrica para calcular a área: ");
            System.out.println("[1] - Quadrado ");
            System.out.println("[2] - Retângulo ");
            System.out.println("[3] - Circulo ");
            System.out.println("[4] - Sair ");

            option = scanner.nextInt();
            if (option == 1) {
                formaGeometrica = criandoQuadrado();
            } else if (option == 2) {
                formaGeometrica = criandoRetangulo();
            } else if (option == 3) {
                formaGeometrica = criandoCirculo();
            } else if (option == 4) {
                System.out.println("Fechando sistema!");
                break;
            } else {
                System.out.println("Opção inválida");
                continue;
            }
            System.out.printf("O resultado da área foi de %.2f\n", formaGeometrica.getArea());
        }

    }

    private static FormaGeometrica criandoQuadrado() {
        System.out.println("Informe o tamanho dos lados: ");
        var lado = scanner.nextDouble();
        return new Quadrado(lado);
    }

    private static FormaGeometrica criandoRetangulo() {
        System.out.println("Informe a base: ");
        var base = scanner.nextDouble();
        System.out.println("Informe a altura: ");
        var altura = scanner.nextDouble();
        return new Retangulo(altura, base);
    }

    private static FormaGeometrica criandoCirculo() {
        System.out.println("Informe o raio: ");
        var raio = scanner.nextDouble();
        return new Circulo(raio);
    }
}

package br.com.edu.conta.bancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo inicial: ");
        double saldo = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldo);

        while (true) {
            System.out.println("===== Menu ====\n");
            System.out.println("[1] Consultar saldo");
            System.out.println("[2] Consultar cheque especial");
            System.out.println("[3] Depositar dinheiro");
            System.out.println("[4] Sacar dinheiro");
            System.out.println("[5] Pagar um boleto");
            System.out.println("[6] Verificar se está usando cheque especial");
            System.out.println("[7] Sair");

            System.out.print("Escolha uma opção: ");
            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println(String.format("O saldo disponível é R$ %.2f", conta.consultaSaldo()));
                    break;
                case 2:
                    System.out.println(String.format("Cheque especial disponível: R$ %.2f", conta.consultaChequeEspecial()));
                    break;
                case 3:
                    System.out.print("Informe o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 4:
                    System.out.print("Informe o valor que deseja sacar: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 5:
                    System.out.print("Informe o valor do boleto R$: ");
                    double valorBoleto = scanner.nextDouble();
                    conta.pagarBoleto(valorBoleto);
                    break;
                case 6:
                    conta.verificarChequeUsado();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}

package br.com.edu.conta.bancaria;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecialUsado;
    private double limiteChequeEspecial;
    private double taxasAplicadas;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
        this.chequeEspecialUsado = chequeEspecialUsado;
        this.taxasAplicadas = taxasAplicadas;

        limiteChequeEspecial = (saldo <= 500) ? 50 : saldo * 0.5;
    }

    public double consultaSaldo() {
        return saldo - chequeEspecialUsado;
    }


    public double consultaChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void depositar(double deposito) {
        if (deposito > 0) {
            saldo += deposito;
            limiteChequeEspecial = (saldo <= 500) ? 50 : saldo * 0.50;
            System.out.println(String.format("Depósito de R$ %.2f realizado com sucesso!", deposito));
        } else {
            System.out.println("Valor inválido para deposito");
        }
    }

    public void sacar(double saque) {
        if (saque <= saldo) {
            saldo -= saque;
            System.out.println(String.format("Saque de R$ %.2f realizado com sucesso!", saque));
        } else if (saque <= saldo + limiteChequeEspecial) {
            double valorUsadoChequeEspecial = saque - saldo;
            chequeEspecialUsado += valorUsadoChequeEspecial;
            limiteChequeEspecial -= valorUsadoChequeEspecial;
            saldo = 0;
            System.out.println(String.format("Saque de R$ %.2f realizado com sucesso usando cheque especial!", saque));
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void pagarBoleto(double pagar) {
        if (pagar <= saldo) {
            saldo -= pagar;
            System.out.println(String.format("Boleto de R$ %.2f pago com sucesso!", pagar));
        } else if (pagar <= saldo + limiteChequeEspecial) {
            double valorUsadoChequeEspecial = pagar - saldo;
            chequeEspecialUsado += valorUsadoChequeEspecial;
            limiteChequeEspecial -= valorUsadoChequeEspecial;
            saldo = 0;
            System.out.println(String.format("Boleto de R$ %.2f pago com sucesso usando cheque especial!", pagar));
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void verificarChequeUsado() {
        if (chequeEspecialUsado > 0) {
            double taxa = chequeEspecialUsado * 0.20;
            saldo -= taxa;
            taxasAplicadas += taxa;
            System.out.println(String.format("Taxa de R$ %.2f cobrada sobre o cheque especial!", taxa));
        } else {
            System.out.println("Não há uso do cheque especial!");
        }
    }

}

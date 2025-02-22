package edu.rafael.bootcampjava;
public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome = "Rafael";
        String segundoNome = "Feitosa";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome + " " + segundoNome;
    }
}

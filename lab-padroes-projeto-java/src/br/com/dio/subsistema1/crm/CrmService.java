package br.com.dio.subsistema1.crm;

public class CrmService {

    private CrmService() {

    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente saldo no sistema de CRM.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}

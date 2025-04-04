package br.com.dio.facade;

import br.com.dio.subsistema1.crm.CrmService;
import br.com.dio.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade =  CepApi.getInstance().recuperarCidade(cep);
        String estado =  CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}

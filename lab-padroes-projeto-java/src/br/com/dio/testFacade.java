package br.com.dio;

import br.com.dio.facade.Facade;

public class testFacade {

    public static void main(String[] args) {

        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("Rafael", "55555000");
    }
}

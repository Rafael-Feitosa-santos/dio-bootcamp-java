package br.com.dio.singleton;

/**
 * Singleton "Preguiçoso"
 */

public class SingleLazy{

    private static SingleLazy instancia;

    private SingleLazy() {
    }

    public static SingleLazy getInstance() {
        if (instancia == null) {
            instancia = new SingleLazy();
        }
        return instancia;
    }
}

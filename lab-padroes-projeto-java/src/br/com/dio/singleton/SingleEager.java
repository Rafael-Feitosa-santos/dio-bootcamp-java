package br.com.dio.singleton;

/**
 * Singleton "Apressado"
 */
public class SingleEager {

    private static SingleEager instacia = new SingleEager();

    private SingleEager() {
    }

    public static SingleEager getInstance() {
        return instacia;
    }

}

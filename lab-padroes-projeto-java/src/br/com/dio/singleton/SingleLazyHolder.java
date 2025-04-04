package br.com.dio.singleton;

/**
 * Singleton "Lazy Holder"
 */

public class SingleLazyHolder {

    private static class InstaceHolder {
        private static SingleLazyHolder instancia = new SingleLazyHolder();
    }

    private SingleLazyHolder() {
    }

    public static SingleLazyHolder getInstance() {
        return InstaceHolder.instancia;
    }
}

package br.com.dio;

import br.com.dio.singleton.SingleEager;
import br.com.dio.singleton.SingleLazy;
import br.com.dio.singleton.SingleLazyHolder;

public class Test {
    public static void main(String[] args) {

        // Teste relacionados ao Design Pattern Singleton

        SingleLazy lazy = SingleLazy.getInstance();
        System.out.println(lazy);
        lazy = SingleLazy.getInstance();
        System.out.println(lazy);

        SingleEager eager = SingleEager.getInstance();
        System.out.println(eager);
        eager = SingleEager.getInstance();
        System.out.println(eager);

        SingleLazyHolder holder = SingleLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingleLazyHolder.getInstance();
        System.out.println(holder);
    }
}
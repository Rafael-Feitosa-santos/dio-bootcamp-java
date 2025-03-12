package br.com.edu.usuario;


import java.util.List;
import java.util.function.Function;

// Exemplo de interface funcionais
public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarioList = List.of(new Usuario("Maria", 22), new Usuario("João", 32),
                new Usuario("Eduardo", 40), new Usuario("Ana", 19));

        // Função lambda
        usuarioList.forEach(usuario -> System.out.println(usuario));

        // Função lambda
        printStringValue(usuario -> usuario.nome(), usuarioList);
        printStringValue(usuario -> usuario.toString(), usuarioList);
    }

    private static void printStringValue(Function<Usuario, String> callback, List<Usuario> usuarios) {
        usuarios.forEach(u -> System.out.println(callback.apply(u)));
    }
}
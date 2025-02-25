public class Operadores {
    public static void main(String[] args) {

        String nomeCompleto = "Linguagem" + " " + "Java";

        String concatenacao = "1" + (1 + 1 + 1);

        int numero = 5;
        numero = -numero;

        numero = numero * -1;

        // Ternário
        int a, b;

        a = 6;
        b = 6;

        // String resultado = "";
        // if(a==b)
        // resultado = "verdadeiro";
        // else
        // resultado = "falso";

        // System.err.println(resultado);

        String resultado = a == b ? "verdadeiro" : "falso";

    }
}

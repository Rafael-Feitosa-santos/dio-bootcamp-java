package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class SelecaoCandidatos {

    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
                "Daniela", "Jorge" };

        int candidatosSelecionados = 0;

        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            String salarioFormatado = String.format("%.2f", salarioPretendido);

            System.out.println("O candidato " + candidato + " solicitou esse valor de salário " + salarioFormatado);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candido " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

}

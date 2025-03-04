package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("============== Processo seletivo ==============\n");

        double[] salarios = { 1900.0, 2200.0, 2000.0 };

        for (double salario : salarios) {
            analisarCandidato(salario);
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com a contra proposta");
            ;
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}

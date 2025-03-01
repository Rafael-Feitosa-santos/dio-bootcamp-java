public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = { "Rafael", "Matilde", "Davi", "Marcos" };

        for (String aluno : alunos) {
            System.out.println(String.format("Nome do aluno é %s", aluno));
        }
    }

}

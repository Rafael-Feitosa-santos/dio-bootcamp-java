public class ExemploForArray {
    public static void main(String[] args) {

        String alunos[] = { "Rafael", "Matilde", "Davi", "Marcos" };

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(String.format("O aluno no índice i = %d é %s", i + 1, alunos[i]));
        }
    }
}

package escola;

public class Escola {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Rafael Feitosa");
        aluno.setIdade(33);
        aluno.setSexo("Masculino");

        System.out.println(String.format("O aluno %s tem a idade %d anos, ele é do genero: %s", aluno.getNome(), aluno.getIdade(), aluno.getSexo()));
    }
}

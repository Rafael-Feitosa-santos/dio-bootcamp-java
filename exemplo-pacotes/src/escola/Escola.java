package escola;

public class Escola {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "Rafael";
        aluno.idade = 33;

        System.out.println("O aluno " + aluno.nome + " tem a idade " + aluno.idade);
    }
}

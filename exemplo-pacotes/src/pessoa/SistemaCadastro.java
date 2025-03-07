package pessoa;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Rafael", "111222-33");

        pessoa.setEndereco("rua direita");

        System.out.println(String.format("Nome: %s - cpf: %s", pessoa.getNome(), pessoa.getCpf()));
    }
}

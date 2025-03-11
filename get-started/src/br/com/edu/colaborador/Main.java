package br.com.edu.colaborador;

// Definição de Herança e polimorfismo
public class Main {

    public static void main(String[] args) {

        printColaborador(new Gerente());
        printColaborador(new Vendedor());

    }

    public static void printColaborador(Colaborador colaborador) {

        System.out.printf("====== %s ======\n", colaborador.getClass().getSimpleName());
        switch (colaborador) {
            case Gerente gerente -> {
                gerente.setCodigo(123L);
                gerente.setNome("João");
                gerente.setSalario(5000);
                gerente.setLogin("joao");
                gerente.setSenha("123456");
                gerente.setComissao(1200);

                System.out.println(gerente.getCodigo());
                System.out.println(gerente.getSalario());
                System.out.println(gerente.getNome());
                System.out.println(gerente.getLogin());
                System.out.println(gerente.getSenha());
                System.out.println(gerente.getComissao());
            }
            case Vendedor vendedor -> {
                vendedor.setCodigo(456L);
                vendedor.setNome("Lucas");
                vendedor.setSalario(2800);
                vendedor.getPercentualVenda(10);

                System.out.println(vendedor.getCodigo());
                System.out.println(vendedor.getSalario());
                System.out.println(vendedor.getNome());
                System.out.println(vendedor.getPercentualVenda(10));

            }
        }
        System.out.println("=====================");
    }
}






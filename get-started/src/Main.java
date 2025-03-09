import br.com.edu.get.started.MaquinaBanho;
import br.com.edu.get.started.Pet;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static MaquinaBanho maquinaBanho = new MaquinaBanho();

    public static void main(String[] args) {

        scanner.useDelimiter("\\n");
        int option = -1;

        do {
            System.out.println("\n==== Escolha uma das opções ===\n");
            System.out.println("[1] - Dar banho no pet.");
            System.out.println("[2] - Abastercer a máquina com água.");
            System.out.println("[3] - Abastercer a máquina com shampoo.");
            System.out.println("[4] - Verificar água da máquina.");
            System.out.println("[5] - Verificar shampoo da máquina.");
            System.out.println("[6] - Verificar se tem pet no banho.");
            System.out.println("[7] - colocar pet na máquina.");
            System.out.println("[8] - Retira pet da máquina.");
            System.out.println("[9] - Limpar a máquina.");
            System.out.println("[0] - sair");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> maquinaBanho.darBanhoNoPet();
                case 2 -> setAgua();
                case 3 -> setShampoo();
                case 4 -> verificarAgua();
                case 5 -> verificarShampoo();
                case 6 -> verificiarSeTemPetNaMaquina();
                case 7 -> setPetInPetMachine();
                case 8 -> maquinaBanho.retiraPet();
                case 9 -> maquinaBanho.limparMaquina();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida.");

            }
        } while (true);
    }

    public static void setAgua() {
        System.out.println("tentando colocar água na máquina");
        maquinaBanho.adicionarAgua();
    }

    public static void setShampoo() {
        System.out.println("tentando colocar shampoo na máquina");
        maquinaBanho.adicionarShampoo();
    }

    private static void verificarAgua() {
        int amout = maquinaBanho.getAgua();
        System.out.println("A máquina está no momento com " + amout + " litro(s) de água");
    }

    private static void verificarShampoo() {
        int amout = maquinaBanho.getShampoo();
        System.out.println("A máquina está no momento com " + amout + " litro(s) de shampoo");
    }


    private static void verificiarSeTemPetNaMaquina() {
        boolean temPet = maquinaBanho.temPet();
        System.out.println(temPet ? "tem pet na máquina" : "Não tem pet na máquina");

    }

    public static void setPetInPetMachine() {
        String nome = "";
        while (nome.isEmpty()) {
            System.out.println("Informe o nome do pet: ");
            nome = scanner.next();
        }
        Pet pet = new Pet(nome);
        maquinaBanho.setPet(pet);
    }

    public void getPetFromMachine() {
        maquinaBanho.retiraPet();
    }
}

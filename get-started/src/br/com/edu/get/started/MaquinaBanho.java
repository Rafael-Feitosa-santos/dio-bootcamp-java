package br.com.edu.get.started;

public class MaquinaBanho {

    private boolean limpo = true;

    private int agua = 30;

    private int shampoo = 10;

    private Pet pet = null;


    public void darBanhoNoPet() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }

        this.agua -= 10;
        this.shampoo -= 2;

        pet.setLimpo(true);
        System.out.println("O pet " + pet.getNome() + " está limpo");
    }

    public void adicionarAgua() {
        if (agua >= 30) {
            System.out.println("A capacidade de água está no máximo");
            return;
        }

        agua = Math.min(agua + 5, 30);
        System.out.println("💧 Água adicionada. Nível atual: " + agua);
    }

    public void adicionarShampoo() {
        if (shampoo >= 10) {
            System.out.println("A capacidade de shampoo está no máximo");
            return;
        }

        shampoo = Math.min(shampoo + 5, 10);
        System.out.println("Shampoo adicionado. Nível atual: " + shampoo);
    }

    public int getAgua() {
        return agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean temPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.limpo) {
            System.out.println("A máquina está suja, para colocar pet é necessário limpá-la");
            return;
        }
        if (temPet()) {
            System.out.println("O pet " + pet + " está na máquina nesse momento.");
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + pet.getNome() + " foi colocado na máquina");
    }

    public void retiraPet() {
        this.limpo = pet.isLimpo();

        System.out.println("O pet " + pet.getNome() + " foi tirado da máquina");
        this.pet = null;
    }

    public void limparMaquina() {
        this.agua -= 10;
        this.shampoo -= 2;
        this.limpo = true;
        System.out.println("A máquina foi limpa.");
    }

}

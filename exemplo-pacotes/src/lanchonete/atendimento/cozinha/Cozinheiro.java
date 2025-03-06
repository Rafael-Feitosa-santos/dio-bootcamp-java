package lanchonete.atendimento.cozinha;

public class Cozinheiro {

    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche natural hamburger no balcão");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcão");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("Preparando lanche tipo hamburger");
    }

    private void prepararVitamina() {
        System.out.println("Preparando suco");
    }

    private void preparandoCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("Selecionando o pão, salada, ovo e carne");
    }

    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("Batendo vitamina liquidificador");
    }

    public void fritarIngredientesLanche() {
        System.out.println("Fritando a carne e ovo para o hamburger");
    }

    private void pedirParaTrocarGas(Almoxarife atendente) {
        atendente.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }

}

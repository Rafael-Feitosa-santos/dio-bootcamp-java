package br.com.edu.relogio;

public class Main {
    public static void main(String[] args) {
        Relogio relogioBrl = new RelogioBrl();
        relogioBrl.setSegundo(0);
        relogioBrl.setMinuto(0);
        relogioBrl.setHora(17);

        System.out.println(relogioBrl.getTime());

        System.out.println(new RelogioUSA().converter(relogioBrl).getTime());
    }
}

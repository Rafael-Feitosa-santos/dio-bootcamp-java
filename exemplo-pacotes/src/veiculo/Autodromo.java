package veiculo;

public class Autodromo {
    public static void main(String[] args) {

        // Aplicando o polimorfismo
        Carro track = new Carro();
        track.setChassi("89745654");
        System.out.println("chassi do carro: " + track.getChassi());
        track.ligar();

        System.out.println("-------------------------------------");

        Moto custom = new Moto();
        custom.setChassi("8794561");
        System.out.println("chassi da moto: " + custom.getChassi());
        custom.ligar();

//        Veiculo veiculo = custom;
//        veiculo.ligar();
    }
}

package br.com.edu.carro;

public class Carro {

    private boolean ligado;
    private int marcha;
    private int velocidade;

    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já estava ligado.");
        }
    }

    public void desligar() {
        if (ligado && marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro não pode ser desligado, " +
                    "enquanto esitver em movimento ou em uma marcha diferente de 0.");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está ligado. Não é possível acelerar.");
            return;
        }

        if (marcha == 0) {
            System.out.println("O carro está no porto morto. Não é possível acelerar.");
            return;
        }

        if ((marcha == 1 && velocidade < 20) || (marcha == 2 && velocidade < 40) ||
                (marcha == 3 && velocidade < 60) || (marcha == 4 && velocidade < 80) ||
                (marcha == 5 && velocidade < 100) || (marcha == 6 && velocidade < 120)) {

            velocidade += 10;
            System.out.printf("Velocidade aumentada para %d km/h\n", velocidade);
        } else {
            System.out.println("Não é possível acelerar mais nesta marcha.");
        }
    }

    public void diminiurVelocidade() {
        if (!ligado) {
            System.out.println("O carro está desligado. Não é possível diminuir a velocidade.");
            return;
        }

        if (velocidade > 0) {
            velocidade -= 10;
            System.out.printf("Velocidade reduzida para %d km/h\n", velocidade);
        } else {
            System.out.println("A velocidade já esta em 0 km/h.");
        }
    }

    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("O carro está desligado. Não é possível virar.");
            return;
        }

        if (velocidade >= 1 && velocidade <= 40) {
            System.out.printf("O carro virou para %s.\n", direcao);
        } else {
            System.out.println("A velocidade está fora do limite para virar. A velocidade deve esta entre " +
                    "1 km/h e 40 km/h.");
        }
    }

    public void verificarVelocidade() {
        System.out.printf("A velocidade atual do carro é %d km/h\n", velocidade);
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado. Não é possível trocar de marcha.");
            return;
        }

        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida. O carro tem marchas de 0 e 6");
            return;
        }

        if (novaMarcha == marcha + 1) {
            marcha = novaMarcha;
            System.out.printf("A marcha foi trocada para %d \n", novaMarcha);
        } else {
            System.out.println("Não é permitido pular marchas");
        }
    }

    public void reduzirMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado. Não é possível trocar de marcha.");
            return;
        }
        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida. O carro tem marchas de 0 e 6");
            return;
        }

        if (novaMarcha == marcha - 1) {
            marcha = novaMarcha;
            System.out.printf("A marcha foi trocada para %d \n", novaMarcha);
        } else {
            System.out.println("Não é permitido pular marchas");
        }
    }
}


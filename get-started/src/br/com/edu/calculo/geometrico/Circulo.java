package br.com.edu.calculo.geometrico;

public record Circulo(double raio) implements FormaGeometrica {

    private static double pi = 3.14;

    @Override
    public double getArea() {
        return pi * (raio * raio);
    }
}

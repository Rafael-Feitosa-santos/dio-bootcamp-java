package br.com.edu.calculo.geometrico;

public record Retangulo(double altura, double base) implements FormaGeometrica {
    @Override
    public double getArea() {
        return altura * base;
    }
}

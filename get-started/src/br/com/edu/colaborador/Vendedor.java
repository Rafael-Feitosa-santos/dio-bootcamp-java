package br.com.edu.colaborador;

public non-sealed class Vendedor extends Colaborador {

    private double percentualVenda;


    @Override
    public String getCodigo() {
        return "SL" + super.getCodigo();
    }

    public double getPercentualVenda(int i) {
        return percentualVenda;
    }

    public void setPercentualVenda(double percentualVenda) {
        this.percentualVenda = percentualVenda;
    }
}

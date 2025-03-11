package br.com.edu.colaborador;

public non-sealed class Gerente extends Colaborador{

    private String login;
    private String senha;
    private double comissao;

    public Gerente() {
    }

    @Override
    public String getCodigo() {
        return "MN" + super.getCodigo();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}

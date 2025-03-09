package br.com.edu.get.started;

public class Pet {
    private String nome;
    private boolean limpo;

    public Pet(String nome) {
        this.nome = nome;
        this.limpo = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLimpo() {
        return limpo;
    }

    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
}

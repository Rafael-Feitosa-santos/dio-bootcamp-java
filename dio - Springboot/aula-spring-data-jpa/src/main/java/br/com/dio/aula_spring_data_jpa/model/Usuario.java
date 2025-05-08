package br.com.dio.aula_spring_data_jpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_usuario")
    @SequenceGenerator(
            name = "sq_tb_usuario",
            sequenceName = "sq_tb_usuario",
            allocationSize = 1
    )
    @Column(name = "id_usuario")
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nome;

    @Column(name = "nm_usuario", length = 50, nullable = false)
    private String nomeUsuario;

    @Column(length = 100, nullable = false)
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}

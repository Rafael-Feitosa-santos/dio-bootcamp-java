package br.com.dio.aula_spring_data_jpa.repository;

import br.com.dio.aula_spring_data_jpa.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<Usuario> usuarios = repository.filtrarPorNome("Rafael");
            for (Usuario u : usuarios) {
                System.out.println(u);
        }

    }

    private void insertUsuario() {

        Usuario usuario = new Usuario();
        usuario.setNome("Davi");
        usuario.setNomeUsuario("davi_f");
        usuario.setSenha("654987");

        repository.save(usuario);

        for (Usuario u : repository.findAll()) {
            System.out.println(u);
        }
    }
}

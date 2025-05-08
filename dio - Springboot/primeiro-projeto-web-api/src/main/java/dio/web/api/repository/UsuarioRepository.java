package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario) {
        if (usuario.getLogin() == null)
            throw new CampoObrigatorioException("login");

        if (usuario.getSenha() == null)
            throw new CampoObrigatorioException("senha");

        if (usuario.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na cada de repositório.");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na cada de repositório.");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário\n", id);
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema.");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Rafael", "123456"));
        usuarios.add(new Usuario("Davi", "654987"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.printf("FIND/id - Recebendo o id: %d para localizar um usuário\n", id);
        return new Usuario("Rafael", "123456");
    }

    public Usuario findByNomeUsuario(String nomeUsuario) {
        System.out.printf("FIND/nomeUsuario - Recebendo o nome usuário: %s para localizar um usuário\n", nomeUsuario);
        return new Usuario("Rafael", "123456");
    }
}

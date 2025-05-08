package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> getUsuario() {
        return repository.findAll();
    }

    @GetMapping("/{nomeUsuario}")
    @ResponseStatus(HttpStatus.OK)
    public Usuario getOne(@PathVariable("nomeUsuario") String nomeUsuario) {
        return repository.findByNomeUsuario(nomeUsuario);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUsuario(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void postUsuario(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public void putUsuario(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
}

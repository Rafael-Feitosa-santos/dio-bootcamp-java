package dio.spring.security.init;

import dio.spring.security.model.User;
import dio.spring.security.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class StartApplication implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        if (repository.findByUsername("admin") == null) {
            User admin = new User();
            admin.setNome("ADMIN");
            admin.setUsername("admin");
            admin.setSenha(passwordEncoder.encode("master123")); // Agora está criptografado
            admin.getRoles().add("MANAGER"); // Certifique-se de que o nome da role está certo no banco
            repository.save(admin);
        }

        if (repository.findByUsername("user") == null) {
            User user = new User();
            user.setNome("USER");
            user.setUsername("user");
            user.setSenha(passwordEncoder.encode("user123")); // Agora está criptografado
            user.getRoles().add("USER"); // Certifique-se de que o nome da role está certo no banco
            repository.save(user);
        }
    }
}

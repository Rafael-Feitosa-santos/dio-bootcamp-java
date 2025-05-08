package br.com.dio.dio_spring_security_jwt.controller;

import br.com.dio.dio_spring_security_jwt.dto.Login;
import br.com.dio.dio_spring_security_jwt.dto.Sessao;
import br.com.dio.dio_spring_security_jwt.model.User;
import br.com.dio.dio_spring_security_jwt.repository.UserRepository;
import br.com.dio.dio_spring_security_jwt.security.JWTCreator;
import br.com.dio.dio_spring_security_jwt.security.JWTObject;
import br.com.dio.dio_spring_security_jwt.security.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UserRepository repository;

    @PostMapping()
    public Sessao logar(@RequestBody Login login) {
        User user = repository.findByUsername(login.getUsername());
        if (user != null) {
            boolean passwordOk = encoder.matches(login.getPassword(), user.getPassword());
            if (!passwordOk) {
                throw new BadCredentialsException("Senha inválida para o login: " + login.getUsername());
            }
            // Criando a sessão de login
            Sessao sessao = new Sessao();
            sessao.setLogin(user.getUsername());

            JWTObject jwtObject = new JWTObject();
            jwtObject.setIssuedAt(new Date(System.currentTimeMillis()));
            jwtObject.setExpiration(new Date(System.currentTimeMillis() + SecurityConfig.EXPIRATION));

            // Garantir que roles não sejam null ou vazias
            if (user.getRoles() == null || user.getRoles().isEmpty()) {
                throw new RuntimeException("Usuário não possui papéis atribuídos.");
            }
            jwtObject.setRoles(user.getRoles());

            // Gerando o token JWT (sem PREFIXO)
            String token = JWTCreator.create(SecurityConfig.KEY, jwtObject);
            sessao.setToken(token);
            return sessao;
        } else {
            throw new UsernameNotFoundException("Usuário não encontrado: " + login.getUsername());
        }
    }

}

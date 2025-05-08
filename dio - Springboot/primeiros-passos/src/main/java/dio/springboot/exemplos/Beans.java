package dio.springboot.exemplos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public Remetente remetente() {
        System.out.printf("Criando um objeto remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setEmail("Digital Innovation One");
        return remetente;
    }
}

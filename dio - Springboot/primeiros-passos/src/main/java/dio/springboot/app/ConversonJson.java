package dio.springboot.app;

import com.google.gson.Gson;
import dio.springboot.app.ViaCepResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class ConversonJson {

    @Autowired
    private Gson gson;

    @Autowired
    public ConversonJson(Gson gson) {
        this.gson = gson;
    }

    public ViaCepResponse buscarCep(String cep) throws IOException {
        if (cep == null || cep.trim().isEmpty()) {
            throw new IllegalArgumentException("CEP não pode ser vazio ou nulo.");
        }

        String urlString = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpURLConnection connection = (HttpURLConnection) new URL(urlString).openConnection();
        connection.setRequestMethod("GET");

        if (connection.getResponseCode() != 200) {
            throw new RuntimeException("Erro na requisição: " + connection.getResponseCode());
        }

        try (InputStreamReader reader = new InputStreamReader(connection.getInputStream())) {
            return gson.fromJson(reader, ViaCepResponse.class);
        } finally {
            connection.disconnect();
        }
    }
}

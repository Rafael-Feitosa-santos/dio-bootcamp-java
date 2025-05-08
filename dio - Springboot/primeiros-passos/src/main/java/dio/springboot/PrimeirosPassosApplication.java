package dio.springboot;

import dio.springboot.app.ConversonJson;
import dio.springboot.app.ViaCepResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

@SpringBootApplication
public class PrimeirosPassosApplication implements CommandLineRunner {

    @Autowired
    private ConversonJson converter;

    public static void main(String[] args) {
        SpringApplication.run(PrimeirosPassosApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CEP (com ou sem traço): ");
        String cep = scanner.nextLine().replaceAll("[^\\d]", "");

        try {
            String response = makeHttpRequest(cep);
            if (response.contains("\"erro\": \"true\"")) {
                System.err.println("Erro: O CEP não foi encontrado.");
            } else {
                // Converte a resposta para a classe ViaCepResponse
                ViaCepResponse viaCepResponse = converter.buscarCep(cep);
                System.out.println("CEP: " + viaCepResponse.getCep());
                System.out.println("Logradouro: " + viaCepResponse.getLogradouro());
                System.out.println("Bairro: " + viaCepResponse.getBairro());
                System.out.println("Cidade: " + viaCepResponse.getLocalidade());
                System.out.println("UF: " + viaCepResponse.getUf());
            }
        } catch (IOException e) {
            System.err.println("Erro ao buscar CEP: " + e.getMessage());
        }
    }

    private String makeHttpRequest(String cep) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL("https://viacep.com.br/ws/" + cep + "/json/").openConnection();
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() != 200) throw new IOException("Erro na requisição: " + connection.getResponseCode());

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) response.append(inputLine);
        in.close();
        return response.toString();
    }
}

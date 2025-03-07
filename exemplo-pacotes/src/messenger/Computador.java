package messenger;

import messenger.apps.FacebookMessenger;
import messenger.apps.MSNMessenger;
import messenger.apps.ServicoMensagemInstantanea;
import messenger.apps.TelegramMessenger;

// Aplicando o polimorfismo.
public class Computador {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        // Não sabe qual app, mas qualquer um deverá enviar e receber mensagem.
        String appEscolhido = "msn";
        try {
            if (appEscolhido.equals("msn")) {
                smi = new MSNMessenger();
            } else if (appEscolhido.equals("facebook")) {
                smi = new FacebookMessenger();
            } else if (appEscolhido.equals("telegram")) {
                smi = new TelegramMessenger();
            } else {
            }

            smi.enviarMensagem();
            smi.receberMensagem();
        } catch (NullPointerException e) {
            System.out.println("Opção inexistente");
        }
    }
}

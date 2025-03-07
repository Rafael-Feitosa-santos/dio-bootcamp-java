package messenger;

// Aplicando a herança
public class TelegramMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram..");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram..");
    }
}

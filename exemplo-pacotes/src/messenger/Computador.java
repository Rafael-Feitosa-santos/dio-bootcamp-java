package messenger;


public class Computador {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("----------------------");

        FacebookMessenger facebook = new FacebookMessenger();

        System.out.println("FACEBOOK");
        facebook.enviarMensagem();
        facebook.receberMensagem();

        System.out.println("----------------------");

        TelegramMessenger telegram = new TelegramMessenger();

        System.out.println("TELEGRAM");
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}

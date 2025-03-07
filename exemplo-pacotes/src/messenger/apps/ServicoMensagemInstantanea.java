package messenger.apps;

// Classe para aplicar a herança, encapsulamento, aplicando a abstração
public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    // Somente os filhos conhecem este metodo ou se estiver no mesmo package
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet..");
    }
}

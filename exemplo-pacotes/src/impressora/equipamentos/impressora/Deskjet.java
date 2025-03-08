package impressora.equipamentos.impressora;

import javax.crypto.spec.PSource;

public class Deskjet implements Impressora{
    @Override
    public void imprimir() {
        System.out.println("Imprimindo Deskjet...");
    }
}

package impressora.equipamentos.estabelecimento;

import impressora.equipamentos.copiadora.Copiadora;
import impressora.equipamentos.digitalizadora.Digitalizadora;
import impressora.equipamentos.digitalizadora.Scanner;
import impressora.equipamentos.impressora.Deskjet;
import impressora.equipamentos.impressora.Impressora;
import impressora.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}

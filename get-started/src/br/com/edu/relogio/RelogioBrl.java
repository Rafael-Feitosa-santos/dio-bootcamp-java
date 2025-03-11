package br.com.edu.relogio;


public non-sealed class RelogioBrl extends Relogio {

    @Override
    public Relogio converter(Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        switch (relogio) {
            case RelogioUSA relogioUSA -> this.hora = (relogioUSA.getIndicadorPeriodo().equals("PM")) ?
                    relogioUSA.getHora() + 12 :
                    relogioUSA.getHora();
            case RelogioBrl relogioBrl -> this.hora = relogioBrl.getHora();
        }
        return this;
    }
}

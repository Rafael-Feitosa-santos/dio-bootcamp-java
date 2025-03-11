package br.com.edu.relogio;

public non-sealed class RelogioUSA extends Relogio {

    private String indicadorPeriodo;

    public String getIndicadorPeriodo() {
        return indicadorPeriodo;
    }

    public void setDepoisMeioDia() {
        this.indicadorPeriodo = "PM";
    }

    public void setAntesMeioDia() {
        this.indicadorPeriodo = "AM";
    }


    public void setHora(int hora) {
        setAntesMeioDia();
        if ((hora >= 12) && (hora <= 23)) {
            setDepoisMeioDia();
            this.hora = hora - 12;
        } else if (hora >= 24) {
            this.hora = 0;
        } else {
            this.hora = hora;
        }
    }

    @Override
    Relogio converter(Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        switch (relogio) {
            case RelogioUSA relogioUSA -> {
                this.hora = relogioUSA.getHora();
                this.indicadorPeriodo = relogioUSA.getIndicadorPeriodo();
            }
            case RelogioBrl relogioBrl -> this.setHora(relogio.getHora());
        }
        return this;
    }

    public String getTime() {
        return super.getTime() + " " + this.indicadorPeriodo;
    }
}

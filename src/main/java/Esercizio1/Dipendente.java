package Esercizio1;

import Esercizio3.CheckIn;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Dipendente {
    private int matricola;
    private float stipendio;
    @Setter
    @Getter
    private Dipartimento dipartimento;

    public int getMatricola() {
        return matricola;
    }

    public float getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public Dipendente(int matricola, float stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }
    public Dipendente(){};

}

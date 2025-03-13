package Esercizio2;

import Esercizio1.Dipartimento;
import Esercizio1.Dipendente1;
import Esercizio3.CheckIn;

public class Dirigente extends Dipendente1 implements CheckIn {
    private int stipendioFisso = 3000;

    public Dirigente(int matricola, Dipartimento dipartimento, int stipendioFisso) {
        super(matricola, dipartimento);
        this.stipendioFisso = stipendioFisso;
    }

    @Override
    public float stipendio() {
        return stipendioFisso;
    }

    @Override
    public void checkIn() {
        System.out.println("Il dirigente," + getMatricola() + ", ha effettuato il check-in");
    }
}

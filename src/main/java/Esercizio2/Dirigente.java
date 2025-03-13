package Esercizio2;

import Esercizio1.Dipendente1;

public class Dirigente extends Dipendente1 {
    private int stipendioFisso = 3000;

    @Override
    public float stipendio() {
        return stipendioFisso;
    }
}

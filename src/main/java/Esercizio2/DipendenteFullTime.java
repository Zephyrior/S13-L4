package Esercizio2;

import Esercizio1.Dipendente1;

public class DipendenteFullTime extends Dipendente1 {
    private int numeroOreLavorate = 8;
    private int pagaOraria = 10;

    @Override
    public float stipendio() {
        return 26 * (numeroOreLavorate * pagaOraria);
    }
}

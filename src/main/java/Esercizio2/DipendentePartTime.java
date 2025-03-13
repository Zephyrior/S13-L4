package Esercizio2;

import Esercizio1.Dipendente1;

public class DipendentePartTime extends Dipendente1 {
    private int numeroOreLavorate = 4;
    private int pagaOraria = 8;

    @Override
    public float stipendio() {
        return 26 * (numeroOreLavorate * pagaOraria);
    }
}

package Esercizio2;

import Esercizio1.Dipartimento;
import Esercizio1.Dipendente1;
import Esercizio3.CheckIn;

public class DipendentePartTime extends Dipendente1 implements CheckIn {
    private int numeroOreLavorate = 4;
    private int pagaOraria = 8;

    public DipendentePartTime(int matricola, Dipartimento dipartimento, int numeroOreLavorate, int pagaOraria) {
        super(matricola, dipartimento);
        this.numeroOreLavorate = numeroOreLavorate;
        this.pagaOraria = pagaOraria;
    }

    @Override
    public float stipendio() {
        return 26 * (numeroOreLavorate * pagaOraria);
    }

    @Override
    public void checkIn() {
        System.out.println("Il dipendente part-time," + getMatricola() + ", ha effettuato il check-in");
    }
}

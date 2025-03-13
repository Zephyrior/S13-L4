package Esercizio3;

import Esercizio1.Dipartimento;
import Esercizio1.Dipendente1;

public class Volontario extends Dipendente1 implements CheckIn {
    private String nome;
    private int età;
    private String cv;
    private float stipendio = 0;

    public Volontario(int matricola, Dipartimento dipartimento, String nome, int età, String cv, float stipendio) {
        super(matricola, dipartimento);
        this.nome = nome;
        this.età = età;
        this.cv = cv;
        this.stipendio = stipendio;
    }

    @Override
    public float stipendio() {
        return stipendio;
    }

    @Override
    public void checkIn() {
        System.out.println("Il volontario," + nome + ", ha effettuato il check-in");
    }
}


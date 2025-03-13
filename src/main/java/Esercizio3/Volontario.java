package Esercizio3;

import Esercizio1.Dipartimento;
import Esercizio1.Dipendente;

public class Volontario extends Dipendente implements CheckIn {
    private String nome;
    private int età;
    private String cv;

    public Volontario(int matricola, float stipendio, Dipartimento dipartimento, String nome, int età, String cv) {
        super(matricola, stipendio, dipartimento);
        this.nome = nome;
        this.età = età;
        this.cv = cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Il volontario,"+nome+", ha effettuato il check-in");
    }

}

package Esercizio3;

import Esercizio1.Dipartimento;
import Esercizio1.Dipendente;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente = new Dipendente(123, 1000, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(456, 2000, Dipartimento.AMMINISTRAZIONE);
        Dipendente volontario = new Volontario(456,0, Dipartimento.AMMINISTRAZIONE,"Luca", 25, "Amministrazione");
        Dipendente volontario2 = new Volontario(456,0, Dipartimento.PRODUZIONE,"Lucia", 25, "Produzione");

        Dipendente[] dipendenti = {dipendente, dipendente2, volontario, volontario2};

        for(int i = 0; i < dipendenti.length; i++) {
            dipendenti[i].checkIn();
        }
    }
}

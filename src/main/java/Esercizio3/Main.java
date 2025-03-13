package Esercizio3;

import Esercizio1.Dipartimento;
import Esercizio1.Dipendente1;
import Esercizio2.DipendenteFullTime;
import Esercizio2.DipendentePartTime;
import Esercizio2.Dirigente;

public class Main {
    public static void main(String[] args) {
        Dirigente dirigente = new Dirigente(123, Dipartimento.PRODUZIONE, 3000);
        DipendenteFullTime fullTime = new DipendenteFullTime(456, Dipartimento.AMMINISTRAZIONE, 8, 10);
        DipendentePartTime partTime = new DipendentePartTime(789, Dipartimento.AMMINISTRAZIONE, 8, 10);
        Volontario volontario = new Volontario(101, Dipartimento.AMMINISTRAZIONE, "Luca", 25, "Amministrazione", 0);
        Volontario volontario2 = new Volontario(121, Dipartimento.PRODUZIONE, "Lucia", 25, "Produzione", 0);

        Dipendente1[] dipendenti = {dirigente, fullTime, partTime, volontario, volontario2};

        for (int i = 0; i < dipendenti.length; i++) {
            dipendenti[i].checkIn();
        }
    }
}

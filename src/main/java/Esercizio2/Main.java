package Esercizio2;

import Esercizio1.Dipendente1;

public class Main {
    public static void main(String[] args) {
        Dipendente1 dirigente = new Dirigente();
        Dipendente1 dipendentePartTime = new DipendentePartTime();
        Dipendente1 dipendenteFullTime = new DipendenteFullTime();

        Dipendente1 dipendenti[] = {dirigente, dipendentePartTime, dipendenteFullTime};

        double stipendio = 0;
        for(int i = 0; i < dipendenti.length; i++) {
            stipendio = stipendio + dipendenti[i].stipendio();
        }
        System.out.println("Lo stipendio totale dei dipendenti è: " + stipendio);
    }
}

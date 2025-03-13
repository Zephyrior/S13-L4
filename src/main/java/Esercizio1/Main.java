package Esercizio1;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(123, 1000, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(456, 2000, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente3 = new Dipendente(789, 3000, Dipartimento.VENDITE);

        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};

        for(int i = 0; i < dipendenti.length; i++) {
            System.out.println("Matricola: " + dipendenti[i].getMatricola() + ", Stipendio: " + dipendenti[i].getStipendio() + ", Dipartimento: " + dipendenti[i].getDipartimento());
        }
    }
}

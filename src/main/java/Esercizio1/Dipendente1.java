package Esercizio1;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Dipendente1 {
    private int matricola;
    public abstract float stipendio();
    @Setter
    @Getter
    private Dipartimento dipartimento;

    public Dipendente1(int matricola,  Dipartimento dipartimento) {
        this.matricola = matricola;

        this.dipartimento = dipartimento;
    }
    public Dipendente1(){};
}

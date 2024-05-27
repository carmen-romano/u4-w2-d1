package Esercizio3;

import exceptions.BancaException;

public class ContoOnLine extends ContoCorrente {
    double maxPrelievo;

    ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    void stampaSaldo() {

        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            saldo -= x;
        } else {
            saldo -= (x + 0.50);
        }

        if (x> maxPrelievo) {
            throw new BancaException("prelievo non disponibile");
        }

        nMovimenti++;
    }

}




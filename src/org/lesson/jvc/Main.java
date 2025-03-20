package org.lesson.jvc;

public class Main {
    public static void main(String[] args) {

        // Faccio il mio array di interi che poi passo al costruttore
        int[] cont = { 1, 2, 3, 4 };

        // Faccio oggetto di classe Interi e ci passo il mio array al costruttore
        Interi intero = new Interi(cont);

        while (intero.hasAncoraElementi()) {
            System.out.println(intero.getElementoSuccessivo());
        }

    }
}

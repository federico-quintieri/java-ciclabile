package org.lesson.jvc;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Faccio il mio array di interi che poi passo al costruttore
        int[] cont = { 1, 2, 3, 4 };

        // Faccio oggetto di classe Interi e ci passo il mio array al costruttore
        Interi intero = new Interi(cont);

        while (intero.hasAncoraElementi()) {
            System.out.println(intero.getElementoSuccessivo());
        }

        // Faccio oggetto di classe Interi senza passare array
        Interi emptyIntero = new Interi();

        for (int i = 0; i < 50; i++) {
            // Riempio l'array con 50 numeri randoms
            Random random = new Random();
            emptyIntero.addElemento(random.nextInt());
        }

        while (emptyIntero.hasAncoraElementi()) {
            System.out.println(emptyIntero.getElementoSuccessivo());
        }

    }
}

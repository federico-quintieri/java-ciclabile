package org.lesson.jvc;

// Array normali, niente collections per ora

// Elenco di interi che possiamo ciclare dal primo all'ultimo
public class Interi {
    // Attributo classe di tipo int array
    private int[] arrInteri;
    private int arrIndex; // Contatore che tiene traccia dell'index da mostrare dell'array

    // Costruttore con array di interi come parametro
    public Interi(int[] arrInteri) {
        this.arrInteri = arrInteri;
        this.arrIndex = 0;
    }

    // Restituisce prossimo elemento rispetto all'ultima volta che è stato invocato
    public int getElementoSuccessivo() {
        int result = -1;
        if (this.arrIndex < arrInteri.length) {
            result = this.arrInteri[this.arrIndex];
            this.arrIndex++;// Aumentiamo l'index per la prossima chiamata del metodo
        }
        return result;
    };

    // Restituisce true se ci sono ancora elementi da restituire
    public boolean hasAncoraElementi() {
        if (this.arrIndex >= arrInteri.length)
            return false;
        else
            return true;
    };


}

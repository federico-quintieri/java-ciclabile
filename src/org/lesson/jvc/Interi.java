package org.lesson.jvc;

// Array normali, niente collections per ora

// Elenco di interi che possiamo ciclare dal primo all'ultimo
public class Interi {
    // Attributo classe di tipo int array
    private int[] arrInteri;
    private int arrIndex; // Indice per l'iterazione
    private int size; // Numero reale di elementi nell'array

    // Costruttore senza parametri quindi partiamo con array vuoto
    public Interi() {
        this.arrInteri = new int[10]; // Partiamo con una capacità iniziale di 10
        this.arrIndex = 0;
        this.size = 0;
    }

    // Costruttore con array di interi come parametro
    public Interi(int[] arrInteri) {
        this.arrInteri = arrInteri;
        this.arrIndex = 0;
        this.size = arrInteri.length;
    }

    // Restituisce prossimo elemento rispetto all'ultima volta che è stato invocato
    public int getElementoSuccessivo() {
        if (this.arrIndex < this.size) {
            return this.arrInteri[this.arrIndex++];
        }
        return -1; // Indica che non ci sono più elementi
    }

    // Restituisce true se ci sono ancora elementi da restituire
    public boolean hasAncoraElementi() {
        return this.arrIndex < this.size;
    }

    // Metodo che aggiunge un nuovo intero all'array della classe
    public void addElemento(int newElement) {
        // Se l'array è pieno, raddoppiamo la sua capacità
        if (this.size == this.arrInteri.length) {
            int[] newArray = new int[this.arrInteri.length * 2]; // Raddoppiamo la dimensione
            System.arraycopy(this.arrInteri, 0, newArray, 0, this.size);
            this.arrInteri = newArray;
        }

        // Aggiungiamo il nuovo elemento
        this.arrInteri[this.size] = newElement;
        this.size++;
    }
}

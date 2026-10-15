package listas.simple;

/**
*Elemento nodo de una lista simple
*@autor Ángel de Jesús Nolasco Rivera
*@date 15 Octubre 2026
*/

public class Nodo {
    private int valor;
    private Nodo sig;

    // Constructor por defecto
    public Nodo() {
        this.valor = 0;
        this.sig = null;
    }

    // Constructor con parámetros
    public Nodo(int valor) {
        this.valor = valor;
        this.sig = null;
    }

    // Métodos Getter y Setter
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
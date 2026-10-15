package listas.simple;

/**
 * Definicion de una lista simple
 * @autor Ángel de Jesús Nolasco Rivera
 * @date 15 Octubre 2026
 */
public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    // Implementación de insertarAlInicio
    public void insertarAlInicio(int valor) {
        if (cabeza == null) {
            Nodo t = new Nodo(valor);
            cabeza = t;
        } else {
            Nodo t = new Nodo(valor);
            t.setSig(cabeza);
            cabeza = t;
        }
    } 

    // Implementación de recorrer
    public void recorrer() {
        if (cabeza == null) {
            System.out.println("Lista Vacia");
            return;
        }
        
        // Declaramos e inicializamos nuestro iterador apuntando a la cabeza
        Nodo itera = cabeza;
        
        // Recorremos mientras el nodo actual exista
        while (itera != null) {
            System.out.print("Valor: " + itera.getValor() + " -> ");
            // Avanzamos al siguiente nodo de forma correcta
            itera = itera.getSig();
        }
        System.out.println("null");
    }
}


package listas.simples;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos un objeto de nuestra lista simple
        ListaSimple miLista = new ListaSimple();

        // 2. Probamos recorrer una lista vacía
        System.out.println("--- Estado inicial ---");
        miLista.recorrer();

        // 3. Insertamos elementos al inicio
        // Si insertamos 30, luego 20, y luego 10 al inicio, 
        // el orden final de la lista será: 10 -> 20 -> 30 -> null
        System.out.println("\n--- Insertando elementos ---");
        miLista.insertarAlInicio(30);
        miLista.insertarAlInicio(20);
        miLista.insertarAlInicio(10);

        // 4. Probamos recorrer la lista con elementos
        System.out.println("\n--- Recorriendo la lista ---");
        miLista.recorrer();
    }
}
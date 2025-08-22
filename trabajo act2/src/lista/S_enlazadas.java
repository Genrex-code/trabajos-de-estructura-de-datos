package lista;

public class S_enlazadas<T> {
    private NodoSimple<T> head;

    public S_enlazadas() {
        head = null;
    }

    // AGREGAR un nuevo nodo
    public void agregar(T dato) {
        NodoSimple<T> nuevo = new NodoSimple<>(dato);
        if (head == null) {
            head = nuevo;
        } else {
            NodoSimple<T> actual = head;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    // ELIMINAR un nodo por dato
    public boolean eliminar(T dato) {
        if (head == null) return false;
        if (head.getDato().equals(dato)) {
            head = head.getSiguiente();
            return true;
        }
        NodoSimple<T> actual = head;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getDato().equals(dato)) {
            actual = actual.getSiguiente();
        }
        if (actual.getSiguiente() == null) return false;
        actual.setSiguiente(actual.getSiguiente().getSiguiente());
        return true;
    }

    // BUSCAR un nodo
    public boolean buscar(T dato) {
        NodoSimple<T> actual = head;
        while (actual != null) {
            if (actual.getDato().equals(dato)) return true;
            actual = actual.getSiguiente();
        }
        return false;
    }

    // VER todos los nodos
    public void ver() {
        NodoSimple<T> actual = head;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}
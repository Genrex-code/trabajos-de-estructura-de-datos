package lista;

public class C_enlazadas<T> {
    private NodoCircular<T> head;

    public C_enlazadas() {
        head = null;
    }

    // AGREGAR
    public void agregar(T dato) {
        NodoCircular<T> nuevo = new NodoCircular<>(dato);
        if (head == null) {
            head = nuevo;
            head.setSiguiente(head);
        } else {
            NodoCircular<T> actual = head;
            while (actual.getSiguiente() != head) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            nuevo.setSiguiente(head);
        }
    }

    // ELIMINAR
    public boolean eliminar(T dato) {
        if (head == null) return false;
        NodoCircular<T> actual = head, anterior = null;
        do {
            if (actual.getDato().equals(dato)) {
                if (anterior == null) {
                    if (head.getSiguiente() == head) {
                        head = null;
                    } else {
                        NodoCircular<T> ultimo = head;
                        while (ultimo.getSiguiente() != head) {
                            ultimo = ultimo.getSiguiente();
                        }
                        head = head.getSiguiente();
                        ultimo.setSiguiente(head);
                    }
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                    if (actual == head) head = actual.getSiguiente();
                }
                return true;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        } while (actual != head);
        return false;
    }

    // BUSCAR
    public boolean buscar(T dato) {
        if (head == null) return false;
        NodoCircular<T> actual = head;
        do {
            if (actual.getDato().equals(dato)) return true;
            actual = actual.getSiguiente();
        } while (actual != head);
        return false;
    }

    // VER
    public void ver() {
        if (head == null) return;
        NodoCircular<T> actual = head;
        do {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        } while (actual != head);
    }
}
public class C_enlazadas<T> {
    private NodoCircular<T> head;

    public C_enlazadas() {
        head = null;
    }
/// awebo copiar y pegar de nuevo aca se insercan las cosas en el nodo
    public void insertar(T dato) {
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
///  aca se eliminan
    public boolean eliminar(T dato) {
        if (head == null) return false;
        NodoCircular<T> actual = head;
        NodoCircular<T> previo = null;

        do {
            if (actual.getDato().equals(dato)) {
                if (previo != null) {
                    previo.setSiguiente(actual.getSiguiente());
                    if (actual == head) {
                        head = actual.getSiguiente();
                    }
                } else {
                    // Si solo hay un nodo
                    if (actual.getSiguiente() == head) {
                        head = null;
                    } else {
                        NodoCircular<T> ultimo = head;
                        while (ultimo.getSiguiente() != head) {
                            ultimo = ultimo.getSiguiente();
                        }
                        head = head.getSiguiente();
                        ultimo.setSiguiente(head);
                    }
                }
                return true;
            }
            previo = actual;
            actual = actual.getSiguiente();
        } while (actual != head);
        return false;
    }
/// aca se buscan en el nodo
    public boolean buscar(T dato) {
        if (head == null) return false;
        NodoCircular<T> actual = head;
        do {
            if (actual.getDato().equals(dato)) return true;
            actual = actual.getSiguiente();
        } while (actual != head);
        return false;
    }
///  y aca se muestran
    public void mostrar() {
        if (head == null) return;
        NodoCircular<T> actual = head;
        do {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        } while (actual != head);
    }
}
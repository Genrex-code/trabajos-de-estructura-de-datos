package lista;

public class D_enlazadas<T> {
    private NodoDoble<T> head;

    public D_enlazadas() {
        head = null;
    }

    // AGREGAR
    public void agregar(T dato) {
        NodoDoble<T> nuevo = new NodoDoble<>(dato);
        if (head == null) {
            head = nuevo;
        } else {
            NodoDoble<T> actual = head;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            nuevo.setAnterior(actual);
        }
    }

    // ELIMINAR
    public boolean eliminar(T dato) {
        if (head == null) return false;
        if (head.getDato().equals(dato)) {
            head = head.getSiguiente();
            if (head != null) head.setAnterior(null);
            return true;
        }
        NodoDoble<T> actual = head;
        while (actual != null && !actual.getDato().equals(dato)) {
            actual = actual.getSiguiente();
        }
        if (actual == null) return false;
        if (actual.getAnterior() != null) actual.getAnterior().setSiguiente(actual.getSiguiente());
        if (actual.getSiguiente() != null) actual.getSiguiente().setAnterior(actual.getAnterior());
        return true;
    }

    // BUSCAR
    public boolean buscar(T dato) {
        NodoDoble<T> actual = head;
        while (actual != null) {
            if (actual.getDato().equals(dato)) return true;
            actual = actual.getSiguiente();
        }
        return false;
    }

    // VER
    public void ver() {
        NodoDoble<T> actual = head;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}

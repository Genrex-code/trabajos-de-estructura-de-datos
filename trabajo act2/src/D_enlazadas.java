public class D_enlazadas<T> {
    private NodoDoble<T> head;

    public D_enlazadas() {
        head = null;
    }
///  aca se le meten los datos ( ojala cada que tenga que hacer algo el cabron que
///  hiso java le salga mal y explote ) y lo weno que ya es casi copiar y pegar asi que chido :D
    public void insertar(T dato) {
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
/// aca se quitan las cosas
    public boolean eliminar(T dato) {
        if (head == null) return false;
        NodoDoble<T> actual = head;
        while (actual != null && !actual.getDato().equals(dato)) {
            actual = actual.getSiguiente();
        }
        if (actual == null) return false;
        if (actual == head) {
            head = head.getSiguiente();
            if (head != null) head.setAnterior(null);
        } else {
            actual.getAnterior().setSiguiente(actual.getSiguiente());
            if (actual.getSiguiente() != null) {
                actual.getSiguiente().setAnterior(actual.getAnterior());
            }
        }
        return true;
    }
/// aca se buscan las cosas
    public boolean buscar(T dato) {
        NodoDoble<T> actual = head;
        while (actual != null) {
            if (actual.getDato().equals(dato)) return true;
            actual = actual.getSiguiente();
        }
        return false;
    }
/// aca se muestran las cosas en caso de que esta chingadera funcione
    public void mostrar() {
        NodoDoble<T> actual = head;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}

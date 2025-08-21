///aca es la parte de la insertar y son las 8:37 pm
public class S_enlazadas<T> {
    private NodoSimple<T> head;

    public S_enlazadas() {
        head = null;
    }

    public void insertar(T dato) {
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
///  aca se quitan las madres esas 9:54
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
///  aca se buscan las chingaderas esas 10:30
    public boolean buscar(T dato) {
        NodoSimple<T> actual = head;
        while (actual != null) {
            if (actual.getDato().equals(dato)) return true;
            actual = actual.getSiguiente();
        }
        return false;
    }
///  aca se miran si en cas ode que la cosa esta funcione ya me rindo de poner la ora
    public void mostrar() {
        NodoSimple<T> actual = head;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}

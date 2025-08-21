/// aca se ve como el nodo esta en español porque ya me canse de escribir en pinshe ingles y que chingue a su madre
///  el america
/// nota 2 : en la siguiente parte es donde defino variables que estan en la libreta del alex y ya ahi acomodo
/// todo el desmadre ese.
public class NodoSimple<T> {
    private T dato;
    private NodoSimple<T> siguiente;
/// aca en esta parte de codigo que sigue es donde se agregaran las tematizasiones del restaurant
    public NodoSimple(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    public T getDato() {
        return dato;
    }
    public NodoSimple<T> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoSimple<T> siguiente) {
        this.siguiente = siguiente;
    }
}
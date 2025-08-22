package lista;

public class NodoCircular<T> {
    private T dato;
    private NodoCircular<T> siguiente;

    public NodoCircular(T dato) {
        this.dato = dato;
        this.siguiente = this;
    }

    public T getDato() { return dato; }
    public NodoCircular<T> getSiguiente() { return siguiente; }
    public void setSiguiente(NodoCircular<T> siguiente) { this.siguiente = siguiente; }
}

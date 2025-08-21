public class NodoDoble<T> {
    private T dato;
    private NodoDoble<T> siguiente;
    private NodoDoble<T> anterior;
/// aca en esta parte de codigo que sigue es donde se agregaran las tematizasiones del restaurant
    public NodoDoble(T dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
    public T getDato() {
        return dato;
    }
    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }
    public NodoDoble<T> getAnterior() {
        return anterior;
    }
    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }
}

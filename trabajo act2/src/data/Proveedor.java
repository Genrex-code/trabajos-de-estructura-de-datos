package data;

public class Proveedor {
    private String nombre;
    private String telefono;
    private String producto;

    public Proveedor(String nombre, String telefono, String producto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Proveedor: " + nombre + " | Teléfono: " + telefono + " | Producto: " + producto;
    }
}
///aca se queda como una posible contenedor general si asi lo requiere la situacion
/// si lo use al final xd
package data;

public class DataTypeExample {
    private String nombre;
    private int telefono;
    private int mesa;
    private String descripcion;
    private double precio;

    public DataTypeExample(String nombre) {
        this.nombre = nombre;
    }

    public DataTypeExample(String nombre, int telefono, int mesa) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mesa = mesa;
    }

    public DataTypeExample(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public DataTypeExample(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getTelefono() { return telefono; }
    public void setTelefono(int telefono) { this.telefono = telefono; }

    public int getMesa() { return mesa; }
    public void setMesa(int mesa) { this.mesa = mesa; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        if (descripcion != null) {
            return "Platillo: " + nombre + " | " + descripcion + " | $" + precio;
        } else if (mesa != 0) {
            return "Cliente: " + nombre + " | Tel: " + telefono + " | Mesa: " + mesa;
        } else if (telefono != 0) {
            return "Proveedor: " + nombre + " | Tel: " + telefono;
        } else {
            return nombre;
        }
    }
}

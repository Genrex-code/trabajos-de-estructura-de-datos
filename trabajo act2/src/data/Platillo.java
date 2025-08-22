package data;

public class Platillo {
    private String nombre;
    private double precio;

    public Platillo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Platillo: " + nombre + " | Precio: $" + precio;
    }
}
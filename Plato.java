// Clase que representa un plato
public class Plato {
    private String nombre;
    private double precio;

    // Constructor
    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Bebida implements IReceta{
    // Atributos
    private String nombre;
    private String descripcion;
    private int tiempoPreparacion;
    private List<String> ingredientes;

    // Constructor
    Bebida(String nombre){
        this.nombre = nombre;
        this.ingredientes = new ArrayList<>();
    }

    // Getters
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public String getDescripcion() {
        return descripcion;
    }
    @Override
    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }
    @Override
    public List<String> getIngredientes() {
        return ingredientes;
    }
    
    // Setters
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }
    @Override
    public void agregarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    // Metodos
    @Override
    public void imprimirReceta() {
        System.out.println("\nBebida." +
                           "\nNombre: " + nombre +
                           "\nDescripcion: " + descripcion +
                           "\nTiempo de preparacion: " + tiempoPreparacion + " min" +
                           "\nIngredientes: " + ingredientes);   
    } 
}
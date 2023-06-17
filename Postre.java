import java.util.ArrayList;
import java.util.List;

public class Postre implements IReceta{
    // Atributos
    private String nombre;
    private String descripcion;
    private int tiempoPreparacion;
    private List<String> ingredientes;
    
    // Constructor
    Postre(String nombre){
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
        System.out.println("\nPostre." +
                           "\nNombre: " + nombre +
                           "\nDescripcion: " + descripcion +
                           "\nTiempo de preparacion: " + tiempoPreparacion + " min" +
                           "\nIngredientes: " + ingredientes);   
    } 
}

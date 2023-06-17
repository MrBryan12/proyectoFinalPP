import java.util.List;

public interface IReceta {
    // Metododos
    String getNombre();
    void setNombre(String nombre);

    String getDescripcion();
    void setDescripcion(String descripcion);

    int getTiempoPreparacion();
    void setTiempoPreparacion(int tiempoPreparacion);

    List<String> getIngredientes();
    void agregarIngrediente(String ingrediente);

    void imprimirReceta();
}

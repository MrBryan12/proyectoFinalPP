import java.util.ArrayList;
import java.util.List;

// Enumeración que representa los posibles estados de un pedido
enum EstadoPedido {
    PENDIENTE,
    EN_PROGRESO,
    ENTREGADO,
    CANCELADO
}

//Clase que representa un pedido
public class Pedido {
    private int idPedido;
    private EstadoPedido estado;
    private List<Plato> platos;
    private Cliente clientes; //Agregación
    private Repartidor repartidor; //Composición

    //Constructor
    public Pedido(int idPedido, EstadoPedido estado, List<Plato> platos, Cliente clientes, String nombre, String numeroTelefono){
        this.idPedido = idPedido;
        this.estado = estado;
        this.platos = new ArrayList<>();
        this.clientes = clientes;//Agregación
        repartidor = new Repartidor(nombre, numeroTelefono); //Composición (Nota: Este es un ejemplo, los parametros del constructor los definira Arturo en la clase Repartidor y tendremos que poner los mismos aqui. al igual que en el constructor)
    }

    // Métodos setters y getters

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(List<Plato> platos) {
        this.platos = platos;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    //Métodos

    public void agregarPlato(String nombre, double precio) {
    Plato plato = new Plato(nombre, precio);
    platos.add(plato);
}
    public void eliminarPlato(String nombrePlato) {
    Plato platoAEliminar = null;
    for (Plato plato : platos) {
        if (plato.getNombre().equals(nombrePlato)) {
            platoAEliminar = plato;
            break;
        }
    }

    if (platoAEliminar != null) {
        platos.remove(platoAEliminar);
        System.out.println("Plato \"" + nombrePlato + "\" eliminado del pedido.");
    } else {
        System.out.println("No se encontró el plato \"" + nombrePlato + "\" en el pedido.");
    }
}

    // Método para calcular el total del pedido
    public double calcularTotal() {
        double total = 0;
        for (Plato plato : platos) {
            total += plato.getPrecio();
        }
        return total;
    }

    // Método para cambiar el estado del pedido
    public void cambiarEstado(EstadoPedido nuevoEstado) {
        estado = nuevoEstado;
        System.out.println("El estado del pedido #" + idPedido + " ha sido cambiado a: " + nuevoEstado);
    }

    // Método para imprimir el resumen del pedido
    public void imprimirResumen() {
        System.out.println("Pedido #" + idPedido);
        System.out.println("Cliente: " + clientes.getNombre());
        System.out.println("Platos:");

        for (Plato plato : platos) {
            System.out.println("- " + plato.getNombre() + " - $" + plato.getPrecio());
        }

        System.out.println("Total: $" + calcularTotal());
        System.out.println("Estado: " + estado);
    }

    public void add(Pedido pedido) {
    }

    public void remove(Pedido pedido) {
    }
}

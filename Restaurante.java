import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private Pedido pedido;        //Composición
    private List<IReceta> recetas; //Composición

    public Restaurante(int idPedido, EstadoPedido estado, List<Plato> platos, Cliente clientes, String nombre, String numeroTelefono) {
        recetas = new ArrayList<>();
        pedido = new Pedido(idPedido, estado, platos, clientes, nombre, numeroTelefono);
    }

    public void agregarPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void eliminarPedido() {
        this.pedido = null;
    }

    public void agregarReceta(IReceta receta) {
        recetas.add(receta);
    }

    public void eliminarReceta(IReceta receta) {
        recetas.remove(receta);
    }

    public List<Pedido> getPedidos() {
        List<Pedido> listaPedidos = new ArrayList<>();
        if (pedido != null) {
            listaPedidos.add(pedido);
        }
        return listaPedidos;
    }

    public List<IReceta> getRecetas() {
        return recetas;
    }

    public Pedido buscarPedidoPorId(int idPedido) {
        if (pedido != null && pedido.getIdPedido() == idPedido) {
            return pedido;
        }
        return null;
    }
}

package Clases;

import java.util.List;

public class Cliente extends Persona {

  protected String domicilio;
  protected String metodo_pago;
  protected List<IReceta> pedidos;

  // CONSTRUCTOR
  public Cliente(
    String nombre,
    int edad,
    String domicilio,
    String metodo_pago,
    List<IReceta> pedidos
  ) {
    super(nombre, edad);
    this.domicilio = domicilio;
    this.metodo_pago = metodo_pago;
    this.domicilio = domicilio;
    this.pedidos = pedidos;
  }

  // SOBREESCRIBE SETTERS

  @Override
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public void setEdad(int edad) {
    this.edad = edad;
  }

  // SOBRESCRIBE GETTERS

  @Override
  public int getedad() {
    return edad;
  }

  @Override
  public String getNombre() {
    return nombre;
  }
}

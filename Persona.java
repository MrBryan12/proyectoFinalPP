package Clases;

public abstract class Persona {

  protected String nombre;
  protected int edad;

  // CONSTRUCTOR
  public Persona(String nombre, int edad) {}

  // SET ABSTRACTO
  public abstract void setNombre(String nombre);

  public abstract void setEdad(int edad);

  //GET ABSTRACTO
  public abstract String getNombre();

  public abstract int getedad();
}

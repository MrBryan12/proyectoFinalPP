package Clases;

public class Repartidor extends Persona {

  protected String medio_trasnporte;
  protected int tiempo_estimado_llegado;
  protected int score;
  protected String num_telefono;

  public Repartidor(
    int tiempo_estimado_llegado,
    int score,
    String medio_trasnporte,
    String nombre,
    int edad,
    String num_telefono
  ) {
    super(nombre, edad);
    this.tiempo_estimado_llegado = tiempo_estimado_llegado;
    this.medio_trasnporte = medio_trasnporte;
    this.score = score;
    this.num_telefono = num_telefono;
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

  // SETTERS PROPIOS DE REPARTIDOR
  public void setMedio_trasnporte(String medio_trasnporte) {
    this.medio_trasnporte = medio_trasnporte;
  }

  public void setTiempo_estimado_llegado(int tiempo_estimado_llegado) {
    this.tiempo_estimado_llegado = tiempo_estimado_llegado;
  }

  public void setScore(int score) {
    this.score = score;
  }

  // SETTERS PROPIOS DE REPARTIDOR
  public String getMedio_trasnporte() {
    return medio_trasnporte;
  }

  //GETTERS PROPIOS DE REPARTIDOR
  public int getTiempo_estimado_llegado() {
    return tiempo_estimado_llegado;
  }

  public int getScore() {
    return score;
  }
}

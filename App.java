public class App {
    public static void main(String[] args) {
        Bebida bebida = new Bebida("Cafe con leche");
        bebida.setDescripcion("Cafe con leche y azucar");
        bebida.setTiempoPreparacion(5);
        bebida.agregarIngrediente("Cafe");
        bebida.agregarIngrediente("Leche");
        bebida.imprimirReceta();

        Postre postre = new Postre("Torta de chocolate");
        postre.setDescripcion("Torta de chocolate tres leches");
        postre.setTiempoPreparacion(60);
        postre.agregarIngrediente("Chocolate");
        postre.agregarIngrediente("Leche");
        postre.agregarIngrediente("Huevo");
        postre.agregarIngrediente("Harina");
        postre.imprimirReceta();
    }
}

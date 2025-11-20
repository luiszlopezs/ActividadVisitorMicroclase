public class Main {
    public static void main(String[] args) {

        Producto libro = new Libro("El principito", 50);
        Producto camiseta = new Ropa("Camiseta Nike", 80);
        Producto celular = new Electronica("Samsung A5400", 1200);

        Visitor descuento = new VisitorDescuento();
        Visitor etiqueta = new VisitorEtiqueta();

        libro.accept(etiqueta);
        camiseta.accept(etiqueta);
        celular.accept(etiqueta);
        libro.accept(descuento);
        camiseta.accept(descuento);
        celular.accept(descuento);
    }
}

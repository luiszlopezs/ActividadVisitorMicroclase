public class VisitorEtiqueta implements Visitor {

    @Override
    public void visit(Libro libro) {
        System.out.println("=== ETIQUETA LIBRO ===");
        System.out.println("Nombre: " + libro.getNombre());
        System.out.println("Categoria: Libro");
        System.out.println("Precio: $" + libro.getPrecio());
        System.out.println("------------------------------");
    }

    @Override
    public void visit(Ropa ropa) {
        System.out.println("=== ETIQUETA ROPA ===");
        System.out.println("Nombre: " + ropa.getNombre());
        System.out.println("Categoria: Ropa");
        System.out.println("Precio: $" + ropa.getPrecio());
        System.out.println("------------------------------");
    }

    @Override
    public void visit(Electronica electronica) {
        System.out.println("=== ETIQUETA ELECTRÓNICA ===");
        System.out.println("Nombre: " + electronica.getNombre());
        System.out.println("Categoria: Electronica");
        System.out.println("Precio: $" + electronica.getPrecio());
        System.out.println("------------------------------");
    }
}

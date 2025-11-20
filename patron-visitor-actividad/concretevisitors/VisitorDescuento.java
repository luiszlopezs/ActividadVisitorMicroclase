public class VisitorDescuento implements Visitor {

    @Override
    public void visit(Libro libro) {
        double descuento = libro.getPrecio() * 0.10; 
        double finalPrecio = libro.getPrecio() - descuento;

        System.out.println("Libro: " + libro.getNombre());
        System.out.println("Precio original: $" + libro.getPrecio());
        System.out.println("Descuento aplicado: 10%");
        System.out.println("Precio final: $" + finalPrecio);
        System.out.println("------------------------------");
    }

    @Override
    public void visit(Ropa ropa) {
        double descuento = ropa.getPrecio() * 0.15; 
        double finalPrecio = ropa.getPrecio() - descuento;

        System.out.println("Ropa: " + ropa.getNombre());
        System.out.println("Precio original: $" + ropa.getPrecio());
        System.out.println("Descuento aplicado: 15%");
        System.out.println("Precio final: $" + finalPrecio);
        System.out.println("------------------------------");
    }

    @Override
    public void visit(Electronica electronica) {
        double descuento = electronica.getPrecio() * 0.05;  
        double finalPrecio = electronica.getPrecio() - descuento;

        System.out.println("Electrónica: " + electronica.getNombre());
        System.out.println("Precio original: $" + electronica.getPrecio());
        System.out.println("Descuento aplicado: 5%");
        System.out.println("Precio final: $" + finalPrecio);
        System.out.println("------------------------------");
    }
}

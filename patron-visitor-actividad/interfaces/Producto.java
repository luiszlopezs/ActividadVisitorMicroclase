public interface Producto {
    void accept(Visitor visitor);  
    String getNombre();
    double getPrecio();
}

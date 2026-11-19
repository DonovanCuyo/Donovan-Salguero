class MainProducto {
public static void main(String[] args) {
Producto p1 = new Producto(1, "Teclado", 80000);
Producto p2 = new Producto(2, "Mouse", 45000);
Producto p3 = new Producto(3, "Monitor", 650000);
Producto pCopia = p1;
actualizarPrecio(pCopia, 95000);
System.out.println("Precio desde p1: " + p1.getPrecio());
System.out.println("Precio desde pCopia: " + pCopia.getPrecio());
p1 = null;
pCopia = null;
System.out.println("Productos restantes accesibles:");
p2.mostrar();
p3.mostrar();
}
public static void actualizarPrecio(Producto producto, double precio) {
producto.actualizarPrecio(precio);
}
}


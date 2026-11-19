public class Producto {
private int codigo;
private String nombre;
private double precio;
public Producto(int codigo, String nombre, double precio) {
this.codigo = codigo;
this.nombre = nombre;
this.precio = precio;
}
public void actualizarPrecio(double nuevoPrecio) {
this.precio = nuevoPrecio;
}
public double getPrecio() {
return precio;
}
public void mostrar() {
System.out.println(codigo + " - " + nombre + " - $" + precio);
}
}
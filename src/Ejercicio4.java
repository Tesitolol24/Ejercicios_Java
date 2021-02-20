import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        //Ejercicio 4
        double precioProducto = 0;
        double precioConIva = 0;
        int iva = 21;

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el Precio del Producto");
        precioProducto = lector.nextDouble();

        precioConIva = ((iva * precioProducto) / 100)+precioProducto;
        System.out.println("El precio con IVA es: "+precioConIva);
    }
}


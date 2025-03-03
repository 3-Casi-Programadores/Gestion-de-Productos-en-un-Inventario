import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GestionInventario {

    // HashMap para almacenar los productos con su cantidad
    private static final HashMap<String, Integer> inventario = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Menú interactivo
        do {
            System.out.println("\n*** Gestión de Inventario ***");
            System.out.println("1. Registrar producto");
            System.out.println("2. Actualizar stock");
            System.out.println("3. Mostrar todos los productos");
            System.out.println("4. Filtrar productos con stock menor a 10");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del Scanner

            switch (opcion) {
                case 1:
                    registrarProducto(scanner);
                    break;
                case 2:
                    actualizarStock(scanner);
                    break;
                case 3:
                    mostrarProductos();
                    break;
                case 4:
                    filtrarProductosBajoStock();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    // Método para registrar un nuevo producto en el inventario
    private static void registrarProducto(Scanner scanner) {
        System.out.print("Ingresa el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa la cantidad disponible: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del Scanner

        if (inventario.containsKey(nombre)) {
            System.out.println("El producto ya existe en el inventario.");
        } else {
            inventario.put(nombre, cantidad);
            System.out.println("Producto registrado exitosamente.");
        }
    }

    // Método para actualizar el stock de un producto
    private static void actualizarStock(Scanner scanner) {
        System.out.print("Ingresa el nombre del producto a actualizar: ");
        String nombre = scanner.nextLine();

        if (inventario.containsKey(nombre)) {
            System.out.print("Ingresa la nueva cantidad disponible: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del Scanner
            inventario.put(nombre, cantidad);
            System.out.println("Stock actualizado exitosamente.");
        } else {
            System.out.println("El producto no existe en el inventario.");
        }
    }

    // Método para mostrar todos los productos y sus cantidades
    private static void mostrarProductos() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("\nProductos en el inventario:");
            for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
                System.out.println("Producto: " + entry.getKey() + " | Cantidad: " + entry.getValue());
            }
        }
    }

    // Método para filtrar y mostrar productos con stock menor a 10 unidades
    private static void filtrarProductosBajoStock() {
        System.out.println("\nProductos con stock menor a 10 unidades:");

        // Usamos Streams y Lambda para filtrar productos con stock bajo
        inventario.entrySet().stream()
                .filter(entry -> entry.getValue() < 10) // Filtramos productos con stock < 10
                .forEach(entry -> System.out.println("Producto: " + entry.getKey() + " | Cantidad: " + entry.getValue()));
    }
}

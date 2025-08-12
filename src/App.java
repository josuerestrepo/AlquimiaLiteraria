import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clientes gestor = new Clientes(); 
        Libros gestorLibros = new Libros();
        int opcion;
        System.out.println("Bienvenido al sistema de gestión de clientes");

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Mostrar todos los clientes");
            System.out.println("3. Agregar libro");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    gestor.aggcliente(); 
                    break;
                case 2:
                    gestor.mostrartodos(); 
                    break;
                case 3:
                    System.out.println("Saliendo.");
                    break;
                case 4:
                    gestorLibros.agregarLibro(scanner);
                    break;
                case 5:
                    gestorLibros.mostrarListaLibros();
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
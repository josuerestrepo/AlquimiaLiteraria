import java.util.ArrayList;
import java.util.Scanner;

public class Libros {

    // Clase interna para representar un libro
    public static class Libro {
        private String titulo;
        private String autor;
        private double precio;

        public Libro(String titulo, String autor, double precio) {
            this.titulo = titulo;
            this.autor = autor;
            this.precio = precio;
        }

        public void mostrarDatos() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Precio: " + precio);
        }

        // Getters y setters
        public String getTitulo() { return titulo; }
        public void setTitulo(String titulo) { this.titulo = titulo; }
        public String getAutor() { return autor; }
        public void setAutor(String autor) { this.autor = autor; }
        public double getPrecio() { return precio; }
        public void setPrecio(double precio) { this.precio = precio; }
    }

    // Lista de libros
    private final ArrayList<Libro> listaLibros = new ArrayList<>();

    // Método para agregar un libro
    public void agregarLibro(Scanner scanner) {
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el precio del libro:");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // limpiar el buffer

        Libro nuevoLibro = new Libro(titulo, autor, precio);
        listaLibros.add(nuevoLibro);

        System.out.println("Libro agregado exitosamente.");
    }

    // Método para mostrar todos los libros
    public void mostrarListaLibros() {
        System.out.println("Lista de libros:");
        for (Libro libro : listaLibros) {
            libro.mostrarDatos();
            System.out.println("-----------------------");
        }
    }
}

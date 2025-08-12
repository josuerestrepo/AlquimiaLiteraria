import java.util.ArrayList;
import java.util.Scanner;

public class Libros {


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

 
        public String getTitulo() { return titulo; }
        public void setTitulo(String titulo) { this.titulo = titulo; }
        public String getAutor() { return autor; }
        public void setAutor(String autor) { this.autor = autor; }
        public double getPrecio() { return precio; }
        public void setPrecio(double precio) { this.precio = precio; }
    }

    private final ArrayList<Libro> listaLibros = new ArrayList<>();


    public void agregarLibro(Scanner scanner) {
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el precio del libro:");
        double precio = scanner.nextDouble();
        scanner.nextLine(); 

        Libro nuevoLibro = new Libro(titulo, autor, precio);
        listaLibros.add(nuevoLibro);

        System.out.println("Libro agregado exitosamente.");
    }

 
    public void mostrarListaLibros() {
        System.out.println("Lista de libros:");
        for (Libro libro : listaLibros) {
            libro.mostrarDatos();
            System.out.println("-----------------------");
        }
    }
}

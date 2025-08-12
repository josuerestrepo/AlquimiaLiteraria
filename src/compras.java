import java.util.Scanner;

public class compras {
    private int id_compra;
    private int id_cliente;
    private int id_libros;
    private int valor;

    public void compra(int id_compra, int id_cliente, int id_libros, int valor) {
        this.id_compra = id_compra;
        this.id_cliente = id_cliente;
        this.id_libros = id_libros;
        this.valor = valor;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_libros() {
        return id_libros;
    }

    public void setId_libros(int id_libros) {
        this.id_libros = id_libros;
    }

    public int getFecha_compra() {
        return valor;
    }

    public void setFecha_compra(int valor) {
        this.valor = valor;
    }


    public void ingresar_datos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nvalor de la compra: ");
        valor = sc.nextInt();
    }
    


    public void mostrar_datos() {
        System.out.println("\nID de Compras: " + id_compra);
        System.out.println("ID de Cliente: " + id_cliente);
        System.out.println("ID de Libros: " + id_libros);
        System.out.println("Fecha de Compra: " + valor);
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class Clientes {

    public static class Cliente {
        private String nombre;
        private String identity;
        private String direccion;
        private String telefono;

        public Cliente(String nombre, String identity, String direccion, String telefono) {
            this.nombre = nombre;
            this.identity = identity;
            this.direccion = direccion;
            this.telefono = telefono;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getIdentity() {
            return identity;
        }

        public void setIdentity(String identity) {
            this.identity = identity;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
        public void mostrarDatos(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Identidad: " + identity);
            System.out.println("Dirección: " + direccion);
            System.out.println("Teléfono: " + telefono);
        }
    }
    private  final ArrayList<Cliente> listaClientes = new ArrayList<>();
    public void aggcliente (){
    Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();
        System.out.println("ingrese la cédula del cliente:");
        String cedula = scanner.nextLine();
        System.out.println("ingrese la dirección del cliente:");
        String direccion = scanner.nextLine();
        System.out.println("ingrese el teléfono del cliente:");
        String telefono = scanner.nextLine();

        Cliente nuevoCliente = new Cliente(nombre, cedula, direccion, telefono);
        listaClientes.add(nuevoCliente);
        System.out.println("espera un momento estamos validando los datos.");
        scanner.nextLine();
        System.out.println("Cliente agregado exitosamente.");
    }
    public void mostrartodos(){
        if(listaClientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Lista de clientes:");
            for (Cliente cliente : listaClientes) {
                cliente.mostrarDatos();
                System.out.println("--------------------");
            }
        }
    }

}

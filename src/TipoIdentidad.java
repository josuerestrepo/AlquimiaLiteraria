import java.util.Scanner;

public class TipoIdentidad {
    private int id_tipo_identidad;
    private String descripcion;


    public TipoIdentidad() {
        this.id_tipo_identidad = id_tipo_identidad;
        this.descripcion = descripcion;
    }


    public int getId_tipo_identidad() {
        return this.id_tipo_identidad;
    }

    public void setId_tipo_identidad(int id_tipo_identidad) {
        this.id_tipo_identidad = id_tipo_identidad;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void ingresar_datos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el numero de su tipo de identidad (pasaporte, cedula, N documento): ");
        id_tipo_identidad = sc.nextInt();

        System.out.println("ingrese una descripcion de su identidad: ");
        descripcion = sc.nextLine();
    }


    public void mostrar_datos() {
        System.out.println("Su tipo de id es: " + id_tipo_identidad);
        System.out.println("Descripcion: " + descripcion);
    } 
}

import java.util.Scanner;

public class categoria {
    private int categoria_id;
    private String nombre_categoria;

    public categoria(){
        this.categoria_id = categoria_id;
        this.nombre_categoria = nombre_categoria;
    }


    public int getCategoria_id() {
        return this.categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getNombre_categoria() {
        return this.nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public void ingresar_datos() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese el nombre de la categoria: ");
        nombre_categoria = sc.nextLine();

    }



    public void mostrarDatos() {
        System.out.println("ID categoria: " + categoria_id);
        System.out.println("Nombre categoria: " + nombre_categoria);
    }
}

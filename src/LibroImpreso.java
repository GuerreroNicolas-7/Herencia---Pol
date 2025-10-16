public class LibroImpreso extends Padre {
    public int cantidad_ejemplares;

    public LibroImpreso() {
    }

    public LibroImpreso(String titulo, String autor, int precio, int cantidad_ejemplares , int codigo) {
        super(titulo, autor, precio, codigo);
        this.cantidad_ejemplares = cantidad_ejemplares;
    }

    public int getCantidad_ejemplares() {
        return cantidad_ejemplares;
    }

    @Override
    public String toString() {
        return "LibroImpreso{" +
                "cantidad_ejemplares=" + cantidad_ejemplares +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", codigo='" + codigo + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public String mostrarLibro() {
        return "titulo:  " + this.titulo + "\n" +
                "autor:  " + this.autor + "\n" +
                "precio:  " + this.precio + "\n" +
                "codigo:  " + "LF" + this.codigo + "\n" +
                "cantidad_ejemplares: " + this.cantidad_ejemplares;
    }

    @Override
    public void prestarLibro() {
        if (this.cantidad_ejemplares > 0) {
            System.out.println("El libro llamado " + this.titulo + " ha sido prestado");
            this.cantidad_ejemplares = cantidad_ejemplares - 1;
            System.out.println("cantidad de ejemplares restantes: " + this.cantidad_ejemplares);

        } else {
            System.out.println("Este titulo no se encuentra disponible");
        }
    }
    @Override
    public void devolverLibro(){
        System.out.println("El libro llamado " + this.titulo + " ha sido devuelto");
        this.cantidad_ejemplares = cantidad_ejemplares + 1;
        System.out.println("cantidad restante :" + this.cantidad_ejemplares);


    }
}
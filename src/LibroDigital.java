public class LibroDigital extends Padre{
    public int tamaño;
    public boolean disponibilidad;

    public LibroDigital() {
    }

    public LibroDigital(String titulo, String autor, int precio,  int tamaño, boolean disponibilidad) {
        super(titulo, autor, precio);
        this.tamaño = tamaño;
        this.disponibilidad = disponibilidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public int getTamaño() {
        return tamaño;
    }

    @Override
    public String toString() {
        return "LibroDigital{" +
                "disponibilidad=" + disponibilidad +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", tamaño=" + tamaño +
                '}';
    }

    @Override
    public String mostrarLibro(){
        return "titulo:  " + this.titulo + "\n" +
                "autor:  " + this.autor  + "\n" +
                "precio:  " + this.precio  + "\n" +
                "tamaño: " + tamaño + " mbs" + "\n" +
                "disponibilidad:  " + this.disponibilidad;

    }
    @Override
    public void prestarLibro(){
        if(this.disponibilidad == true){
            System.out.println("El libro llamado " + this.titulo + " ha sido prestado");
            this.disponibilidad = false;
            System.out.println("Estado de disponibilidad " + this.disponibilidad);

        }else{
            System.out.println("Este titulo no se encuentra disponible");

        }

    }
    @Override
    public void devolverLibro(){
        System.out.println("El libro llamado " + this.titulo + " ha sido devuelto");
        this.disponibilidad = true;
        System.out.println("Estado de disponibilidad " + this.disponibilidad);


    }


}

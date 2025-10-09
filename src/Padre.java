public class Padre {
    protected String titulo;
    protected String autor;
    protected int precio;

    public Padre() {
    }

    public Padre(String titulo, String autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Padre{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                '}';
    }

    public String mostrarLibro(){
        return "titulo:  " + this.titulo + "\n" +
                "autor:  " + this.autor  + "\n" +
                "precio:  " + this.precio;
    }
    public void prestarLibro(){

    }
    public void devolverLibro(){

    }

}

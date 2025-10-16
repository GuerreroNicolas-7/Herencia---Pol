public class Padre {
    protected String titulo;
    protected String autor;
    protected int precio;
    protected int codigo = 0;

    public Padre() {
    }

    public Padre(String titulo, String autor, int precio, int codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.codigo = codigo;

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

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Padre{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio + '\'' +
                "codigo =" + codigo  + '}';
    }

    public String mostrarLibro(){
        return "titulo:  " + this.titulo + "\n" +
                "autor:  " + this.autor  + "\n" +
                "codigo:  " + this.codigo  + "\n" +
                "precio:  " + this.precio;
    }
    public void prestarLibro(){

    }
    public void devolverLibro(){

    }

}

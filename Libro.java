public class Libro extends Publicacion {
    private String autor;

    public Libro(String titulo,int anioPublicacion,String autor) {
        super(autor,anioPublicacion);
        this.autor = autor;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String mostrarDatos(){
        return "Libro: "+getTitulo()+ " -Autor:" + getAutor() + " -Año:"+getAnioPublicacion();
    }
    public String tipoPrestamo(){
        return "Préstamo por 15 días";
    }
}

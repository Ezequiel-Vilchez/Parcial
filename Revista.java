public class Revista extends Publicacion{
    private int numeroEdicion;

    public Revista(String titulo, int anioPublicacion,int numeroEdicion){
        super(titulo, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion(){
        return this.numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion){
        this.numeroEdicion = numeroEdicion;
    }

    public String mostrarDatos(){
        return "Revista: "+getTitulo() + " -Edicion n°:"+getNumeroEdicion()+ " -Año:" + getAnioPublicacion();
    }
    public String tipoPrestamo() {
        return "Préstamo por 7 días";
    }
}

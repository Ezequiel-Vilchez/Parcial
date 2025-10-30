public class Usuario implements IGestionPrestamos{
    private String nombre;
    Publicacion[] prestamos;
    int cantidadMaxPrestamos;
    int contadorPrestamos;

    public Usuario(String nombre,int cantidadMaxPrestamos){
        this.nombre = this.nombre;
        this.cantidadMaxPrestamos = 6;
        this.contadorPrestamos = 0;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void agregarPrestamo(Publicacion p){
        this.prestamos[this.contadorPrestamos] = p;
        this.contadorPrestamos++;
    }
    @Override 
    public void mostrarPrestamos() {
        System.out.println("Préstamos de " + nombre + ":");
        for (int i = 0; i < cantidadMaxPrestamos; i++) {
            Publicacion p = prestamos[i];
            String tipo = "";
            if (p instanceof Libro) {
                tipo = ((Libro)p).tipoPrestamo();
            } else if (p instanceof Revista) {
                tipo = ((Revista)p).tipoPrestamo();
            }
            System.out.println(p.mostrarDatos() + " → " + tipo);
        }
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre());
    }

}

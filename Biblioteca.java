public class Biblioteca {
    private String nombre;
    private Publicacion[] catalogo;
    private int cantidad;

    public Biblioteca(String nombre, int tamanio) {
        this.nombre = nombre;//faltaba los metodos getters y setters
        this.catalogo = new Publicacion[tamanio];//le agregue los this a catalogo y cantidad
        this.cantidad = 0;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public void agregarPublicacion(Publicacion p) {
        if (cantidad < catalogo.length ) {// con el -1 no se podia usar el ultimo espacio
            catalogo[cantidad] = p;
            cantidad++;
        } else {
            System.out.println("No hay espacio disponible");
        }
    }

    public void mostrarCatalogo() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(catalogo[i].mostrarDatos());
        }
    }

    public void ordenarPorAnioDesc() {
        for (int i = 0; i < cantidad - 1; i++) {
          for (int j = 0; j < cantidad - i - 1; j++) {
           if (catalogo[j].getAnioPublicacion() < catalogo[j + 1].getAnioPublicacion()) {//al ser descendente tiene q se <
                    Publicacion aux = catalogo[j];
                    catalogo[j] = catalogo[j + 1];
                    catalogo[j + 1] = aux;
                }
            }
        }
    }

    public Publicacion buscarPorTitulo(String titulo) {
        for (int i = 0; i < cantidad; i++) {
            if (catalogo[i].getTitulo().equalsIgnoreCase(titulo)) {//tenia getnombre en ves de gettitulo
                return catalogo[i];
            }
        }
        return null;
    }

}    

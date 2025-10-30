public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Biblioteca b1 = new Biblioteca("Don rafa", 10);
        Libro l1 = new Libro("Don quijote", 2023, "Felipe");
        Revista r1 = new Revista("Cars", 2025, 3);
        Usuario u1 = new Usuario("Jose", 2);
        
        b1.agregarPublicacion(l1);
        b1.agregarPublicacion(r1);

        b1.mostrarCatalogo();

        b1.buscarPorTitulo("Don quijote");

        b1.ordenarPorAnioDesc();

    }
}

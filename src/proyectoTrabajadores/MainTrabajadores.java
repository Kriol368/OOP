package proyectoTrabajadores;

public class MainTrabajadores {
    public static void main(String[] args) {
        Oficial oficial = new Oficial("Manolo");
        System.out.println(oficial);
        Directivo directivo = new Directivo("Pepe");
        System.out.println(directivo);
    }
}

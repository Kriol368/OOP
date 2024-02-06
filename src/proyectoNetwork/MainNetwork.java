package proyectoNetwork;

public class MainNetwork {
    public static void main(String[] args) {
        Usuario usu1 = new Usuario("Paco");
        Mensaje mensaje1 = new Mensaje(636728,"6-2-2024","Buenos dias a todos");
        usu1.publicar(mensaje1);
        mensaje1.setUsuario(usu1);
        mensaje1.comentar("Buenos dias");
        mensaje1.meGusta();
        mensaje1.meGusta();
        mensaje1.meGusta();
        mensaje1.comentar("Buenas tardes");
        System.out.println(mensaje1);
        Imagen imagen1 = new Imagen(712894,"6-2-2024","Imagen de una piedra","piedra.jpg");
        usu1.publicar(imagen1);
        imagen1.setUsuario(usu1);
        imagen1.comentar("Me gusta tu piedra");
        imagen1.comentar("A mi no");
        imagen1.meGusta();
        System.out.println(usu1.getPublicaciones());
    }
}

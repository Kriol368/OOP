package reinoAnimal;

public class Gato extends Mamifero implements Jugar{
    public Gato(String nombre, String color) {
        super(nombre, color);
    }
    public void comunicarse(){
        super.comunicarse();
        System.out.println("Miau");
    }
    public void jugarConOvillos(){
        System.out.println("Me gusta jugar con ovillos");
    }
    public void saltarPorUnAro(){
        System.out.println("Se jugar a saltar por el aro");
    }
    public void perseguirUnObjeto(String objeto){
        System.out.println("Se jugar a perseguir un " + objeto);
    }
}

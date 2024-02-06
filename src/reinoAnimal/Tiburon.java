package reinoAnimal;

public class Tiburon extends Pez implements Jugar{
    public Tiburon(String nombre, String color) {
        super(nombre, color);
    }
    public void comunicarse(){
        System.out.println("Arqueo el cuerpo para comunicarme");
    }
    public void saltarPorUnAro(){
        System.out.println("Se jugar a saltar por el aro");
    }
    public void perseguirUnObjeto(String objeto){
        System.out.println("Se jugar a perseguir un " + objeto);
    }


}

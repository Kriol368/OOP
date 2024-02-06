package reinoAnimal;

public class PezPayaso extends Pez{
    public PezPayaso(String nombre, String color) {
        super(nombre, color);
    }
    public void comunicarse(){
        System.out.println("Me comunico mediante burbujas");
    }
}

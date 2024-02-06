package reinoAnimal;

public class Perro extends Mamifero{

    public Perro(String nombre, String color) {
        super(nombre, color);
    }
    public void comunicarse(){
        System.out.println("Guau");
    }
    public void traerZapatillas(){
        System.out.println("Toma tus zapatillas, amo");
    }
}

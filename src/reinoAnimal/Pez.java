package reinoAnimal;

public abstract class Pez extends Animal{
    public Pez(String nombre, String color) {
        super(nombre, color);
    }
    public void respirar() {
        System.out.println("Respiro por las branquias");
    }
    public void moverse(){
        System.out.println("Nado con aletas");
    }
}

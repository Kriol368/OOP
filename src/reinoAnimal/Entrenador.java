package reinoAnimal;

public class Entrenador extends Mamifero{
    public Entrenador(String nombre, String color) {
        super(nombre, color);
    }
    public void entrenar(Jugar animalQueSabeJugar){
        animalQueSabeJugar.saltarPorUnAro();
    }

    public void dejarEntrar (Animal animal){
        if (animal instanceof Jugar){
            System.out.println("Pasa y te entreno");
        }else {
            System.out.println("Lo siento, pero no sabes jugar");
        }
    }
}

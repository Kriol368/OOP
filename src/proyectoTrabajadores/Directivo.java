package proyectoTrabajadores;

public class Directivo extends Empleado{
    public Directivo(String nombre) {
        super(nombre);
    }
    public String toString(){
        return super.toString() + "\n" + "Soy un Directivo";
    }
}

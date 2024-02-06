package proyectoTrabajadores;

public class Oficial extends Operario{
    public Oficial(String nombre) {
        super(nombre);
    }
    public String toString(){
        return super.toString() + "\n" + "Soy un Oficial";
    }
}

package proyectoTrabajadores;

public abstract class Operario extends Empleado{
    public Operario(String nombre) {
        super(nombre);
    }
    @Override
    public String toString(){
      return super.toString() + "\n" + "Soy un Operario";
    }
}

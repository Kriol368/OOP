package herramientas;

public class LlaveInglesa extends Herramienta implements ApretarTornillo{
    public LlaveInglesa(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void apretarTornillo() {
        System.out.println("Apreto un tornillo");
    }
}

package herramientas;

public class PuntaPlana extends Destornillador implements ApretarTornillo{
    public PuntaPlana(String marca, String modelo) {
        super(marca, modelo);
    }
    public void apretarTornillo() {
        System.out.println("Apreto un tornillo");
    }
}

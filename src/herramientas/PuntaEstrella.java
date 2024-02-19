package herramientas;

public class PuntaEstrella extends Destornillador implements ApretarTornillo{
    public PuntaEstrella(String marca, String modelo) {
        super(marca, modelo);
    }
    public void apretarTornillo() {
        System.out.println("Apreto un tornillo");
    }
}

package herramientas;

public class MainHerramienta {
    public static void main(String[] args) {
        PuntaEstrella pe1 = new PuntaEstrella("Marca1","Modelo1");
        pe1.apretarTornillo();
        Sierra s1 = new Sierra("Marca2","Modelo32");
        s1.serrar();
        LlaveInglesa l1 = new LlaveInglesa("Marca22","Modelo13");
        l1.apretarTornillo();
    }

}

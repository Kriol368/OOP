package engine;

public class MainEngine {
    public static void main(String[] args) {
        Engine engine = new Engine("combustion", "hz", "volkswagen", "VW GOLF 1L 86-91");
        System.out.println(engine.getEngineType());
        System.out.println(engine.getManufacturer());
    }
}

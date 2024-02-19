package herramientas;

public class Sierra extends Herramienta{
    public Sierra(String marca, String modelo) {
        super(marca, modelo);
    }
    public void serrar(){
        System.out.println("Sierro un trozo de madera");
    }
}

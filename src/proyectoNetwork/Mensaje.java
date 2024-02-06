package proyectoNetwork;

public class Mensaje extends Publicacion{
    private String texto;

    public Mensaje(int id, String momentoDePublicacion, String texto) {
        super(id, momentoDePublicacion);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    @Override
    public String toString(){
        return this.texto + "\n" + super.toString();
    }
}

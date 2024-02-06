package proyectoNetwork;

public class Imagen extends Publicacion{
    private String titulo;
    private String imagen;

    public Imagen(int id, String momentoDePublicacion, String titulo, String imagen) {
        super(id, momentoDePublicacion);
        this.titulo = titulo;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    @Override
    public String toString(){
        return this.titulo +
                "\n" + this.imagen +
                "\n" + super.toString();
    }
}


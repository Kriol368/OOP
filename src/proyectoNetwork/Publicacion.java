package proyectoNetwork;

import java.util.ArrayList;
import java.util.List;

public abstract class Publicacion {
    private int id;
    private String momentoDePublicacion;
    private List<String> comentarios;
    private int personasALasQueLesGusta;
    private Usuario usuario;

    public Publicacion(int id, String momentoDePublicacion) {
        this.id = id;
        this.momentoDePublicacion = momentoDePublicacion;
        this.comentarios = new ArrayList<>();
        this.personasALasQueLesGusta = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMomentoDePublicacion() {
        return momentoDePublicacion;
    }

    public void setMomentoDePublicacion(String momentoDePublicacion) {
        this.momentoDePublicacion = momentoDePublicacion;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }

    public int getPersonasALasQueLesGusta() {
        return personasALasQueLesGusta;
    }

    public void setPersonasALasQueLesGusta(int personasALasQueLesGusta) {
        this.personasALasQueLesGusta = personasALasQueLesGusta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void meGusta(){
        this.personasALasQueLesGusta ++;
    }
    public void comentar(String comentario){
        comentarios.add(comentario);
    }
    @Override
    public String toString(){
        return "ID: " + this.id +
                "\n" + "Momento de Publicacion: " + this.momentoDePublicacion +
                "\n" + "Me gusta: " + this.personasALasQueLesGusta +
                "\n" + "Comentarios: " + this.comentarios +
                "\n";
    }
}

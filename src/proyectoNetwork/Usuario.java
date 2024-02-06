package proyectoNetwork;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    List<Publicacion> publicaciones;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.publicaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    public void publicar(Publicacion publicacion){
        publicaciones.add(publicacion);
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}

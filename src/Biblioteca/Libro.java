package Biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private ArrayList<Tema> temas;

    public Libro(String titulo, Autor autor, int paginas, ArrayList<Tema> temas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.temas = temas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public ArrayList<Tema> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<Tema> temas) {
        this.temas = temas;
    }
    @Override
    public String toString(){
        return this.titulo + " " + this.autor + " " + this.paginas + " "+ this.temas;
    }
}

class MainLibro{
    public static void main(String[] args) {
        Autor a1 = new Autor("Paco","2-2-1999");
        Autor a2 = new Autor("Maria","22-4-1965");
        Tema t1 = new Tema("Accion");
        Tema t2 = new Tema("Drama");
        Tema t3 = new Tema("Aventura");
        Tema t4 = new Tema("Terror");
        Libro l1 = new Libro("Libro1",a1,200,new ArrayList<>(Arrays.asList(t2,t4,new Tema("Deportes"))));
        System.out.println(l1);
    }
}

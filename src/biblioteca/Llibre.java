package biblioteca;

import java.util.Set;

public class Llibre {
    private int isbn;
    private Set<Autor> autors;
    private Tema tema;
    private Editorial editorial;
    private Set<Exemplar> exemplars;

    public Llibre(int isbn, Set<Autor> autors, Tema tema, Editorial editorial, Set<Exemplar> exemplars) {
        this.isbn = isbn;
        this.autors = autors;
        this.tema = tema;
        this.editorial = editorial;
        this.exemplars = exemplars;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Set<Autor> getAutors() {
        return autors;
    }

    public void setAutors(Set<Autor> autors) {
        this.autors = autors;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Set<Exemplar> getExemplars() {
        return exemplars;
    }

    public void setExemplars(Set<Exemplar> exemplars) {
        this.exemplars = exemplars;
    }
}

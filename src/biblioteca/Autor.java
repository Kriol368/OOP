package biblioteca;

import java.util.Set;

public class Autor {
    private int cod_autor;
    private Set<Llibre> llibres;

    public Autor(int cod_autor, Set<Llibre> llibres) {
        this.cod_autor = cod_autor;
        this.llibres = llibres;
    }

    public int getCod_autor() {
        return cod_autor;
    }

    public void setCod_autor(int cod_autor) {
        this.cod_autor = cod_autor;
    }

    public Set<Llibre> getLlibres() {
        return llibres;
    }

    public void setLlibres(Set<Llibre> llibres) {
        this.llibres = llibres;
    }
}

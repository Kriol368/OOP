package Biblioteca;

import java.util.Set;

public class Tema {
    private int cod_t;
    private Set<Tema> temas;

    public Tema(int cod_t, Set<Tema> temas) {
        this.cod_t = cod_t;
        this.temas = temas;
    }

    public int getCod_t() {
        return cod_t;
    }

    public void setCod_t(int cod_t) {
        this.cod_t = cod_t;
    }

    public Set<Tema> getTemas() {
        return temas;
    }

    public void setTemas(Set<Tema> temas) {
        this.temas = temas;
    }
}

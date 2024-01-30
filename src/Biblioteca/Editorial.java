package Biblioteca;

import java.util.Set;

public class Editorial {
    private int cod_ed;
    private Set<Llibre> llibres;

    public Editorial(int cod_ed, Set<Llibre> llibres) {
        this.cod_ed = cod_ed;
        this.llibres = llibres;
    }

    public int getCod_ed() {
        return cod_ed;
    }

    public void setCod_ed(int cod_ed) {
        this.cod_ed = cod_ed;
    }

    public Set<Llibre> getLlibres() {
        return llibres;
    }

    public void setLlibres(Set<Llibre> llibres) {
        this.llibres = llibres;
    }
}

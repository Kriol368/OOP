package Universitat;

import java.util.Set;

public class Facultat {
    private Set<Catedra> catedres;

    public Facultat(Set<Catedra> catedres) {
        this.catedres = catedres;
    }

    public Set<Catedra> getCatedres() {
        return catedres;
    }

    public void setCatedres(Set<Catedra> catedres) {
        this.catedres = catedres;
    }
}

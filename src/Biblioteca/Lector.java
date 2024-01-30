package Biblioteca;

import java.util.Set;

public class Lector {
    private String dni;
    private Set<Exemplar> exemplars;

    public Lector(String dni, Set<Exemplar> exemplars) {
        this.dni = dni;
        this.exemplars = exemplars;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<Exemplar> getExemplars() {
        return exemplars;
    }

    public void setExemplars(Set<Exemplar> exemplars) {
        this.exemplars = exemplars;
    }
}

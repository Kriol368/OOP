package Universitat;

import java.util.Set;

public class Professor {
    private Departament departament;

    public Professor(Departament departament) {
        this.departament = departament;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
}

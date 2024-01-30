package Universitat;

public class Catedra {
    private Departament departament;
    private Facultat facultat;

    public Catedra(Departament departament, Facultat facultat) {
        this.departament = departament;
        this.facultat = facultat;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public Facultat getFacultat() {
        return facultat;
    }

    public void setFacultat(Facultat facultat) {
        this.facultat = facultat;
    }
}

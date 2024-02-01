package universitat;

import java.util.Set;

public class Departament {
    private AreaConeiximent areaConeiximent;
    private Set<Professor> professors;
    private Set<Catedra> catedres;

    public Departament(AreaConeiximent areaConeiximent, Set<Professor> professors, Set<Catedra> catedres) {
        this.areaConeiximent = areaConeiximent;
        this.professors = professors;
        this.catedres = catedres;
    }

    public AreaConeiximent getAreaConeiximent() {
        return areaConeiximent;
    }

    public void setAreaConeiximent(AreaConeiximent areaConeiximent) {
        this.areaConeiximent = areaConeiximent;
    }

    public Set<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(Set<Professor> professors) {
        this.professors = professors;
    }

    public Set<Catedra> getCatedres() {
        return catedres;
    }

    public void setCatedres(Set<Catedra> catedres) {
        this.catedres = catedres;
    }
}

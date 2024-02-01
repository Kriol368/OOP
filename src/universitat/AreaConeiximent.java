package universitat;

import java.util.Set;

public class AreaConeiximent {
    private Set<Departament> departaments;

    public AreaConeiximent(Set<Departament> departaments) {
        this.departaments = departaments;
    }

    public Set<Departament> getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Set<Departament> departaments) {
        this.departaments = departaments;
    }
}

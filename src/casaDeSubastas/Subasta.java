package casaDeSubastas;

import java.util.Set;

public class Subasta {
    private String dia;
    private Set<Lote> lotes;

    public Subasta(String dia, Set<Lote> lotes) {
        this.dia = dia;
        this.lotes = lotes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Set<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(Set<Lote> lotes) {
        this.lotes = lotes;
    }
}

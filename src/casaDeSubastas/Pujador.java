package casaDeSubastas;

import java.util.Set;

public class Pujador {
    private Set<Lote> adquiridos;
    private Set<Lote> pujados;

    public Pujador() {
    }

    public Set<Lote> getAdquiridos() {
        return adquiridos;
    }

    public void setAdquiridos(Set<Lote> adquiridos) {
        this.adquiridos = adquiridos;
    }

    public Set<Lote> getPujados() {
        return pujados;
    }

    public void setPujados(Set<Lote> pujados) {
        this.pujados = pujados;
    }
}

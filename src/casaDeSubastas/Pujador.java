package casaDeSubastas;

import java.util.HashSet;
import java.util.Set;

public class Pujador {
    private Set<Lote> adquiridos;
    private Set<Lote> pujados;

    public Pujador() {
        this.adquiridos = new HashSet<>();
        this.pujados = new HashSet<>();
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

    public void añadirPujados(Lote lote){
        pujados.add(lote);
    }

    public void añadirAdquiridos(Lote lote){
        adquiridos.add(lote);
    }
    @Override
    public String toString(){
        return "Objetos adquiridos: " + this.getAdquiridos()
                + "\n";
    }
}

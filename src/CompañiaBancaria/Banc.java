package CompañiaBancaria;

import java.util.Set;

public class Banc {
    private int n_ent;
    private Set<Sucursal> sucursales;

    public Banc(int n_ent, Set<Sucursal> sucursales) {
        this.n_ent = n_ent;
        this.sucursales = sucursales;
    }

    public int getN_ent() {
        return n_ent;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setN_ent(int n_ent) {
        this.n_ent = n_ent;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
}

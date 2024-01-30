package CompañiaBancaria;

import java.util.Set;

public class CompteCorrent {
    private int n_cc;
    private Sucursal sucursal;
    private Set<Domiciliacio> domiciliacions;

    public CompteCorrent(int n_cc, Sucursal sucursal, Set<Domiciliacio> domiciliacions) {
        this.n_cc = n_cc;
        this.sucursal = sucursal;
        this.domiciliacions = domiciliacions;
    }

    public int getN_cc() {
        return n_cc;
    }

    public void setN_cc(int n_cc) {
        this.n_cc = n_cc;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Set<Domiciliacio> getDomiciliacions() {
        return domiciliacions;
    }

    public void setDomiciliacions(Set<Domiciliacio> domiciliacions) {
        this.domiciliacions = domiciliacions;
    }
}

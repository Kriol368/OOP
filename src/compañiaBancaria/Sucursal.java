package compañiaBancaria;

import java.util.Set;

public class Sucursal {
    private int n_suc;
    private Banc banc;
    private Set<Prestec> prestecs;
    private Set<CompteCorrent> compesCorrents;

    public Sucursal(int n_suc, Banc banc, Set<Prestec> prestecs, Set<CompteCorrent> compesCorrents) {
        this.n_suc = n_suc;
        this.banc = banc;
        this.prestecs = prestecs;
        this.compesCorrents = compesCorrents;
    }

    public int getN_suc() {
        return n_suc;
    }

    public void setN_suc(int n_suc) {
        this.n_suc = n_suc;
    }

    public Banc getBanc() {
        return banc;
    }

    public void setBanc(Banc banc) {
        this.banc = banc;
    }

    public Set<Prestec> getPrestecs() {
        return prestecs;
    }

    public void setPrestecs(Set<Prestec> prestecs) {
        this.prestecs = prestecs;
    }

    public Set<CompteCorrent> getCompesCorrents() {
        return compesCorrents;
    }

    public void setCompesCorrents(Set<CompteCorrent> compesCorrents) {
        this.compesCorrents = compesCorrents;
    }
}

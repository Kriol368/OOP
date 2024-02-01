package compañiaBancaria;

public class Domiciliacio {
    private int num_d;
    private CompteCorrent compteCorrent;

    public Domiciliacio(int num_d, CompteCorrent compteCorrent) {
        this.num_d = num_d;
        this.compteCorrent = compteCorrent;
    }

    public int getNum_d() {
        return num_d;
    }

    public void setNum_d(int num_d) {
        this.num_d = num_d;
    }

    public CompteCorrent getCompteCorrent() {
        return compteCorrent;
    }

    public void setCompteCorrent(CompteCorrent compteCorrent) {
        this.compteCorrent = compteCorrent;
    }
}

package biblioteca;

public class Exemplar {
    private int n_reg;
    private Llibre llibre;
    private Lector lector;
    private String data_p;

    public Exemplar(int n_reg, Llibre llibre, Lector lector, String data_p) {
        this.n_reg = n_reg;
        this.llibre = llibre;
        this.lector = lector;
        this.data_p = data_p;
    }

    public int getN_reg() {
        return n_reg;
    }

    public void setN_reg(int n_reg) {
        this.n_reg = n_reg;
    }

    public Llibre getLlibre() {
        return llibre;
    }

    public void setLlibre(Llibre llibre) {
        this.llibre = llibre;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public String getData_p() {
        return data_p;
    }

    public void setData_p(String data_p) {
        this.data_p = data_p;
    }
}

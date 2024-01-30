package Biblioteca;

public class Historic {
    private String data_p;
    private String data_t;
    private Lector lector;
    private Exemplar exemplar;

    public Historic(String data_p, String data_t, Lector lector, Exemplar exemplar) {
        this.data_p = data_p;
        this.data_t = data_t;
        this.lector = lector;
        this.exemplar = exemplar;
    }

    public String getData_p() {
        return data_p;
    }

    public void setData_p(String data_p) {
        this.data_p = data_p;
    }

    public String getData_t() {
        return data_t;
    }

    public void setData_t(String data_t) {
        this.data_t = data_t;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }
}

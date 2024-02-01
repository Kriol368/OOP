package casaDeSubastas;

public class Puja {
    private double cantidad;
    private Pujador pujador;
    private Lote lote;

    public Puja(double cantidad, Pujador pujador, Lote lote) {
        this.cantidad = cantidad;
        this.pujador = pujador;
        this.lote = lote;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }
}

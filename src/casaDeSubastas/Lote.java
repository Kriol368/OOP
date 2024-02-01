package casaDeSubastas;

import java.util.Set;

public class Lote {
    private int numeroLote;
    private double precioSalida;
    private Subasta subasta;
    private Set<Articulo> articulos;
    private Set<Pujador> pujadores;
    private Pujador comprador;

    public Lote(int numeroLote, double precioSalida, Set<Articulo> articulos) {
        this.numeroLote = numeroLote;
        this.precioSalida = precioSalida;
        this.articulos = articulos;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public double getPrecioSalida() {
        return precioSalida;
    }

    public void setPrecioSalida(double precioSalida) {
        this.precioSalida = precioSalida;
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Set<Pujador> getPujadores() {
        return pujadores;
    }

    public void setPujadores(Set<Pujador> pujadores) {
        this.pujadores = pujadores;
    }

    public Pujador getComprador() {
        return comprador;
    }

    public void setComprador(Pujador comprador) {
        this.comprador = comprador;
    }
}

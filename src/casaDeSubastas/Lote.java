package casaDeSubastas;

import java.util.HashSet;
import java.util.Set;

public class Lote {
    private int numeroLote;
    private double precioSalida;
    private Subasta subasta;
    private Set<Articulo> articulos;
    private Set<Pujador> pujadores;
    private Pujador comprador;

    public Lote(int numeroLote, double precioSalida) {
        this.numeroLote = numeroLote;
        this.precioSalida = precioSalida;
        this.articulos = new HashSet<>();
        this.pujadores = new HashSet<>();
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

    public void añadirArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    public void añadirPujador(Pujador pujador){
        this.pujadores.add(pujador);
    }

    @Override
    public String toString(){
        return "Numero de Lote: " + this.numeroLote + "\n"
                + "Precio de salida: " + this.precioSalida + "€"
                + "\n";
    }
}

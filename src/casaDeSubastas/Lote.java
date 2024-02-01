package casaDeSubastas;

import java.util.Set;

public class Lote {
    private int numeroLote;
    private double precioSalida;
    private Subasta subasta;
    private Set<Articulo> articulos;
    private Set<Pujador> pujadores;
    private Pujador comprador;
}

package cuenta;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double ingreso) {
        if (ingreso >= 0){
            this.cantidad = this.cantidad + ingreso;
        }
    }

    public void retirar(double retiro) {
        if ( retiro >= 0){
            this.cantidad = this.cantidad - retiro;
        }else {
            this.cantidad = 0;
        }
    }

    @Override
    public String toString() {
        return this.titular + "\n" + "Cantidad: " + this.cantidad;
    }
}

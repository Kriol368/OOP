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

class MainCuenta {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Pepe", 1000);
        System.out.println(c1);
        c1.ingresar(100);
        System.out.println(c1);
        c1.retirar(200);
        System.out.println(c1);
        Cuenta c2 = new Cuenta("Manolo");
        System.out.println(c2);
    }
}
package cuenta;

public class MainCuenta {
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

package maquinaExpendedora;


public class MainMaquinaExpendedora {
    public static void main(String[] args) {
        MaquinaExpendedora m1 = new MaquinaExpendedora(20.12);
        System.out.println(m1.sacarTique(10,7.5));
        System.out.println(m1.sacarTique(10,15));
        System.out.println(m1.sacarTique(10000,7.5));

    }

}

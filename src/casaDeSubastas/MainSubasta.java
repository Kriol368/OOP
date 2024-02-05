package casaDeSubastas;

public class MainSubasta {

    public static void main(String[] args) {
        Subasta s1 = new Subasta("5-2-2024");
        System.out.println(s1);
        Lote l1 = new Lote(5443,1000);
        Lote l2 = new Lote(7335,2500);
        Lote l3 = new Lote(2845,1333.33);
        s1.añadirLote(l1);
        l1.setSubasta(s1);
        s1.añadirLote(l2);
        l2.setSubasta(s1);
        s1.añadirLote(l3);
        l3.setSubasta(s1);
        System.out.println(l1);
        Articulo a1 = new Articulo("Sofa", 500);
        Articulo a2 = new Articulo("Sillon", 350);
        Articulo a3= new Articulo("Mesa", 400);
        l1.añadirArticulo(a1);
        a1.setLote(l1);
        l1.añadirArticulo(a3);
        a3.setLote(l1);
        System.out.println(a1);
        System.out.println(l1.getArticulos());
        Pujador p1 = new Pujador();
        p1.añadirPujados(l1);
        l1.añadirPujador(p1);
        Puja puja1 = new Puja(1200,p1,l1);
        p1.añadirAdquiridos(l1);
        l1.setComprador(p1);
        System.out.println(p1);
        System.out.println(puja1);
        System.out.println(puja1.getPujador());
    }
}

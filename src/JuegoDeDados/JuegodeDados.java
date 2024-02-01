package JuegoDeDados;

import java.util.ArrayList;

public class JuegodeDados {

    public static void definirDados(ArrayList<Dado> dados){
        dados.add(new Dado());
        dados.add(new Dado());
        dados.add(new Dado());
    }

    public static boolean sonIguales(ArrayList<Dado> dados){
        dados.get(0).setValorDado();
        dados.get(0).printValorDado();
        System.out.print("-");
        dados.get(1).setValorDado();
        dados.get(1).printValorDado();
        System.out.print("-");
        dados.get(2).setValorDado();
        dados.get(2).printValorDado();
        if (dados.get(0).getValorDado() == dados.get(1).getValorDado() && dados.get(0).getValorDado() == dados.get(2).getValorDado()){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Dado> dados = new ArrayList<>();
        definirDados(dados);
        int tiradas = 0;
        do {
            tiradas++;
            if (sonIguales(dados)){
                System.out.println();
                System.out.println("Lo conseguiste a la tirada: " + tiradas);
                break;
            }
            System.out.println();
        }while (true);
    }
}

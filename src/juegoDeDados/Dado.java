package juegoDeDados;

public class Dado {
    private int valorDado;

    public void setValorDado() {
        this.valorDado = (int) (Math.random() * 6 + 1);
    }

    public int getValorDado() {
        return valorDado;
    }

    public void printValorDado(){
        System.out.print(this.valorDado);
    }
}

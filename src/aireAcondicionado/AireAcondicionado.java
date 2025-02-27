package aireAcondicionado;

import java.util.Scanner;

public class AireAcondicionado {
    private String name;
    private int maxTemp;
    private int minTemp;
    private int temperaturaActual;


    public AireAcondicionado(String name, int maxTemp, int minTemp, int temperaturaActual) {
        this.name = name;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.temperaturaActual = temperaturaActual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public int getTemperaturaActual() {
        if (temperaturaActual > getMaxTemp()) throw new IllegalArgumentException("La temperatura supera la maxima");
        if (temperaturaActual < getMinTemp())
            throw new IllegalArgumentException("La temperatura esta por debajo de la minima");
        return temperaturaActual;
    }

    public void setTemperaturaActual(int temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public String toString() {
        return this.name + " \n" + "Temperatura actual: " + this.temperaturaActual + "\n" + "Min: " + this.minTemp + " Max: " + this.maxTemp;
    }

    public void aumentar() {
        if (this.getTemperaturaActual() >= this.getMaxTemp()) {
            throw new IllegalArgumentException("La temperatura supera la maxima");
        } else {
            this.setTemperaturaActual(this.getTemperaturaActual() + 1);
        }
    }

    public void disminuir() {
        if (this.getTemperaturaActual() <= this.getMinTemp()) {
            throw new IllegalArgumentException("La temperatura esta por debajo de la minima");
        } else {
            this.setTemperaturaActual(this.getTemperaturaActual() - 1);
        }
    }


}

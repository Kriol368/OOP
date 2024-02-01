package maquinaExpendedora;

import java.util.ArrayList;
import java.util.Arrays;

public class MaquinaExpendedora {
    private double cajon;

    public MaquinaExpendedora(double cajon) {
        this.cajon = cajon;
    }

    public double getCajon() {
        return cajon;
    }

    public void setCajon(double cajon) {
        this.cajon = cajon;
    }

    public String sacarTique(double introducido, double importe) {
        System.out.println("Intdroducido: " + introducido + "\n" + "Importe: " + importe);
        if (introducido < importe) {
            return "La cantidad introducida es inferior al importe a pagar";
        }
        ArrayList<Double> posiblesMonedas = new ArrayList<>(Arrays.asList(50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01));
        double aDevolver = introducido - importe;
        if (aDevolver > cajon) {
            return "Introduzca el importe exacto";
        }
        int cuantas = 0;
        do {
            for (int i = 0; i < posiblesMonedas.size(); i++) {
                if (posiblesMonedas.get(i) <= aDevolver) {
                    cuantas++;
                    aDevolver = aDevolver - posiblesMonedas.get(i);
                    break;
                }
            }
        } while (aDevolver != 0);
        return "La cantidad de monedas minima para la devolucion es " + cuantas;
    }

}

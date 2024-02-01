package aireAcondicionado;

import java.util.Scanner;

public class MainAC {
    public static void main(String[] args) {
        AireAcondicionado a1 = new AireAcondicionado("Aire1", 25, 0, 10);
        System.out.println(a1);
        Scanner scanner = new Scanner(System.in);
        do {
            String accion = scanner.nextLine();
            if (accion.equals("+")) {
                try {
                    a1.aumentar();
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                }
                System.out.println(a1);
            } else if (accion.equals("-")) {
                try {
                    a1.disminuir();
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                }
                System.out.println(a1);
            }
        } while (true);
    }

}

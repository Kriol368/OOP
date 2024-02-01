package laboratorio;

import java.util.ArrayList;
import java.util.Arrays;

public class MainLab {
    public static void main(String[] args) {
        Lab lab1 = new Lab("Usuarios en Linux", "Taller 209", 20, "12:00 1/2/2024", "Profesor1", new ArrayList<>(Arrays.asList("alu1","alu2","alu3")));
        System.out.println(lab1);
    }

}

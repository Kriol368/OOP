package BibliotecaNacional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainBibliotecaNacional {

    public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/BibliotecaNacional/dataset_bvmc_20220325.csv"));
        String line;
        reader.readLine();
        String[] datos;
        ArrayList<Libro> libros = new ArrayList<>();
        while ((line = reader.readLine()) != null){
            datos = line.split(",");
            try {
                libros.add(new Libro(datos[2],datos[5],datos[7]));
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(Arrays.toString(datos));
            }
        }
        Scanner scanner = new Scanner(System.in);
       do{
            System.out.println("Introduce un autor: ");
            String autor = scanner.nextLine();
            libros.stream()
                    .filter(libro -> libro.getNombre().equals(autor))
                    .forEach(System.out::println);
        } while (scanner.hasNextLine());

    }
}

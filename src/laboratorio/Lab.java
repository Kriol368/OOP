package laboratorio;

import java.util.ArrayList;

public class Lab {
    private String nombre;
    private String taller;
    private int capacidadMaxima;
    private String horaYDia;
    private String profesor;
    private ArrayList<String> estudiantes;

    public Lab(String nombre, String taller, int capacidadMaxima, String horaYDia, String profesor, ArrayList<String> estudiantes) {
        this.nombre = nombre;
        this.taller = taller;
        this.capacidadMaxima = capacidadMaxima;
        this.horaYDia = horaYDia;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTaller() {
        return taller;
    }

    public void setTaller(String taller) {
        this.taller = taller;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getHoraYDia() {
        return horaYDia;
    }

    public void setHoraYDia(String horaYDia) {
        this.horaYDia = horaYDia;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public ArrayList<String> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<String> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public String toString(){
        return "Nombre: " + this.nombre + "\n" +
                "Taller: " + this.taller + "\n" +
                "Capacidad Maxima: " + this.capacidadMaxima + "\n" +
                "Hora y dia: " + this.horaYDia + "\n" +
                "Profesor: " + this.profesor + "\n" +
                "Estudiantes: " + this.estudiantes;
    }
}

package reinoAnimal;

public abstract class Animal {
    private String nombre;
    private String color;

    /*Nacer*/

    public Animal(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void respirar();

    public abstract void moverse();

    public void comunicarse() {
        System.out.println("Mi nombre es " + nombre);
    }



    @Override
    public String toString(){
        return "Animal: " + this.nombre + "\n" + "Color: " + this.color;
    }
}

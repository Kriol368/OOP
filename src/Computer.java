import java.util.ArrayList;

public class Computer {
    private String model;
    private double price;
    private int stock;
    private String specs;

    public Computer(String model, double price, int stock, String specs) {
        this.model = model;
        this.price = price;
        this.stock = stock;
        this.specs = specs;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }
    public String toString(){
        return this.model  + " " + this.price + " " + this.stock + " " + this.specs;
    }

}

class MainComputer{
    public static void main(String[] args) {
        Computer c1 = new Computer("Model1",1000.50,10,"Description1");
        Computer c2 = new Computer("Model2",1020.22,15,"Description2");
        Computer c3 = new Computer("Model3",500.00,2,"Description3");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
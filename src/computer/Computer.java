package computer;

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

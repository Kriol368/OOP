package computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer c1 = new Computer("Model1",1000.50,10,"Description1");
        Computer c2 = new Computer("Model2",1020.22,15,"Description2");
        Computer c3 = new Computer("Model3",500.00,2,"Description3");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}

package human;

public class Teacher extends Person{

    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return this.getName() + "\n\t" + this.getAddress() + "\n\t" + "salary " + this.salary +" euro/month";
    }
}

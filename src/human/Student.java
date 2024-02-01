package human;

public class Student extends Person{

    private int credits;
    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void study(){
        this.credits = this.credits + 1;
    }
    public String toString(){
        return this.getName() + "\n\t" + this.getAddress() + "\n\t" + "Study credits " + this.getCredits();
    }


}

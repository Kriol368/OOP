public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return this.name + "\n\t" + this.address;
    }
}

class MainPerson {
    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person javier = new Person("Javier García","");
        javier.setAddress("Calle Mayor 15 12002 Castellón");
        System.out.println(ada);
        System.out.println(javier);
    }
}



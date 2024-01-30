package CompañiaBancaria;

import java.util.Set;

public class Client {
    private String dni;
    private Set<Prestec> prestecs;

    public Client(String dni, Set<Prestec> prestecs) {
        this.dni = dni;
        this.prestecs = prestecs;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<Prestec> getPrestecs() {
        return prestecs;
    }

    public void setPrestecs(Set<Prestec> prestecs) {
        this.prestecs = prestecs;
    }
}

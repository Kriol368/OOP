package human;

public class Person {
    private String name;
    private String address;

    private String dni;


    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (comprobarDNI(dni)){
            this.dni = dni;
        }
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
        return this.name + "\n\t" + this.address + "\n" + this.dni;
    }
    private boolean comprobarDNI (String dni){
        int resto;
        char[] letras ={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int dniInt = Integer.parseInt(dni.substring(0,8));
        resto = dniInt % 23;
        if (dni.charAt(8) != letras[resto]){
            throw new IllegalArgumentException("El DNI no es correcto ");
        }else {
            return true;
        }
    }
}





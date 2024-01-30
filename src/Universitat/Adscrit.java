package Universitat;

public class Adscrit {
    private Professor professor;
    private  Catedra catedra;
    private String data;

    public Adscrit(Professor professor, Catedra catedra, String data) {
        this.professor = professor;
        this.catedra = catedra;
        this.data = data;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

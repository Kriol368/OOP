package bibliotecaNacional;

public class Libro {
    private int idEntidadDocumental;
    private String fechaPublicacion;
    private String titulo;
    private int fk_idFormato;
    private int fk_idAutoridad;
    private String nombre;
    private int idMateria;
    private String materias;
    private String resto;
    private String lugarPublicacion;
    private int origenNumeroClave;

    public Libro(String titulo, String nombre, String materias) {
        this.titulo = titulo;
        this.nombre = nombre;
        this.materias = materias;
    }

    public int getIdEntidadDocumental() {
        return idEntidadDocumental;
    }

    public void setIdEntidadDocumental(int idEntidadDocumental) {
        this.idEntidadDocumental = idEntidadDocumental;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFk_idFormato() {
        return fk_idFormato;
    }

    public void setFk_idFormato(int fk_idFormato) {
        this.fk_idFormato = fk_idFormato;
    }

    public int getFk_idAutoridad() {
        return fk_idAutoridad;
    }

    public void setFk_idAutoridad(int fk_idAutoridad) {
        this.fk_idAutoridad = fk_idAutoridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public String getResto() {
        return resto;
    }

    public void setResto(String resto) {
        this.resto = resto;
    }

    public String getLugarPublicacion() {
        return lugarPublicacion;
    }

    public void setLugarPublicacion(String lugarPublicacion) {
        this.lugarPublicacion = lugarPublicacion;
    }

    public int getOrigenNumeroClave() {
        return origenNumeroClave;
    }

    public void setOrigenNumeroClave(int origenNumeroClave) {
        this.origenNumeroClave = origenNumeroClave;
    }

    public String toString(){
        return this.nombre + "\n" + this.materias;
    }
}

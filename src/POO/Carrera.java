package POO;

public class Carrera {
    String name;
    int duracion;
    boolean en_Curso;

    public Carrera(String name, int duracion, boolean en_Curso) {
        this.name = name;
        this.duracion = duracion;
        this.en_Curso = en_Curso;

    }

    public Carrera (String nombrecarrera){
        this.name = nombrecarrera;
    }
}

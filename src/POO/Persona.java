package POO;

public class Persona {
    String name;
    String apellido;
    int edad;
    Carrera carrera;

    //constructor

    public Persona(String name, String apellido, int edad, String nombrecarrera,boolean en_Curso) {
        carrera = new Carrera(nombrecarrera,edad,false);
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }

    // sobre carga de constructor
    public Persona(String name, String apellido, int edad, String nombrecarrera) {
        carrera = new Carrera(nombrecarrera);
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }


    // metodos de comportamiento
    public String nombrecompleto() {
        return name + " " + apellido;
    }

    public String darsaludo() {
        return "Hola, como estas" + " " + nombrecompleto();
    }

    public String repondersaludo() {
        return "Encantado de conocerte, " + nombrecompleto();
    }
}

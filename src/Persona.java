public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String direccion;
    private String telefono;
    private String email;
    private int matricula;

    public Persona( String nombre, 
                String apellido, 
                int edad, 
                String sexo, 
                String direccion, 
                String telefono, 
                String email, 
                int matricula)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Persona(String nombre, int matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}


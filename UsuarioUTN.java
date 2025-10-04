public class UsuarioUTN {
    private int legajo;
    private String nombre;
    private String apellido;
    private String telefono;
    private int dni;


    public UsuarioUTN(){}
    
    public UsuarioUTN(int legajo, String nombre, String apellido, String telefono, int dni){
        this.nombre = nombre;
        this.legajo = legajo;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
    }
    public int getLegajo() {
        return this.legajo;
    }

    public String getnombre(){
        return this.nombre;
    }

    public String getapellido(){
        return this.apellido;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public int getdni(){
        return this.dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setlegajo(int legajo){
        this.legajo =legajo;
    }
    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void setdni(int dni){
        this.dni = dni;
    }
        
}
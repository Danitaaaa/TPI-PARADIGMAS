public class TipoCuenta {
    private String nombre;

    public TipoCuenta() {}
    public TipoCuenta(String nombre) {
        this.nombre = nombre;
    }
    // Getter
    public String getNombre() {
        return this.nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
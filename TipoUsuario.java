public class TipoUsuario {
    private String nombre;
    private double porcentaje;
    private Tarifa tarifa;

    public TipoUsuario() {}

    public TipoUsuario(String nombre, double porcentaje, Tarifa tarifa) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.tarifa = tarifa;
    }
    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public double getPorcentaje() {
        return this.porcentaje;
    }

    public Tarifa getTarifa() {
        return this.tarifa;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public double calcularImporteDiario() {
        return 0.0; }

    public double calcularImporteMensual() {
        return 0.0; }
}
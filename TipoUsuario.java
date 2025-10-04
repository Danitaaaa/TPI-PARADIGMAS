public class TipoUsuario {
    private String nombre;
    private double porcentaje;
    private Tarifa tarifa;

    public TipoUsuario() {}

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public Tarifa getTarifa() {
        return tarifa;
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

    public void crear() {}
    public void mostrar() {}
    public Tarifa conocerTarifa() { return null; }
    public double calcularImporteDiario() { return 0.0; }
    public double calcularImporteMensual() { return 0.0; }
}
public class Tarifa {
    private double importeBase;
    private String fechaDesde;
    private String fechaHasta;

    public Tarifa() {}

    public double getImporteBase() {
        return importeBase;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    // Setters
    public void setImporteBase(double importeBase) {
        this.importeBase = importeBase;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public void crear() {}
    public void mostrar() {}
}
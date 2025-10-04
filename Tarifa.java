public class Tarifa {
    private double importeBase;
    private String fechaDesde;
    private String fechaHasta;

    public Tarifa() {}

    public Tarifa(double importeBase, String fechaDesde, String fechaHasta) {
        this.importeBase = importeBase;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public double getImporteBase() {
        return this.importeBase;
    }

    public String getFechaDesde() {
        return this.fechaDesde;
    }

    public String getFechaHasta() {
        return this.fechaHasta;
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

}
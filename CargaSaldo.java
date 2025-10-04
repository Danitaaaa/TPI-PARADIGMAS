public class CargaSaldo {
    private int numero;
    private String fechaYHoraCarga;
    private double importe;
    private TipoCarga tipoCarga;

    public CargaSaldo(int número, String fechaYhoraCarga, double importe, TipoCarga tipoCarga) {
        this.numero = número;
        this.fechaYHoraCarga = fechaYhoraCarga;
        this.importe = importe;
        this.tipoCarga = tipoCarga;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getFechaYHoraCarga() {
        return this.fechaYHoraCarga;
    }

    public double getImporte() {
        return this.importe;
    }

    public TipoCarga getTipoCarga() {
        return this.tipoCarga;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFechaYHoraCarga(String fechaYHoraCarga) {
        this.fechaYHoraCarga = fechaYHoraCarga;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setTipoCarga(TipoCarga tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public void acreditarSaldo() {}
    public void desacreditarSaldo() {}  
}

public class CargaSaldo {
    private int numero;
    private String fechaYHoraCarga;
    private double importe;
    private TipoCarga tipoCarga;

    public CargaSaldo() {}

        public int getNumero() {
        return numero;
    }

    public String getFechaYHoraCarga() {
        return fechaYHoraCarga;
    }

    public double getImporte() {
        return importe;
    }

    public TipoCarga getTipoCarga() {
        return tipoCarga;
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

    public void crear() {}
    public void mostrar() {}
    public void acreditarSaldo() {}
    public void desacreditarSaldo() {}  
}
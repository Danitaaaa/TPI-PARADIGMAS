public class CargaMensual {
    private int numero;
    private String fechaYHora;
    private double importe;

    public CargaMensual() {}

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getFechaYHora() {
        return fechaYHora;
    }

    public double getImporte() {
        return importe;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFechaYHora(String fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void crear() {}
    public void mostrar() {}
}
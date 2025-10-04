public class CargaMensual {
    private int numero;
    private String fechaYHora;
    private double importe;
    private String mesVigencia;

    public CargaMensual(int número, String fechaYhora, double importe, String mesVigencia){
        this.numero = número;
        this.fechaYHora = fechaYhora;
        this.importe = importe;
        this.mesVigencia = mesVigencia;
    }

    // Getters
    public int getNumero() {
        return this.numero;
    }

    public String getFechaYHora() {
        return this.fechaYHora;
    }

    public double getImporte() {
        return this.importe;
    }
    
    public String getMesVigencia(){
        return this.mesVigencia;
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

    public void setMesVigencia(String mesVigencia) {
        this.mesVigencia = mesVigencia;
    } 
}

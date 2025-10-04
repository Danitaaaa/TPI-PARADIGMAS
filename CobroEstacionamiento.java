public class CobroEstacionaminto {
    private int numeroTransaccion;
    private String fechaYHora;
    private double importe;
    private Cuenta cuenta;
    private String dominio;
    private Tarifa tarifa;

    //public CobroEstacionamiento() {}

        public int getNumeroTransaccion() {
        return numeroTransaccion;
    }

    public String getFechaYHora() {
        return fechaYHora;
    }

    public double getImporte() {
        return importe;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public String getDominio() {
        return dominio;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setNumeroTransaccion(int numeroTransaccion) {
        this.numeroTransaccion = numeroTransaccion;
    }

    public void setFechaYHora(String fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public void crear() {}
    public void mostrar() {}
    public Cuenta conocerCuenta() { return null; }
    public Tarifa conocerTarifa() { return null; }
    public void registrarCobro() {}
}

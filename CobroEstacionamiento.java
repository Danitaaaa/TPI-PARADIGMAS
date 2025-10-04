public class CobroEstacionamiento {
    private int numeroTransaccion;
    private String fechaYHora;  //ver libreria fecha y hr
    private double importe;
    private Cuenta cuenta;
    private String dominio;
    private Tarifa tarifa;

    public CobroEstacionamiento() {
        
    }

    public CobroEstacionamiento(int numeroTransaccion, String fechaYHora, double importe, Cuenta cuenta,String dominio, Tarifa tarifa) {
        this.numeroTransaccion =numeroTransaccion;
        this.fechaYHora =fechaYHora;
        this.importe = importe;
        this.cuenta = cuenta;
        this.dominio = dominio;
        this.tarifa = tarifa;
    }

    public int getNumeroTransaccion() {
        return this.numeroTransaccion;
    }

    public String getFechaYHora() {
        return this.fechaYHora;
    }

    public double getImporte() {
        return this.importe;
    }

    public Cuenta getCuenta() {
        return this.cuenta;
    }

    public String getDominio() {
        return this.dominio;
    }

    public Tarifa getTarifa() {
        return this.tarifa;
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
    public void registrarCobro() {}
}

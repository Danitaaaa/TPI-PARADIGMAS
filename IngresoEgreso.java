public class IngresoEgreso {
    private int numeroTransaccion;
    private String fechaYHoraIngreso;
    private String fechaYHoraEgreso;
    private String dominio;
    private CobroEstacionamiento cobro;
    private Lugar lugar;
    private Cuenta cuenta;

    public IngresoEgreso() {}

    public int getNumeroTransaccion() {
       return this.numeroTransaccion;
    }

    public String getFechaYHoraIngreso() {
        return this.fechaYHoraIngreso;
    }

    public String getFechaYHoraEgreso() {
        return this.fechaYHoraEgreso;
    }

    public String getDominio() {
        return this.dominio;
    }

    public CobroEstacionamiento getCobro() {
        return this.cobro;
    }

    public Lugar getLugar() {
        return this.lugar;
    }

    public Cuenta getCuenta() {
        return this.cuenta;
    }

    // Setters
    public void setNumeroTransaccion(int numeroTransaccion) {
        this.numeroTransaccion = numeroTransaccion;
    }

    public void setFechaYHoraIngreso(String fechaYHoraIngreso) {
        this.fechaYHoraIngreso = fechaYHoraIngreso;
    }

    public void setFechaYHoraEgreso(String fechaYHoraEgreso) {
        this.fechaYHoraEgreso = fechaYHoraEgreso;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public void setCobro(CobroEstacionamiento cobro) {
        this.cobro = cobro;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void registrarIngreso() {}
    public void registrarEgreso() {}
}

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
        return numeroTransaccion;
    }

    public String getFechaYHoraIngreso() {
        return fechaYHoraIngreso;
    }

    public String getFechaYHoraEgreso() {
        return fechaYHoraEgreso;
    }

    public String getDominio() {
        return dominio;
    }

    public CobroEstacionaminto getCobro() {
        return cobro;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public Cuenta getCuenta() {
        return cuenta;
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

    public void setCobro(CobroEstacionaminto cobro) {
        this.cobro = cobro;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public void crear() {}
    public void mostrar() {}
    public CobroEstacionamiento conocerCobro() { return null; }
    public Lugar conocerLugar() { return null; }
    public void registrarIngreso() {}
    public void registrarEgreso() {}
}

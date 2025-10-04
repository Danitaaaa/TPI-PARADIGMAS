public class Cuenta {
    private int numeroCuenta;
    private UsuarioUtn titular;
    private String fechaAlta;
    private String fechaBaja;
    private Vehiculo vehiculo;
    private TipoCuenta tipoCuenta;
    private TipoUsuario tipoUsuario;
    private CargaMensual cargaMensual;
    private CargaSaldo cargaSaldo;

    public Cuenta() {}

     public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public UsuarioUtn getTitular() {
        return titular;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public CargaMensual getCargaMensual() {
        return cargaMensual;
    }

    public CargaSaldo getCargaSaldo() {
        return cargaSaldo;
    }

    // Setters
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(UsuarioUtn titular) {
        this.titular = titular;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setCargaMensual(CargaMensual cargaMensual) {
        this.cargaMensual = cargaMensual;
    }

    public void setCargaSaldo(CargaSaldo cargaSaldo) {
        this.cargaSaldo = cargaSaldo;
    }

    public void crear() {}
    public void mostrar() {}
    public UsuarioUtn conocerTitular() { return null; }
    public TipoUsuario conocerTipoUsuario() { return null; }
    public TipoCuenta conocerTipoCuenta() { return null; }
    public void registrarCarga() {}
    public void registrarBaja() {}
}

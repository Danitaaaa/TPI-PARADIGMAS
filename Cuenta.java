import java.util.ArrayList;

public class Cuenta {
    private int numeroCuenta;
    private UsuarioUTN titular;
    private String fechaAlta;
    private String fechaBaja;
    private Vehiculo vehiculo;
    private TipoCuenta tipoCuenta;
    private TipoUsuario tipoUsuario;
    private ArrayList<CargaMensual> cargaMensual;
    private ArrayList<CargaSaldo> cargaSaldo;

    public Cuenta() {}

    public Cuenta(int numeroCuenta, UsuarioUTN titular, String fechaAlta, String fechaBaja, Vehiculo vehiculo, TipoCuenta tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.vehiculo = vehiculo;
        this.tipoCuenta = tipoCuenta;
    }

    public void agregarCargaMensual(CargaMensual cargaMensual){
        this.cargaMensual.add(cargaMensual);
    }

    public void agregarCargaSaldo(CargaSaldo cargaSaldo){
        this.cargaSaldo.add(cargaSaldo);
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public UsuarioUTN getTitular() {
        return this.titular;
    }

    public String getFechaAlta() {
        return this.fechaAlta;
    }

    public String getFechaBaja() {
        return this.fechaBaja;
    }

    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

    public TipoCuenta getTipoCuenta() {
        return this.tipoCuenta;
    }

    public TipoUsuario getTipoUsuario() {
        return this.tipoUsuario;
    }

    public ArrayList<CargaMensual> getCargaMensual() {
        return this.cargaMensual;
    }

    public ArrayList<CargaSaldo> getCargaSaldo() {
        return this.cargaSaldo;
    }

    // Setters
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(UsuarioUTN titular) {
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

    public void registrarCarga() {}
    public void registrarBaja() {}
}

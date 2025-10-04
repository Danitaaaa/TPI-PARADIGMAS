public class Vehiculo {
    private String tarjetaVerde;
    private String seguro;
    private String modelo;
    private String marca;
    private String dominio;
    private String fechaAlta;
    private String fechaBaja;
    private EstadoVehiculo estado;

    public Vehiculo() {}

       public String getTarjetaVerde() {
        return tarjetaVerde;
    }

    public String getSeguro() {
        return seguro;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getDominio() {
        return dominio;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public EstadoVehiculo getEstado() {
        return estado;
    }

    // Setters
    public void setTarjetaVerde(String tarjetaVerde) {
        this.tarjetaVerde = tarjetaVerde;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public void setEstado(EstadoVehiculo estado) {
        this.estado = estado;
    }

    public void crear() {}
    public void mostrar() {}
    public EstadoVehiculo conocerEstado() { return null; }
    public void registrarAlta() {}
    public void registrarBaja() {}
}

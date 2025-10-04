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
        return this.tarjetaVerde;
    }

    public String getSeguro() {
        return this.seguro;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getDominio() {
        return this.dominio;
    }

    public String getFechaAlta() {
        return this.fechaAlta;
    }

    public String getFechaBaja() {
        return this.fechaBaja;
    }

    public EstadoVehiculo getEstado() {
        return this.estado;
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

    public void registrarAlta() {}
    public void registrarBaja() {}
}

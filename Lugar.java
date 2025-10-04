public class Lugar {
    private int numero;
    private Estado estado;
    private TipoLugar tipo;
    private String fecha;

    public Lugar() {}

        public int getNumero() {
        return numero;
    }

    public Estado getEstado() {
        return estado;
    }

    public TipoLugar getTipo() {
        return tipo;
    }

    public String getFecha() {
        return fecha;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setTipo(TipoLugar tipo) {
        this.tipo = tipo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void crear() {}
    public void mostrar() {}
    public Estado conocerEstado() { return null; }
    public TipoLugar conocerTipoLugar() { return null; }
    public void liberarLugar() {}
    public void ocuparLugar() {}
 
}
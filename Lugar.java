public class Lugar {
    private int numero;
    private Estado estado;
    private TipoLugar tipo;
    private String fecha;

    public Lugar() {}

       public Lugar(int numero, Estado estado, TipoLugar tipo, String fecha) {
        this.numero= numero;
        this.estado = estado;
        this.tipo = tipo;
        this.fecha= fecha;
       }

    public int getNumero() {
        return this.numero;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public TipoLugar getTipo() {
        return this.tipo;
    }

    public String getFecha() {
        return this.fecha;
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

    public void liberarLugar() {}
    public void ocuparLugar() {}
 
}
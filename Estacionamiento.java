import java.util.ArrayList;

public class Estacionamiento {
    private ArrayList<Lugar> lugares;
    private int cantidadLugares;

    public Estacionamiento() {
        lugares = new ArrayList<>();
        cantidadLugares = 0;
    }


        public ArrayList<Lugar> getLugares() {
        return lugares;
    }

    public int getCantidadLugares() {
        return cantidadLugares;
    }

    // Setters
    public void setLugares(ArrayList<Lugar> lugares) {
        this.lugares = lugares;
    }

    public void setCantidadLugares(int cantidadLugares) {
        this.cantidadLugares = cantidadLugares;
    }
    public void crear() {}
    public void mostrar() {}
    public Lugar conocerLugar() { return null; }
    public int calcularCantidadLugaresDisponibles() { return 0; }
}
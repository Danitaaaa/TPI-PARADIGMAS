import java.util.ArrayList;

public class Estacionamiento {
    private ArrayList<Lugar> lugares;
    private int cantidadLugares;

    public Estacionamiento() {
        lugares = new ArrayList<>();
        cantidadLugares = 0;
    }

    public void agregarLugar(Lugar lugar) {
        this.lugares.add(lugar);
    }

    public ArrayList<Lugar> getLugares() {
        return this.lugares;
    }


    public int getCantidadLugares() {
        return this.cantidadLugares;
    }

    // Setters
    public void setLugares(ArrayList<Lugar> lugares) {
        this.lugares = lugares;
    }

    public void setCantidadLugares(int cantidadLugares) {
        this.cantidadLugares = cantidadLugares;
    }

    public int calcularCantidadLugaresDisponibles() { return 0; }
}
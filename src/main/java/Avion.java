public class Avion {
    private String nombre;
    private int capacidad;

    public Avion(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public Double costeAvion(int km){
        return km * 1.30;
    }
}

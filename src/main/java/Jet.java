public class Jet implements Vehiculo {
    private String nombre;
    private int Capacidad;

    public Jet(String nombre, int capacidad) {
        this.nombre = nombre;
        Capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    @Override
    public Double costeAvion(int km) {
        return km * 3.30;
    }
}

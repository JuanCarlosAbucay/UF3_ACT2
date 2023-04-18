import java.util.ArrayList;
import java.util.List;

public class Areopuerto {
    private String nom;
    private List<Avion> avions = new ArrayList<>();
    private Vehiculo vehiculo;
    public Areopuerto(String nom) {
        this.nom = nom;
    }

    public Areopuerto(String nom, List<Avion> avions) {
        this.nom = nom;
        this.avions = avions;
    }

    public Areopuerto(String nom, Vehiculo vehiculo) {
        this.nom = nom;
        this.vehiculo = vehiculo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Avion> getAvions() {
        return avions;
    }

    public void setAvions(List<Avion> avions) {
        this.avions = avions;
    }

    public void addAvion(Avion avion) {
        this.avions.add(avion);
    }

    public List<Double> costeAvion(int km){
        List<Double> cost = new ArrayList<>();
        for(Avion avion : avions){
            cost.add(avion.costeAvion(km));
        }
        return cost;
    }

    public List<Double> costeVehiculo(int km){
        List<Double> cost = new ArrayList<>();
        cost.add(vehiculo.costeAvion(km));
        return cost;
    }
}

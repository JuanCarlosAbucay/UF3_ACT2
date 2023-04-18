import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Sense IoC
        Areopuerto areopuerto1 = new Areopuerto("Areopuerto1");
        Avion avion1 = new Avion("Avion1", 200);
        areopuerto1.addAvion(avion1);
        List<Double> avions = areopuerto1.costeAvion(1000);
        System.out.println("Coste de los aviones: " + avions);

        //Amb DI
        Avion avion2 = new Avion("Avion2", 100);
        Avion avion3 = new Avion("Avion3", 120);
        Avion avion4 = new Avion("Avion4", 130);
        List<Avion> avions1 = new ArrayList<>(Arrays.asList(avion2, avion3, avion4));
        Areopuerto areopuerto2 = new Areopuerto("Areopuerto2", avions1);
        System.out.println("Coste de los aviones " + areopuerto2.costeAvion(1800));

        //Amb interfícies
        Vehiculo jet = new Jet("Jet1", 20);
        Areopuerto areopuerto3 = new Areopuerto("Areopuerto3", jet);
        System.out.println("Coste de los aviones: " + areopuerto3.costeVehiculo(500));
    }
}

import model.Fahrzeug;
import model.FahrzeugStatus;

public class Main {
    public static void main(String[] args) {
        Fahrzeug auto = new Fahrzeug(1, 2020, 10000, "BMW", "X5", 30000, FahrzeugStatus.VERFUEGBAR);
        System.out.println(auto.getKurzeBeschreibung());
    }
}

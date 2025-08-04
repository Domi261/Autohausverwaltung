import model.Fahrzeug;
import model.FahrzeugStatus;
import service.FahrzeugVerwaltung;

public class Main {
    public static void main(String[] args) {
        Fahrzeug auto = new Fahrzeug(1, 2020, 10000, "BMW", "X5", 30000, FahrzeugStatus.VERFUEGBAR);

        FahrzeugVerwaltung verwaltung = new FahrzeugVerwaltung();
        verwaltung.fahrzeugHinzufuegen(auto);

        verwaltung.alleFahrzeugeAnzeigen();
    }
}

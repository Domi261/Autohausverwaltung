import model.Fahrzeug;
import model.FahrzeugStatus;
import service.FahrzeugVerwaltung;

public class Main {
    public static void main(String[] args) {
        Fahrzeug auto1 = new Fahrzeug(1, 2005, 100000, "Mercedes Benz", "CLS 500 AMG", 25000, FahrzeugStatus.VERFUEGBAR);
        Fahrzeug auto2 = new Fahrzeug(2, 2020, 10000, "BMW", "M5 Competition", 90000, FahrzeugStatus.IM_SERVICE);
        FahrzeugVerwaltung verwaltung = new FahrzeugVerwaltung();

        verwaltung.fahrzeugHinzufuegen(auto1);
        verwaltung.fahrzeugHinzufuegen(auto2);

        verwaltung.alleFahrzeugeAnzeigen();
    }

}

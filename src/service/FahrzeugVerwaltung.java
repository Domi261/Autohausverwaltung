package service;

import model.Fahrzeug;
import java.util.ArrayList;
import java.util.List;;

public class FahrzeugVerwaltung {

    private List<Fahrzeug> fahrzeuge = new ArrayList<>();

    public void fahrzeugHinzufuegen(Fahrzeug fzg) {

        fahrzeuge.add(fzg);
        System.out.println("Fahrzeug hinzugefügt: " + fzg.getKurzeBeschreibung());
    }

    public void alleFahrzeugeAnzeigen() {

        if (fahrzeuge.isEmpty()) {
            System.out.println("Es sind aktuell keine Farhzuege vorhanden ");
            return;
        }

        for (Fahrzeug f : fahrzeuge) {
            System.out.println(f.getKurzeBeschreibung() + " | Status: " + f.getStatus());
        }

    }
}

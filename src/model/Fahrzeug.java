package model;

public class Fahrzeug {

    private int id;
    private int baujahr;
    private int kilometerstand;
    private String marke;
    private String modell;
    private double preis;
    private FahrzeugStatus status;

    public Fahrzeug(int id, int baujahr, int kilometerstand, String marke, String modell, double preis,
            FahrzeugStatus status) {

        this.id             = id;
        this.baujahr        = baujahr;
        this.kilometerstand = kilometerstand;
        this.marke          = marke;
        this.modell         = modell;
        this.preis          = preis;
        this.status         = status;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }

        else {
            System.out.println("Die ID dard nicht 0 oder negativ sein");
        }
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        if (kilometerstand >= 0) {
            this.kilometerstand = kilometerstand;
        } else {
            System.out.println("Der Kilometerstand kann nicht kleiner 0 sein");
        }
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        if (preis >= 0) {
            this.preis = preis;
        } else {
            System.out.println("Der Preis für ein Auto darf nicht kleiner 0 sein");
        }
    }

    public FahrzeugStatus getStatus() {
        return status;
    }

    public void setStatus(FahrzeugStatus status) {
        this.status = status;
    }

    public void fahren(int km) {

        if (km > 0) {
            this.kilometerstand += km;
        } else {
            System.out.println("Gefahrene Kilometer müssen positiv sein");
        }
    }

    public void zurInspektion() {
        this.status = FahrzeugStatus.IM_SERVICE;

    }

    public void alsVerfügbarMarkieren() {
        this.status = FahrzeugStatus.VERFUEGBAR;
    }

    public void verkaufen() {
        if (this.status != FahrzeugStatus.VERKAUFT) {
            this.status = FahrzeugStatus.VERKAUFT;
        } else {
            System.out.println("Fahrzeug wurde bereits verkauft.");
        }
    }

    public String getKurzeBeschreibung() {
        return String.format("%s %s (%d), %d km, %.2f CHF",
                marke, modell, baujahr, kilometerstand, preis);
    }

}

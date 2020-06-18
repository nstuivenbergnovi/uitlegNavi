package nl.novi;

public class Persoon {

    private String naam;

    private Woonplaats woonplaats;

    public Persoon(String naam) {
        this.naam = naam;
    }

    public Persoon(String naam, Woonplaats woonplaats) {
        this.naam = naam;
        this.woonplaats = woonplaats;
    }

    public Persoon(String naam, String plaatsnaam) {
        this.naam = naam;
        this.woonplaats = new Woonplaats(plaatsnaam);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Woonplaats getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(Woonplaats woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String getWoonplaatsNaam() {
        return this.woonplaats.getWoonplaatsNaam();
    }
}

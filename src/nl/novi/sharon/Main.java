package nl.novi.sharon;

public class Main {

    public static void main(String[] args) {
        int cijfer = 100;

        int verdubbeldgetal  = Helper.verdubbelaar(cijfer);

        System.out.println("verdubbeld getal: " + verdubbeldgetal);

        int getalOmTeHalveren = 200;

        Berekenaar berekenaar = new Berekenaar();

        double gehalveerdGetal = berekenaar.halveer(getalOmTeHalveren);

        Persoon docent = new Persoon("Nick");
        Persoon hoofddocent = new Persoon("Dennis");
        Persoon student = new Persoon("Sharon");

    }

}

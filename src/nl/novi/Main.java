package nl.novi;


/**
 * Yousra:
 *
 * Vraag mbt functionaliteiten van loop:
 * Waarvoor gebruik je while-loop, for of switch
 * - Switch Done
 * -  for en while DONE
 *
 * Vurgill:
 * Methodes:
 * Wanneer je gebruik void in een methode en override
 * Wanneer return/void DONE
 *
 * abstract/interface
 *
 * Judah:
 * In hoeverre gebruik je klasses in de eindopdracht? DONE
 *
 * Tahmina:
 * Verschil tussen game1, game2, game3, game4.
 * Game g = new Game();
 *
 * abstract interface & override
 *
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Uitleg.uitlegSwitch(1);


        Uitleg uitlegKlasse = new Uitleg();

        // Methode zonder return
        System.out.println("22 verdubbeld: " + uitlegKlasse.verdubbelaar(22));

        // Methode met return
        System.out.println("Btw van 22: " + Helper.berekenBtw(22));

        uitlegKlasse.logNaarConsole("Deze applicatie is gecrasht");

        Persoon persoon1 = new Persoon("Nick");
        Persoon persoon2 = new Persoon("Dennis");
        Persoon persoon3 = new Persoon("Vogeltje");

        System.out.println(persoon1.getNaam());
        System.out.println(persoon2.getNaam());
        System.out.println(persoon3.getNaam());

        Woonplaats woonplaats = new Woonplaats("Den Dolder");
        Persoon persoon4 = new Persoon("Nicky", woonplaats);
        System.out.println("P4: " + persoon4.getWoonplaatsNaam());

        Persoon persoon5 = new Persoon("Vera", "Zeist");
        System.out.println("P5: " + persoon5.getWoonplaatsNaam());


        Dog dog = new Dog();

        dog.walk();
        System.out.println("Hondje loopt: " + dog.getDistanceTraveled());
        dog.walk();
        dog.walk();dog.walk();
        dog.walk();
        System.out.println("Hondje loopt: " + dog.getDistanceTraveled());

    }
}

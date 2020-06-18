package nl.novi;

import java.util.ArrayList;
import java.util.List;

public class Uitleg {

    public static void uitlegSwitch(int dag) {
 // We hebben 1 ingevoerd
        switch (dag) {
            case 0: //
                System.out.println("Vandaag is het zondag!");
                break;
            case 1:
                System.out.println("Vandaag is het maandag");
                break;
                // tot en met 6
            default:
                System.out.println("Deze dag is niet bekend");
        }

        /*
        if(dag == 0) {
            System.out.println("Vandaag is het zondag!");
        } else if(dag == 1) {
            System.out.println("Vandaag is het maandag");
        } else {
            System.out.println("Deze dag is niet bekend");
        }
        */
    }

    public int verdubbelaar(int getal) {
        int verdubbeldGetal = getal * 2;

        return verdubbeldGetal;
    }

    public String logNaarConsole(String error) {
        String string = "De applicatie heeft een error gegeven:";
        string += "\r\n" + error;
        return string;
    }

    public void forWhile() {

        List<String> woorden = new ArrayList<>();

        woorden.add("1");
        woorden.add("1");
        woorden.add("1");
        woorden.add("1");
        woorden.add("1");
        woorden.add("1");

        String[] getallen = new String[6];

        for (int i = 0; i < woorden.size(); i++) {
            System.out.println(woorden.get(i));
        }

        boolean doorgaan = true;

        int lengteList = woorden.size();
        int teller = 0;

        boolean uitkomst =  teller < lengteList;

        while(uitkomst) {
            System.out.println(woorden.get(teller));
            teller++;
            uitkomst = teller < lengteList;
        }
    }



}

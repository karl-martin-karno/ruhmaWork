
import java.util.Random;
import java.util.Scanner;

public class KiviPaberKäärid {


    public static String arvutiValik() {//Arvuti valiku genereerimine random abil.


        String[] valikud = {"kivi", "paber", "käärid"};

        String arvutiOtsus = (valikud[new Random().nextInt(valikud.length)]);

        System.out.println(arvutiOtsus);
        return arvutiOtsus;


    }

    public static String inimeseValikuKüsimine() { //Inimeselt valiku saamine.
        System.out.println("Tee oma valik: kivi, paber või käärid?");
        Scanner in = new Scanner(System.in);
        String meieOtsus = in.nextLine();
        return meieOtsus;

    }

    public static String inimeseValikuKontroll() { // Kontroll, et inimese valik sobib.
        boolean kasSobib = false;
        String inimeseOtsus = null;
        while (kasSobib == false) { // Käib nii kaua kuni sobiv sisestus pandud.
            String inimeseOtsus2 = inimeseValikuKüsimine();
            if (!inimeseOtsus2.equalsIgnoreCase("kivi") && !inimeseOtsus2.equalsIgnoreCase("paber")
                    && !inimeseOtsus2.equalsIgnoreCase("käärid")) {
                System.out.println("See valik ei sobi. Palun proovi uuesti");

            } else {
                kasSobib = true;
                return inimeseOtsus2;
            }
        }
        return inimeseOtsus;
    }

    public static String inimeseValik() {
        String otsus = inimeseValikuKontroll();
        return otsus;
    }

    public static String tulemus() { //Mõlema valiku saamine ja sellest tulemuse väljastamine.

        String inimeseValik = KiviPaberKäärid.inimeseValik();
        String arvutiValik = KiviPaberKäärid.arvutiValik();
        String võitja = null;

        if (inimeseValik.equalsIgnoreCase(arvutiValik)) {
            võitja = "Viik";
            return võitja;
        } else if (inimeseValik.equalsIgnoreCase("kivi")) {
            if (arvutiValik.equalsIgnoreCase("paber")) {
                võitja = "Kaotus";
                return võitja;

            } else {
                võitja = "Võit";
                return võitja;
            }

        } else if (inimeseValik.equalsIgnoreCase("paber")) {
            if (arvutiValik.equalsIgnoreCase("käärid")) {
                võitja = "Kaotus";
                return võitja;

            } else {
                võitja = "Võit";
                return võitja;

            }

        } else if (inimeseValik.equalsIgnoreCase("käärid")) {
            if (arvutiValik.equalsIgnoreCase("kivi")) {
                võitja = "Kaotus";
                return võitja;


            } else {
                võitja = "Võit";
                return võitja;

            }
        }
        return võitja;


    }


    public static boolean mänguAlustamisKontroll() { //Meetod mängu alustamiseks.
        System.out.println("Tere tulemast.");
        System.out.println("Kas  oled valmis: Jah/Ei ?");

        Scanner in2 = new Scanner(System.in);
        String otsus = in2.nextLine();
        return otsus.equalsIgnoreCase("Jah");

    }

    public static boolean mängimiseKontroll() { //Meetod võtmesõna kontrollimiseks
        Scanner in2 = new Scanner(System.in);
        String otsus2 = in2.nextLine();
        return !otsus2.equalsIgnoreCase("Stop");


    }

}



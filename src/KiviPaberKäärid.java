import java.util.Random;
import java.util.Scanner;

public class KiviPaberKäärid {


    public static String arvutiValik() {
        String arvutiOtsus;

        double suvalinearv = Math.random();

        if (suvalinearv < 0.33) {

            arvutiOtsus = "kivi";
            System.out.println(arvutiOtsus);

        } else if (suvalinearv > 0.33 && suvalinearv < 0.66) {

            arvutiOtsus = "käärid";
            System.out.println(arvutiOtsus);
        } else {

            arvutiOtsus = "paber";
            System.out.println(arvutiOtsus);
        }
        return arvutiOtsus;


    }

    public static String inimeseValik() {
        System.out.println("Tee oma valik: kivi, paber või käärid?");
        Scanner in = new Scanner(System.in);
        String meieOtsus = in.nextLine();
        return meieOtsus;

    }

    public static String tulemus() {
        String inimeseValik = KiviPaberKäärid.inimeseValik();
        String arvutiValik = KiviPaberKäärid.arvutiValik();
        String võitja = "Pole";

        if (inimeseValik.equalsIgnoreCase(arvutiValik)) {
            võitja = "Viik";
            return võitja;
        } else if (inimeseValik.equalsIgnoreCase("kivi")) {
            if (arvutiValik.equalsIgnoreCase("paber")) {
                võitja = "Arvuti";
                return võitja;

            } else {
                võitja = "Sina";
                return võitja;
            }

        } else if (inimeseValik.equalsIgnoreCase("paber")) {
            if (arvutiValik.equalsIgnoreCase("käärid")) {
                võitja = "Arvuti";
                return võitja;

            } else {
                võitja = "Sina";
                return võitja;

            }

        } else if (inimeseValik.equalsIgnoreCase("käärid")) {
            if (arvutiValik.equalsIgnoreCase("kivi")) {
                võitja = "Arvuti";
                return võitja;


            } else {
                võitja = "Sina";
                return võitja;

            }
        }
        return võitja;


    }

}



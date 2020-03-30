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




}



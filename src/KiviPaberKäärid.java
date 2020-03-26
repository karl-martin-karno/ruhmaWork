import java.util.Random;
import java.util.Scanner;

public class KiviPaberKäärid {

    public static void arvutiValik() { //Lihtsalt see paika, et tuleks random valik. Peaks salvestama
        //arvatavasti Stringi, et saaks võrrelda meie valikud ja arvutit.

        double suvalinearv = Math.random();
        if (suvalinearv < 0.33)
            System.out.println("kivi");
        if (suvalinearv > 0.33 && suvalinearv < 0.66)
            System.out.println("käärid");
        if (suvalinearv > 0.66)

            System.out.println("paber");
    }

    public static void meievalik() {
        System.out.println("Tee oma valik: ");
        Scanner in = new Scanner(System.in);
        String meieOtsus = in.nextLine();

    }


}

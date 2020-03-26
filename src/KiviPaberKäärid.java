import java.util.Random;

public class KiviPaberKäärid {

    public static void arvutiValik(){ //Lihtsalt see paika, et tuleks random valik. Peaks salvestama
        //arvatavasti Stringi, et saaks võrrelda meie valikud ja arvutit.
        double suvalinearv = Math.random();
        if (suvalinearv<0.33)
            System.out.println("Kivi");
        if (suvalinearv>0.33&& suvalinearv<0.66)
            System.out.println("Käärid");
        if (suvalinearv>0.66)
            System.out.println("Paber");
    }
}

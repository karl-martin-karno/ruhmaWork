import java.util.Random;
import java.util.Scanner;

public class KiviPaberKäärid {

    public static String meieOtsus;
    public static String arvuti;

    public static void arvutiValik() { //Lihtsalt see paika, et tuleks random valik. Peaks salvestama
        //arvatavasti Stringi, et saaks võrrelda meie valikud ja arvutit.

        double suvalinearv = Math.random();

        if (suvalinearv < 0.33) {

            arvuti = "kivi";
            System.out.println(arvuti);
        }

        if (suvalinearv > 0.33 && suvalinearv < 0.66) {

            arvuti = "käärid";
            System.out.println(arvuti);
        }

        if (suvalinearv > 0.66) {

            arvuti = "paber";
            System.out.println(arvuti);
        }


    }

    public static void meievalik() {
        System.out.println("Tee oma valik: kivi, paber või käärid?");
        Scanner in = new Scanner(System.in);
        String meieOtsus = in.nextLine();

        }

        public static void tulemus(){
        if (meieOtsus.equals("kivi")
                &&arvuti.equals("kivi")){
            System.out.println("Viik");
        }
         if (meieOtsus.equals("paber")
                 &&arvuti.equals("paber")){
             System.out.println("Viik");
         }
         if (meieOtsus.equals("käärid")
                 &&arvuti.equals("käärid")){
             System.out.println("Viik");
         }
         if (meieOtsus.equals("kivi")
                 &&arvuti.equals("paber")){
             System.out.println("Arvuti võit");
         }
         if (meieOtsus.equals("kivi")
                 &&arvuti.equals("käärid")){
             System.out.println("Sinu võit");
         }
         if (meieOtsus.equals("paber")
                 &&arvuti.equals("käärid")){
             System.out.println("Arvuti võit");
         }
         if (meieOtsus.equals("paber")
                 &&arvuti.equals("kivi")){
             System.out.println("Sinu võit");
         }
         if (meieOtsus.equals("käärid")
                 &&arvuti.equals("paber")){
             System.out.println("Sinu võit");
         }
         if (meieOtsus.equals("käärid")
                 &&arvuti.equals("kivi")){
             System.out.println("Arvuti võit");
         }

     }
    }



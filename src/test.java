import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {

        Mängija mängija = new Mängija("Mängija");//Mängija loomine.
        mängija.mängijaKontroll();

        boolean alusta = false;
        while (alusta == false) {

            alusta = KiviPaberKäärid.mänguAlustamisKontroll(); // Kontrollitakse kas mängija on valmis.

        }
        boolean mängime = true; //Programm käib nii kaua kuni sisestatakse võtmesõna.
        while (mängime == true) {

            String tulemus = KiviPaberKäärid.tulemus();//Tulemuse saamine ja talletamine.

            if (tulemus == "Võit") {
                mängija.setVõite(mängija.getVõite() + 1);
            } else if (tulemus == "Kaotus") {
                mängija.setKaotusi(mängija.getKaotusi() + 1);
            } else {
                mängija.setViike(mängija.getViike() + 1);
            }


            System.out.println("Mängu tulemus: " + tulemus);
            System.out.println("Kui soovid lõpetada, kirjuta stop." +
                    " Kui soovid jätkata, vajuta suvalist klahvi");
            mängime = KiviPaberKäärid.mängimiseKontroll(); //Võtmesõna sisestamise kontroll.
        }

        mängija.kirjutaFaili();

    }
}

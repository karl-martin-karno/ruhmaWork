import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        Mängija mängija = new Mängija("Mängija");
        mängija.mängijaKontroll();
        boolean alusta = false;
        while (alusta == false) {

            alusta = KiviPaberKäärid.mänguAlustamisKontroll();

        }
        boolean mängime = true;
        while (mängime == true) {

            String tulemus = KiviPaberKäärid.tulemus();

            if (tulemus == "Võit") {
                mängija.setVõite(mängija.getVõite() + 1);
            } else if (tulemus == "Kaotus") {
                mängija.setKaotusi(mängija.getKaotusi() + 1);
            } else {
                mängija.setViike(mängija.getViike() + 1);
            }


            System.out.println("Mängu tulemus: " + tulemus);
            System.out.println("Kui soovid lõpetada, kirjuta stop. Kui jätkad, pane enter");
            mängime = KiviPaberKäärid.mängimiseKontroll();
        }

        mängija.kirjutaFaili();


    }
}

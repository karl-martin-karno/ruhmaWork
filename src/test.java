public class test {
    public static void main(String[] args) {
        boolean alusta = false;
        while (alusta == false) {

            alusta = KiviPaberKäärid.mänguAlustamisKontroll();
        }
        boolean mängime = true;
        while (mängime == true) {

            System.out.println("Võitja on  :" + KiviPaberKäärid.tulemus());
            System.out.println("Kui soovid lõpetada, kirjuta stop. Kui jätkad, pane enter");
            mängime = KiviPaberKäärid.mängimiseKontroll();
        }


    }
}

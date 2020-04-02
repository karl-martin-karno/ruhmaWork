import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mängija {
    private String nimi;
    private int võite;
    private int viike;
    private int kaotusi;

    // Konstruktor
    public Mängija(String nimi) {
        this.nimi = nimi;
        this.võite = 0;
        this.viike = 0;
        this.kaotusi = 0;
    }


    // Kontrollib, kas kasutaja on tekstifailis olemas.
    // Tagastab tõeväärtuse.
    public boolean kontrolliFailist() throws FileNotFoundException {

        boolean kontroll = false;

        // Vaatab, mis on mängija nimi ja selle paneb Mängija nimi muutujale.
        Scanner in = new Scanner(System.in);
        this.nimi = in.nextLine();
        java.io.File fail = new java.io.File("mängijad.txt");
        // Hakkab järjest rea kaupa faili läbi käima
        try (Scanner sc = new Scanner(fail, "UTF-8")) {

            while (sc.hasNextLine()) {

                String rida = sc.nextLine();
                String[] poolitatud = rida.split("; ");
                String mängija = poolitatud[0];

                // Kui leitakse nimi, siis pannakse võite, viike, kaotusi eelnevate tulemuste järgi.
                if (nimi.equalsIgnoreCase(mängija)) {
                    this.võite = Integer.parseInt(poolitatud[1]);
                    this.viike = Integer.parseInt(poolitatud[2]);
                    this.kaotusi = Integer.parseInt(poolitatud[3]);
                    kontroll = true;
                    break;

                }
            }
        }

        return kontroll;
    }

    // Kirjutab mängu lõpus faili uue tulemuse.
    public void kirjutaFaili() throws IOException {

        // Salvestan faili asukoha, failisisu ja mängija andmed.
        boolean onfailis = false;
        Path faili_koht = Paths.get("", "mängijad.txt");
        List<String> failisisu = new ArrayList<>(Files.readAllLines(faili_koht, StandardCharsets.UTF_8));
        String andmed = nimi + "; " + võite + "; " + viike + "; " + kaotusi;

        // Käib järjest faili läbi
        for (int i = 0; i < failisisu.size(); i++) {

            // Kui leiab rea, kus nimi on sama, mis mängija nimi, mis ta sisestas.
            if (failisisu.get(i).split("; ")[0].equalsIgnoreCase(nimi)) {

                // Uuendatakse antud rida uute andmetega.
                failisisu.set(i, andmed);
                onfailis = true;
                break;

            }
        }

        // Kui polnud failis, siis lisab faili lõppu uue kasutaja andmed.
        if (!onfailis) {
            failisisu.add(andmed); }

        // Kirjutab lõpliku failisisu mängijad.txt faili.
        Files.write(faili_koht, failisisu, StandardCharsets.UTF_8);

        // Väljastab mängija tulemuse.
        System.out.println(toString());
    }

    // Niinimetatud alus. Küsib nime ja kasutab kontrolliFailist. Kui oli failis, siis on võimalus tulemusi nullida.
    public void mängijaKontroll() throws FileNotFoundException {

        System.out.println("Sisesta oma nimi: ");

        if (kontrolliFailist()) {

            System.out.println("Kasutaja leitud.");
            System.out.println(toString());
            System.out.println("Kas soovid oma eelnevad tulemused nullida? (Jah/Ei)");
            Scanner in = new Scanner(System.in);

            if (in.nextLine().equalsIgnoreCase("Jah")) {

                setKaotusi(0);
                setViike(0);
                setVõite(0);

            }

        } else {

            System.out.println("Koostasin kasutaja.");

        }

    }


    public String getNimi() {
        return nimi;
    }

    public int getVõite() {
        return võite;
    }

    public void setVõite(int võite) {
        this.võite = võite;
    }

    public int getKaotusi() {
        return kaotusi;
    }

    public void setKaotusi(int kaotusi) {
        this.kaotusi = kaotusi;
    }

    public int getViike() {
        return viike;
    }

    public void setViike(int viike) {
        this.viike = viike;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mängija nimi: ");
        sb.append(nimi);
        sb.append(" | Võite: ").append(võite);
        sb.append(" | Viike: ").append(viike);
        sb.append(" | Kaotusi: ").append(kaotusi);
        return sb.toString();
    }
}



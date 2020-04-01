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
    private int kaotusi;

    public Mängija(String nimi) {
        this.nimi = nimi;
        this.võite = 0;
        this.kaotusi = 0;
    }

    public boolean kontrolliFailist() throws FileNotFoundException {
        boolean kontroll = false;
        Scanner in = new Scanner(System.in);
        this.nimi = in.nextLine();
        java.io.File fail = new java.io.File("mängijad.txt");
        try (Scanner sc = new Scanner(fail, "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] poolitatud = rida.split("; ");
                String mängija = poolitatud[0];
                this.võite = Integer.parseInt(poolitatud[1]);
                this.kaotusi = Integer.parseInt(poolitatud[2]);
                if (nimi.equalsIgnoreCase(mängija)) {
                    kontroll = true;
                    break;
                }
            }
        }
        return kontroll;
    }

    public void kirjutaFaili() throws IOException {
        Path faili_koht = Paths.get("", "mängijad.txt");
        List<String> failisisu = new ArrayList<>(Files.readAllLines(faili_koht, StandardCharsets.UTF_8));
        String andmed = nimi + "; " + võite + "; " + kaotusi;
        for (int i = 0; i < failisisu.size(); i++) {
            if (failisisu.get(i).split("; ")[0].equalsIgnoreCase(nimi)) {
                failisisu.set(i, andmed);
                break;
            }

        }

        failisisu.add(andmed);
        Files.write(faili_koht, failisisu, StandardCharsets.UTF_8);

        System.out.println(toString());
    }

    public void mängijaKontroll() throws FileNotFoundException {
        System.out.println("Sisesta oma nimi: ");
        if (kontrolliFailist()) {
            System.out.println(toString());
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


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mängija nimi: ");
        sb.append(nimi);
        sb.append(", võite: ").append(võite);
        sb.append(", kaotusi: ").append(kaotusi).append(".");
        return sb.toString();
    }
}



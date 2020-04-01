import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
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

    public boolean kontrolliFailist() {
        boolean kontroll = false;
        Scanner in = new Scanner(System.in);
        String nimi = in.nextLine();
        this.nimi = nimi;
        java.io.File fail = new java.io.File("C:\\Users\\Juss\\Desktop\\Tartu Ülikoool\\ruhmaWork\\src\\mängijad.txt");
        try (Scanner sc = new Scanner(fail, "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] poolitatud = rida.split("; ");
                String mängija = poolitatud[0];
                if (nimi == mängija) {
                    kontroll = true;
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return kontroll;
    }

    public void kirjutaFaili() throws IOException {
        Path faili_koht = Paths.get("C:\\Users\\Juss\\Desktop\\Tartu Ülikoool\\ruhmaWork\\src", "mängijad.txt");
        List<String> failisisu = new ArrayList<>(Files.readAllLines(faili_koht, StandardCharsets.UTF_8));

        for (int i = 0; i < failisisu.size(); i++) {
            if (failisisu.get(i).split("; ")[0].equals(nimi)) {
                failisisu.set(i, nimi + "; " + võite + "; " + kaotusi);
                break;
            }

        }

        Files.write(faili_koht, failisisu, StandardCharsets.UTF_8);
        String andmed = nimi + "; " + võite + "; " + kaotusi;
        Files.write(faili_koht, Collections.singleton(andmed), StandardCharsets.UTF_8);
        System.out.println(toString());
    }

    public void mängijaKontroll() {
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
        final StringBuilder sb = new StringBuilder("Mängija{");
        sb.append("nimi='").append(nimi).append('\'');
        sb.append(", võite=").append(võite);
        sb.append(", kaotusi=").append(kaotusi);
        sb.append('}');
        return sb.toString();
    }
}



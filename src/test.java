public class test {
    public static void main(String[] args) {

        String inimeseValik = KiviPaberKäärid.inimeseValik();
        String arvutiValik = KiviPaberKäärid.arvutiValik();

        if (inimeseValik.equalsIgnoreCase(arvutiValik)) {
            System.out.println("Viik");
        } else if (inimeseValik.equalsIgnoreCase("kivi")) {
            if (arvutiValik.equalsIgnoreCase("paber")) {
                System.out.println("Arvuti võit");
            } else {

            }

        } else if (inimeseValik.equalsIgnoreCase("paber")) {
            if (arvutiValik.equalsIgnoreCase("käärid")) {
                System.out.println("Arvuti võit");
            } else {
                System.out.println("Sinu võit");
            }

        } else if (inimeseValik.equalsIgnoreCase("käärid")) {
            if (arvutiValik.equalsIgnoreCase("kivi")) {
                System.out.println("Arvuti võit");

            } else {
                System.out.println("Sinu võit");
            }

        }


    }
}

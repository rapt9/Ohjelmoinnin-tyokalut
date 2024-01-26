public class Pisin {

    public static void main(String[] args) {
        String pisin = "";
        if (args.length == 0) {
            System.out.println("Ei parametreja");
            System.exit(0);
        }
        for (String parametri : args) {
            if (parametri.length() > pisin.length()) {
                pisin = parametri;
            }
        }
        System.out.println("Pisin parametri: " + pisin);
    }

}
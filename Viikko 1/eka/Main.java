import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna nimi: ");
        String nimi = lukija.nextLine();
        System.out.println("moikka, " + nimi);
        System.out.println("testi, " + nimi);
    }
}
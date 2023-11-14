import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DbSql db = new DbSql();
        System.out.println(db.studerendeOplysninger(1));

        System.out.println("1. opret studerende");
        System.out.println("2. opret fag");
        System.out.println("3. tildmeld studerende til fag");
        System.out.println("4. frameld studerende fra fag");
        System.out.println("5. Udskriv alle studerende");
        System.out.println("6. Udskriv alle fag");
        System.out.println("7. Søg oplysninger om en studerende");
        System.out.println("8. Søg oplysninger om et fag");
        System.out.println("Indtast dit valg:");

        int valg = scanner.nextInt();

        switch (valg) {
            case 1:
                System.out.println("Indtast stdnr, fnavn, enavn, adresse, postnr, mobil og klasse: ");
                int stdnr = scanner.nextInt();
                String fnavn = scanner.next();
                String enavn = scanner.next();
                String adresse = scanner.next();
                adresse+=" " + scanner.next();
                String postnr = scanner.next();
                String mobil = scanner.next();
                String klasse = scanner.next();
                db.opretStuderende(stdnr,fnavn,enavn,adresse,postnr,mobil,klasse);
                System.out.println("Studerende oprettet!");
                break;

            case 2:
                



            case 3:

            case 4:

            case 5:

            case 6:

            case 7:
                System.out.println("Indtast det stdnr du vil søge oplysninger om: ");
                System.out.println(db.studerendeOplysninger(scanner.nextInt()));
                break;

            case 8:

        }


    }

}